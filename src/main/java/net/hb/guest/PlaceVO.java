package net.hb.guest;

import java.util.Date;

public class PlaceVO {
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getGlat() {
		return Glat;
	}
	public void setGlat(String glat) {
		Glat = glat;
	}
	public String getGlon() {
		return Glon;
	}
	public void setGlon(String glon) {
		Glon = glon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getGdata() {
		return Gdata;
	}
	public void setGdata(String gdata) {
		Gdata = gdata;
	}
	int code=0, row = 0;
	   String title="";
	   public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	   String name="",  place="", Glat="",Glon="", email="";
	   String wdate="";
	   String Gdata="";  
	   
	
	

	

	   
	   //getter가져오는것이니까 void 대신 리턴값
	   //setter(변경내용){this.필드=매개인자;}
	   
}
