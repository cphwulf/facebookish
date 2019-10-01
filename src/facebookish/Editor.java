package facebookish;
public class Editor extends User{ 

	public Editor(String email, String userName) {
		super(email, userName);
	}

	public boolean removePostFromPage(Post p) {
		return true;
	}
	
	
}
