package facebookish;
import facebookish.helperclass.GetIdFactory;
import java.util.ArrayList;
public class Page {
	private int id;
	private String title;
	private ArrayList<Post> pagePosts;

	public Page(String title) {
		this.id = GetIdFactory.getNextPageId();
		this.title = title;
		this.pagePosts = new ArrayList<>();
	}
	
	public void addPost(Post p) {
		pagePosts.add(p);
	}

	public String toString() {
		String msg = "";
		for(Post p: pagePosts) {
			msg += "Title: " + p.title + "\n";
			msg += "Content:" + p.content + "\n";
		}
		System.out.println(msg);
		return msg;
	}
	
}
