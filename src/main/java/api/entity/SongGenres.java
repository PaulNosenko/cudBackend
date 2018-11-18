package api.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SongGenres implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Song song;
    
    @ManyToOne
    private Genre genre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song artist) {
		this.song = artist;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public SongGenres(Long id, Song artist, Genre genre) {
		super();
		this.id = id;
		this.song = artist;
		this.genre = genre;
	}

    public SongGenres() {}
    
}