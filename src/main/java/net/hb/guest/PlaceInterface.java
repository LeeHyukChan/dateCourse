package net.hb.guest;

public interface PlaceInterface {
	public int PlaceInsert(GuestVO vo);
	public int PlaceCountAll();
	public int PlaceCountAll(String search);
	public void PlaceDelete(String data);
}//end
