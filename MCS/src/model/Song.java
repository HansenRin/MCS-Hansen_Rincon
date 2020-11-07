package model;
public class Song{
	//attributes
	private String title;
	private String releaseDate;
	private String artistName;
	private int duration;

	//relations
	private Genre genre;

	//methods
	public Song(String title, String releaseDate, String artistName, int duration, String genre){
		this.title = title;
		this.releaseDate = releaseDate;
		this.artistName = artistName;
		this.duration = duration;
		this.genre = Genre.valueOf(genre.toUpperCase());
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getArtistName(){
		return artistName;
	}

	public void setArtistName(String artistName){
		this.artistName = artistName;
	}

	public int getDuration(){
		return duration;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public Genre getGenre(){
		return genre;
	}

	public void setGenre(String genre){
		this.genre = Genre.valueOf(genre.toUpperCase());
	}
}