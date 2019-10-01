package facebookish;
import facebookish.helperclass.GetIdFactory;
public class User {
	private final int userId;
	private final String email;
	private final String userName;

	public User(String email, String userName) {
		this.userId = GetIdFactory.getNextUserId();
		this.email = email;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}

	public void createPost(String title, String content, Page p) {
		Post newPost = new Post("test","bare en test");
		addPost(newPost, p);
	}

	public void addPost(Post p,Page m) {
		m.addPost(p);
	}

}
