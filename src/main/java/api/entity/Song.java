package api.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Song implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "link")
    private String link;
    
    @ManyToOne
    private Album album;
    
    @OneToMany(mappedBy = "song")
    @JsonIgnore
    List<SongGenres> genres = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<SongGenres> getGenres() {
		return genres;
	}

	public void setGenres(List<SongGenres> genres) {
		this.genres = genres;
	}

	

	public Song(Long id, String name, String image, String link, Album album) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.link = link;
		this.album = album;
	}

	public Song() {
		
	}
    
    
    
}
