package mybatis;

import java.util.ArrayList;

public interface IAndroidDAO {
	//mapper id이름과 동일해야햄
	public ArrayList<MemberVO> memberList();
	
	public MemberVO memberLogin(MemberVO memberVO);
}
