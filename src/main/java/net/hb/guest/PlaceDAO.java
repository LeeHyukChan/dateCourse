package net.hb.guest;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import net.hb.common.DB;

public class PlaceDAO extends PlaceGlobal implements PlaceInterface {
	public PlaceDAO() {
		try {
			CN = DB.getConnection();
			ST = CN.createStatement();
		}catch(Exception ex){}
	}//GuestDAO
	public List<PlaceVO> testSelectAll(){
		List<PlaceVO> alist = new ArrayList<PlaceVO>();
		try {
			msg="select * from test";
			RS = ST.executeQuery(msg);
			  while(RS.next()==true){
				PlaceVO vo = new PlaceVO();
				vo.setTitle(RS.getString("title"));
				vo.setGlat(RS.getString("frow")); 
				vo.setGlon( RS.getString("fcol")); 
				alist.add(vo);
			  }//while end
		}
		catch(Exception ex) {};
		return alist;
	}//end
	
	
	public List<PlaceVO> festSelectAll(){
		List<PlaceVO> alist = new ArrayList<PlaceVO>();
		try {
			msg="select * from fest";
			RS = ST.executeQuery(msg);
			  while(RS.next()==true){
				PlaceVO vo = new PlaceVO();
				vo.setCode(RS.getInt("fcode"));
				vo.setName(RS.getString("fname"));
				vo.setGlat(RS.getString("flati")); 
				vo.setGlon( RS.getString("flong"));
				vo.setPlace(RS.getString("fplace"));
				alist.add(vo);
			  }//while end
		}
		catch(Exception ex) {};
		return alist;
	}//end
	
	public List<PlaceVO> festSelectAll(int start,int end){
		List<PlaceVO> alist = new ArrayList<PlaceVO>();
		try {
			msg="select * from (select rownum rn ,fcode,fname,fplace,fdate,flong,flati from fest f ) where rn between " +start+" and " + end;
			RS = ST.executeQuery(msg);
			  while(RS.next()==true){
				PlaceVO vo = new PlaceVO();
				vo.setCode(RS.getInt("fcode"));
				vo.setName(RS.getString("fname"));
				vo.setGlat(RS.getString("flati")); 
				vo.setGlon( RS.getString("flong"));
				vo.setPlace(RS.getString("fplace"));
				alist.add(vo);
			  }//while end
		}
		catch(Exception ex) {};
		return alist;
	}//end
	
	
	public List<PlaceVO> restSelectAll(){
		List<PlaceVO> alist = new ArrayList<PlaceVO>();
		try {
			msg="select * from rest";
			RS = ST.executeQuery(msg);
			  while(RS.next()==true){
				PlaceVO vo = new PlaceVO();
				vo.setCode(RS.getInt("rcode"));
				vo.setName(RS.getString("rname"));
				vo.setGlat(RS.getString("rlati")); 
				vo.setGlon( RS.getString("rlong"));
				vo.setPlace(RS.getString("rplace"));
				alist.add(vo);
			  }//while end
		}
		catch(Exception ex) {};
		return alist;
	}//end
	
	public List<PlaceVO> restSelectAll(int start,int end){
		List<PlaceVO> alist = new ArrayList<PlaceVO>();
		try {
			msg="select * from (select rownum rn ,rcode,rname,rplace,rtype,rlong,rlati from rest f ) where rn between " +start+" and " + end;
			RS = ST.executeQuery(msg);
			  while(RS.next()==true){
				PlaceVO vo = new PlaceVO();
				vo.setCode(RS.getInt("rcode"));
				vo.setName(RS.getString("rname"));
				vo.setGlat(RS.getString("rlati")); 
				vo.setGlon( RS.getString("rlong"));
				vo.setPlace(RS.getString("rplace"));
				alist.add(vo);
			  }//while end
		}
		catch(Exception ex) {};
		return alist;
	}//end
	
	public List<PlaceVO> festSearch(String field,String key){
		List<PlaceVO> alist = new ArrayList<PlaceVO>();
		try {
			
			msg="select * from fest where "+field+" like '%"+key+"%' ";
			RS = ST.executeQuery(msg);
			  while(RS.next()==true){
				PlaceVO vo = new PlaceVO();
				vo.setCode(RS.getInt("fcode"));
				vo.setName(RS.getString("fname"));
				vo.setGlat(RS.getString("flati")); 
				vo.setGlon( RS.getString("flong"));
				vo.setPlace(RS.getString("fplace"));
				alist.add(vo);
			  }//while end
		}
		catch(Exception ex) {};
		return alist;
	}//end

	public int courseInsert(String name, String rest, String fest) {
		// TODO Auto-generated method stub
		try {
			msg = "insert into course values(?,?,?)" ;
		    PST = CN.prepareStatement(msg);
		    PST.setString(1, name);
		    PST.setString(2, rest);
		    PST.setString(3, fest);
		    OK=PST.executeUpdate();//저장성공처리구현
		    System.out.println("course테이블 저장성공"); 
		   
		}catch(Exception ex) {}
		return OK;
	}
	public int courseDelete(String name, String rest, String fest) {
		// TODO Auto-generated method stub
		try {
			msg = "delete from course where name= ? and rest = ? and fest = ? " ;
		    PST = CN.prepareStatement(msg);
		    PST.setString(1, name);
		    PST.setString(2, rest);
		    PST.setString(3, fest);
		    OK=PST.executeUpdate();//저장성공처리구현
		    System.out.println("course테이블 제거 성공"); 
		   
		}catch(Exception ex) {}
		return OK;
	}
	
	
	
	public int PlaceInsert(GuestVO vo)
	{
		return 1;
	};
	public int PlaceCountAll()
	{
		return 1;
	};
	public int PlaceCountAll(String search)
	{
		return 1;
	};
	public void PlaceDelete(String data)
	{
		
	};
	
	
	
	
	
	

	

}//GuestDAO class END
