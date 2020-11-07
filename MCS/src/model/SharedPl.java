package model;

public abstract class SharedPl extends Playlist{

	//constant
	public final static int MAX_PL_SHARES = 5;
	public final static int MAX_SONG_SHARES = 30;

	//attributes
	private User[] users;

	public SharedPl(String name, User[] users){
		super(name);
		this.users = users;
	}

	public User getUsers(){
		return users
	}	

	public void setUsers(User users){
		this.users = users;
	}

}