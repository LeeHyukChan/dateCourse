package net.hb.guest;

public interface GuestInterface {
   public int  guestInsert(GuestVO vo);
   public int  guestCountAll( );
   public int  guestCountAll( String search);
   public void guestDelete(String data);
   //전체출력,한건상세,한건삭제,한건수정처리 메소드 선언은 일단 생략함
} //end
