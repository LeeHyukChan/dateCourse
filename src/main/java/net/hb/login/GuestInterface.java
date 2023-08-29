package net.hb.login;

public interface GuestInterface {
   public int  LoginInsert(LoginVO vo);
   public int  LoginCountAll( );
   public int  LoginCountAll( String search);
   public void Login(String data);
   //전체출력,한건상세,한건삭제,한건수정처리 메소드 선언은 일단 생략함
int JoinIdCheck(String data);
int Login(String id, String password);
int Insert(LoginVO vo);
void Login(LoginVO vo);
} //end
