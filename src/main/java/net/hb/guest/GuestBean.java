package net.hb.guest;

import java.util.Date;

public class GuestBean {
	int code=0, pay=0, hit=0,  rn=0, row=0;
	String name="",  title="", email="";
	Date wdate=null;
	
	//시작행번호 Gtotal이용 역순, 댓글갯수 Rrn
	int Gnumer, Rnumer , Rrn;

	public int getCode() {	return code;	}
	public void setCode(int code) {	this.code = code;	}
	public int getPay() {	return pay;	}
	public void setPay(int pay) {	this.pay = pay;	}
	public int getHit() {	return hit; }
	public void setHit(int hit) {	this.hit = hit;	}
	public int getRn() {	return rn;	}
	public void setRn(int rn) {	this.rn = rn;	}
	public int getRow() {	return row;	}
	public void setRow(int row) {	this.row = row;	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public String getTitle() {	return title;	}
	public void setTitle(String title) {	this.title = title;	}
	public String getEmail() {	return email;	}
	public void setEmail(String email) {	this.email = email;	}
	public Date getWdate() {	return wdate;	}
	public void setWdate(Date wdate) {	this.wdate = wdate;	}
	public int getGnumer() {return Gnumer;	}
	public void setGnumer(int gnumer) {	Gnumer = gnumer;	}
	public int getRnumer() {return Rnumer;	}
	public void setRnumer(int rnumer) {	Rnumer = rnumer;	}
	public int getRrn() {return Rrn;	}
	public void setRrn(int rrn) {Rrn = rrn;	}
	
	//getter가져오는것이니까 void대신 리턴값
	//setter(변경내용){ this.필드=매개인자; }
	
	
}//GuestBean class END
