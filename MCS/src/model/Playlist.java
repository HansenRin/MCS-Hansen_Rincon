package model;

public abstract class Playlist{

	//constant
	private static int MAX_SONGS = 30;
	
	//attributes
	private String name;
	private int duration;

	//relations
	private Song[] songs;

	//methods

	/*se genera una playlist con su nombre
	*/
	public Playlist(String name){
		this.name = name;
		songs = new Song[MAX_SONGS];
	}

	/*se calcula la duracion de la playlist
	*/
	public int plDuration(){
		int duration = 0;
		for (int i=0; i<songs.length; i++) {
			duration += songs[i].getDuration();
		}

		return duration;
	}

	/*se le otorgan generos al playlist
	*/
	public String plGenre(){
		String genres = null;

		for (int i=0; i<songs.length; i++) {
			
			genres+=songs[i].getGenre();
		}

		if (genres == null)
		genres = "DESCONOCIDO";

		return genres;
	}


	/*getters y setters de la clase
	*/
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Song[] getSongs(){
		return songs;
	}

	public void setSongs(Song[] songs){
		this.songs = songs;		
	}

	public int getPlDuration(){
		return plDuration();
	}

	public String getPlGenre(){
		return plGenre();
	}
}