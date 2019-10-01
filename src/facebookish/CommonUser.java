package facebookish;
public class CommonUser extends  User {

	public CommonUser(String email, String userName) {
		super(email, userName);
	}

	@Override
	public void createPost(String title, String content, Page p) {
		Post newPost = new Post(title, content);
		addPost(newPost, p);
	}
	@Override
	public void addPost(Post p,Page m) {
		m.addPost(p);
	}
	
}
