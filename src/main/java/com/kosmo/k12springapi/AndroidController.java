package com.kosmo.k12springapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mybatis.IAndroidDAO;
import mybatis.MemberVO;

@Controller
public class AndroidController {
	
	//Mybatis 사용을 위한 자동주입
	@Autowired
	private SqlSession sqlSession;
	
	//매개변수가 필요없이 회원리스트 전체를 JSONObject로 반환
	@RequestMapping("/android/memberObject.do")
	@ResponseBody//반환하려면
	public Map<String, Object> memberObject(HttpServletRequest req){//ArrayList<MemberVO>
		//JSONObject로 반환할 경우
		Map<String, Object> map = new HashMap<String, Object>();
		
		//JSONArray로 반환할 경우
		ArrayList<MemberVO> lists = sqlSession.getMapper(IAndroidDAO.class).memberList();
		
		map.put("memberList", lists);
		
		return map; //반환타입 Map으로 변경. JSONObject타입. key와 value 있기에
		//객체로 내리고싶으면 map을 쓰라규
	}
	
	
	//JSONArray로 데이터  반환
	@RequestMapping("/android/memberList.do")
	@ResponseBody
	public ArrayList<MemberVO> memberList(HttpServletRequest req){
		
		//JSONArray로 반환할 경우
		ArrayList<MemberVO> lists = sqlSession.getMapper(IAndroidDAO.class).memberList();
				
		return lists; //JSONArray 타입
		//배열로 뿌리고 싶으면 ArrayList
	}
}
