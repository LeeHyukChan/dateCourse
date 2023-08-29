package net.hb.login;

import java.util.ArrayList;
import java.util.List;

import net.hb.common.DB;
import net.hb.guest.GuestVO;
public class FollowDAO extends LoginGlobal implements GuestInterface {
	
  public FollowDAO() {
	 try {
		CN=DB.getConnection();
		ST=CN.createStatement();
	 }catch(Exception ex) { }
   }//GuestDAO constructor
	
  public int FollowInsert(String name, String following) {
	  try {
	   msg = "INSERT INTO follow VALUES (?, ?)" ;
	   PST = CN.prepareStatement(msg);
	   PST.setString(1, name);
	   PST.setString(2, following);
	   OK=PST.executeUpdate();
	  }catch(Exception ex) { }
	  return OK;
  }//end
  public List<FollowVO> FollowSelectAll(String name) {
	  List<FollowVO> alist = new ArrayList<FollowVO>();
	  try {
	   msg = "select * from follow where name ='" + name+"'";
	   RS = ST.executeQuery(msg);
		  while(RS.next()==true){
			FollowVO vo = new FollowVO();
			vo.setName( RS.getString("name")); 
			vo.setFollowing( RS.getString("following")); 
			alist.add(vo);
		  }//while end
	}
	catch(Exception ex) {};
	return alist;
  }//end
  public int FollowDelete(String name, String following) {
	  try {
	   msg = "delete from follow where name = ? and following = ? " ;
	   PST = CN.prepareStatement(msg);
	   PST.setString(1, name);
	   PST.setString(2, following);
	   OK=PST.executeUpdate();
	  }catch(Exception ex) { }
	  return OK;
  }//end

@Override


  public int JoinIdCheck(String data) {
	  try {
		  msg = "select count(*) as cnt from users where id = '" +data + "'";
		  RS=ST.executeQuery(msg);
		  
		  if(RS.next()==true){ Gtotal=RS.getInt("cnt"); }  
	  }catch(Exception ex) {
		
	  }	
	  return Gtotal;
	  }//end     

@Override
public int LoginCountAll() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int LoginCountAll(String search) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void Login(String data) {
	// TODO Auto-generated method stub
	
}

@Override
public int Login(String id, String password) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int Insert(LoginVO vo) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void Login(LoginVO vo) {
	// TODO Auto-generated method stub
	
}

@Override
public int LoginInsert(LoginVO vo) {
	// TODO Auto-generated method stub
	return 0;
}

}

//GuestDAO class END
