package facebookish;
public class FaceBookIsh {
	public static void main(String[] args) {
		
		Admin ourAdmin = new Admin("test@hotmail.com" , "test");
		User m = ourAdmin.addUser();
		User k = ourAdmin.addUser();
		Page myPage = new Page("stuff");
		k.createPost("Kedeligt","Tv idag dur ikke mere", myPage);
		k.createPost("Godt","Radio idag dur ikke mere", myPage);
		myPage.toString();

		int userId = ourAdmin.getUserId();
	}
	
}
