package model;

public abstract class PrivatePl extends Playlist{

	private User owner;

	public PrivatePl(String name, User owner){
		super(name);
		this.owner = owner;
	}

	public User getOwner(){
		return owner
	}	

	public void setOwner(User owner){
		this.owner = owner;
	}	
}