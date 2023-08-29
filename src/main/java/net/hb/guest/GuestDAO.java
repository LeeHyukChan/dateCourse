package net.hb.guest;

import net.hb.common.DB;
import java.util.List;
import java.util.ArrayList;

public class GuestDAO extends GuestGlobal implements GuestInterface {
  public GuestDAO() {
	 try {
		CN=DB.getConnection();
		ST=CN.createStatement();
	 }catch(Exception ex) { }
   }//GuestDAO constructor
	
  public int guestInsert(GuestVO vo) {
	  try {
	   msg = "insert into guest values(?, ?, ?, sysdate, ?, 0, ?)" ;
	   PST = CN.prepareStatement(msg);
	     PST.setInt(1, vo.getCode());
	     PST.setString(2, vo.getName());
	     PST.setString(3, vo.getTitle());
	     PST.setInt(4, vo.getPay());
	     PST.setString(5, vo.getEmail());
	     OK=PST.executeUpdate();//ok
	     System.out.println("guest테이블 저장성공");    
	  }catch(Exception ex) { }
	  return OK;
  }//end

  public List<GuestVO> guestSelectAll(){
	List<GuestVO> alist = new ArrayList<GuestVO>();
	try {
	 msg = "select rownum rn, g.*  from guest g  " ;	
	 RS = ST.executeQuery(msg);
	   while(RS.next()==true){
		  GuestVO vo = new GuestVO();
		  vo.setRn(RS.getInt("rn")); 
		  vo.setCode(RS.getInt("code"));  
		  vo.setName(RS.getString("name"));
		  vo.setTitle(RS.getString("title"));
		  vo.setWdate(RS.getDate("wdate"));
		  vo.setPay(RS.getInt("pay"));
		  vo.setHit(RS.getInt("hit"));
		  vo.setEmail(RS.getString("email"));
		  alist.add(vo); //잊지마셔요
	   }//while end
	}catch(Exception ex) { }
	return alist;
  }//end
  
  public List<GuestVO> guestSelectAll(int start, int end){ //시작행, 끝행 
	List<GuestVO> alist = new ArrayList<GuestVO>();
	try {
	  String a ="select * from ( ";
	  String b =" select rownum rn, code,name,title,wdate,pay,hit,email from guest ";
	  String y = " ";
	  String c =" ) where rn between  " + start + " and "  + end;	
	  msg = a+b+y+c ; 
	  
	 //원본주석 msg = "select rownum rn, g.* from guest g  " ; 	
	 RS = ST.executeQuery(msg);
	   while(RS.next()==true){
		  GuestVO vo = new GuestVO();
		  vo.setRn(RS.getInt("rn")); 
		  vo.setCode(RS.getInt("code"));  
		  vo.setName(RS.getString("name"));
		  vo.setTitle(RS.getString("title"));
		  vo.setWdate(RS.getDate("wdate"));
		  vo.setPay(RS.getInt("pay"));
		  vo.setHit(RS.getInt("hit"));
		  vo.setEmail(RS.getString("email"));
		  alist.add(vo); //잊지마셔요
	   }//while end
	}catch(Exception ex) { }
	return alist;
  }//end
  
  public List<GuestVO> guestSelectAll(int start, int end, String skey, String sval){ //시작행,끝행,검색필드,검색어 
		List<GuestVO> alist = new ArrayList<GuestVO>();
		try {
		  String a ="select * from ( ";
		  String b =" select rownum rn, code,name,title, wdate,pay,hit,email from  ";
		  String y = " ( select * from guest where "+ skey + " like '%" + sval + "%'  order by code ) ";
		  String c =" ) where rn between  " + start + " and "  + end;	
		  msg = a+b+y+c ; 
		  
		 //원본주석 msg = "select rownum rn, g.* from guest g  " ; 	
		 RS = ST.executeQuery(msg);
		   while(RS.next()==true){
			  GuestVO vo = new GuestVO();
			  vo.setRn(RS.getInt("rn")); 
			  vo.setCode(RS.getInt("code"));  
			  vo.setName(RS.getString("name"));
			  vo.setTitle(RS.getString("title"));
			  vo.setWdate(RS.getDate("wdate"));
			  vo.setPay(RS.getInt("pay"));
			  vo.setHit(RS.getInt("hit"));
			  vo.setEmail(RS.getString("email"));
			  alist.add(vo); //잊지마셔요
		   }//while end
		}catch(Exception ex) { }
		return alist;
	  }//end

  public int guestCountAll() {
	try {
	 msg="select count(*) as cnt from guest ";  
	 RS=ST.executeQuery(msg);
	 if(RS.next()==true){ Gtotal=RS.getInt("cnt"); }  
	}catch(Exception ex) { }	
	return Gtotal;
  }//end     
  
  public int guestCountAll( String search) {
	 try {
	  //msg="select count(*) as cnt from guest where title like '%p%' "; 
	  msg="select count(*) as cnt from guest where title like '%"+ search +"%' "; 
	  RS=ST.executeQuery(msg);
	  if(RS.next()==true){ Gtotal=RS.getInt("cnt"); }   
	 }catch(Exception ex) { }	
	return Gtotal;
  }//end
  
  public GuestVO guestDetail(String data){
	GuestVO dto = new GuestVO();
	 try {
	   msg = "select *  from guest  where code = ? " ;
	   PST = CN.prepareStatement(msg);
	         PST.setInt(1, Integer.parseInt(data));
	   RS = PST.executeQuery();
		 if(RS.next()==true){ 
			 dto.setCode(RS.getInt("code"));  
			 dto.setName(RS.getString("name"));
			 dto.setTitle(RS.getString("title"));
			 dto.setWdate(RS.getDate("wdate"));
			 dto.setPay(RS.getInt("pay"));
			 dto.setHit(RS.getInt("hit"));
			 dto.setEmail(RS.getString("email"));
		  }//if end
	 }catch(Exception ex) { }
	return dto;
  }//end 
  
  
  public void guestDelete(String data) {
	try {
	 msg="delete from guest where code = " + data;
	 OK = ST.executeUpdate(msg);
	 if(OK>0) { System.out.println(data + " delete OK sucess");}
	 else { System.out.println(data + " delete failed"); }
	}catch(Exception ex) { System.out.println(ex); }	
  }//end

  
  
}//GuestDAO class END








