package model;
public class MCS{
	//constantes
	private static int MAX_USERS = 10;
	private static int MAX_PLAYLISTS = 20;
	//atributos
	private int numUsers;
	private int numSongs;
	private int numPlaylists;

	//relations
	private User[] users;
	private Song[] songs;
	private Playlist[] playlists;

	//metodos
	public MCS(){
		users = new User[MAX_USERS];
	}

	public String addUser(String name, String password, String nickname, int age){
		String message = "limite de usuarios alcanzado\nno se puede crear usuario";
		boolean add = false;
		for (int i = 0; i<users.length && !add; i++) {
			if (users[i]==null) {
				users[i] = new User(name, password, nickname, age);
				add = true;
				message = "Se ha creado el usuario";
			}
		}
	}

	public String openUser(){
		String message = "no se ha podido iniciar sesion";
		return message;
	}

	/*se le otorga una categoria al usuario
	*/
	public void userCategory(){
		if (users.length>0) {
			for (int i=0; i<users.length; i++) {
				if (sharedSongs()>=3) {
				users[i].setCategory("LITTLE_CONTRIBUTOR");
				}
				if (sharedSongs()>=10) {
				users[i].setCategory("MILD_CONTRIBUTOR");
				} 
				if (sharedSongs()>=30) {
				users[i].setCategory("STAR_CONTRIBUTOR");
				}
			}
		}
	}

	/*cuenta la cantidad de canciones que ha compartido el usuario
	*/
	public int sharedSongs(){
		int sharedSongs = 0;
		
		for (int i=0; i<playlists.length; i++) {
			if (playlists[i] instanceof SharedPl||playlists[i] instanceof PrivatePl) {
				shared Songs = playlists[i].getSongs().length;
			}	
		}
	return sharedSongs;
	}
}
