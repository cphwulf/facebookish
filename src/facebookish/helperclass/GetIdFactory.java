package facebookish.helperclass;
public class GetIdFactory {
	private static int id;
	public static int getNextUserId() {
		return id++;
	}
	public static int getNextPostId() {
		return 10000 + id++;
	}
	public static int getNextPageId() {
		return 1000 + id++;
	}
	
}
