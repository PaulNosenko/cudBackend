package api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import api.entity.Album;
import api.entity.Artist;
import api.entity.Genre;
import api.entity.Song;
import api.entity.SongGenres;
import api.repository.AlbumRepository;
import api.repository.ArtistRepository;
import api.repository.GenreRepository;
import api.repository.SongGenresRepository;
import api.repository.SongRepository;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
public class RestController {

	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private SongRepository songRepo;

	@Autowired
	private SongGenresRepository sgRepo;

	@Autowired
	private GenreRepository genreRepo;
	
	@Autowired
	private AlbumRepository albumRepo;
	
	@GetMapping(value="/artists")
	public List<Artist> findArtists(){
		return artistRepo.findAll();
	}
	
	@GetMapping("/albumsOf/{name}")
	public List<Album> albumsOfArtist(@PathVariable String name){
		return albumRepo.findByArtistName(name);
	}

	@GetMapping(value="/albums")
	public List<Album> findAlbums(){
		return albumRepo.findAll();
	}

	@GetMapping(value="/songs")
	public List<Song> findSongs(){
		return songRepo.findAll();
	}
	
	@GetMapping("/songs/{name}")
	public Song one(@PathVariable String name) {
		return songRepo.findByName(name);
	}
	
	@GetMapping("/songsInAlbum/{name}")
	public List<Song> songsInAlbum(@PathVariable String name){
		return songRepo.findByAlbumName(name);
	}
	
	@GetMapping("/songsOfGenre/{genreid}")
	public List<Song> songsOfGenre(@PathVariable long genreid){
		return songRepo.findByGenresGenreId(genreid);
	}

	@GetMapping("/genresOfSong/{songid}")
	public List<String> genresOfSong(@PathVariable long songid){
		List<String> filtered = new ArrayList<>();
		for(SongGenres obj : sgRepo.findAll()){
		    if(obj.getSong().getId() == songid){
		        filtered.add(obj.getGenre().getName());
		    }
		}
		return filtered;
	}
	
	
}
