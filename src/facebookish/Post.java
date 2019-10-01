package facebookish;
import facebookish.helperclass.GetIdFactory;
public class Post {
	int postId;
	String title;
	String content;

	public Post(String title, String content) {
		this.postId = GetIdFactory.getNextPostId();
		this.title = title;
		this.content = content;
	}

	
	
}
