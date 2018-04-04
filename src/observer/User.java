package observer;

import java.util.HashMap;

public class User {
	private String name;
	private Publisher updates;
	private StreamFrame stream;
	private HashMap<User,Subscriber> friends;
	
	public User(String name){
		this.name = name;
		this.updates = new Publisher(name);
		this.stream = new StreamFrame(name);
		this.friends = new HashMap<>();
	}
	
	public void addFollower(User newFriend){
		Subscriber sub = new Subscriber(updates, newFriend.getStream());
		updates.addObserver(sub);
		friends.put(newFriend, sub);
	}
	
	public void removeFollower(User exFriend){
		if (friends.containsKey(exFriend)) {
			Subscriber sub = friends.get(exFriend);
			friends.remove(exFriend);
			updates.deleteObserver(sub);
		}
	}
	
	public void setStatus(String newStatus){
		updates.setStatus(newStatus);
	}
	
	public Publisher getUpdates(){
		return updates;
	}
	
	public String getName(){
		return name;
	}
	
	public StreamFrame getStream(){
		return stream;
	}
}
