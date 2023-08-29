package net.hb.guest;

import java.sql.Statement;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlaceGlobal {
	   Connection CN = null;
	   Statement ST = null;
	   PreparedStatement PST = null;
	   ResultSet RS = null ;
	   String msg = "";
	   int OK = 0;
	   
	   int Gcode=0, Gpay=0, Ghit=0,  Grn=0, Grow=0;
	   String Gname="",  Gtitle="", Gemail="";
	   Date Gwdate=null;
	   int Gtotal = 0 ;
	   
	   String pnum ; 
	   int pageNUM, pagecount; 
	   
	   int start, end;	
	   int startpage, endpage; 
			   
	   int temp;
	   
	   String sqry="", skey="", sval="" ;
	   String returnpage="";
}
