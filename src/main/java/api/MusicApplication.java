package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

@SpringBootApplication
public class MusicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MusicApplication.class, args);
	}

	@Autowired
	private ArtistRepository artistRepo;
	
	@Autowired
	private SongRepository songRepo;
	
	@Autowired
	private AlbumRepository albumRepo;
	
	@Autowired
	private SongGenresRepository sgRepo;

	@Autowired
	private GenreRepository genreRepo;
	
	@Override
	public void run(String... strings) throws Exception {
/*
		artistRepo.save(new Artist(null, "Lana Del Rey", "assets/images/delrey.jpg"));
		artistRepo.save(new Artist(null, "Little Big", "assets/images/ilich.jpg"));
		artistRepo.save(new Artist(null, "Ed Sheeran", "assets/images/ed.jpg"));
		
		albumRepo.save(new Album(null, "Born To Die", "assets/images/borntodie.jpg", artistRepo.findOne((long) 1)));		
		albumRepo.save(new Album(null, "The Rave", "assets/images/lb.jpg", artistRepo.findOne((long) 2)));
		albumRepo.save(new Album(null, "Honeymoon", "assets/images/hm.jpg", artistRepo.findOne((long) 1)));
		albumRepo.save(new Album(null, "Divide", "assets/images/edone.jpg", artistRepo.findOne((long) 3)));
		
		songRepo.save(new Song(null, "Summertime Sadness", "assets/images/ldr11.jpg", "https://www.youtube.com/embed/TdrL3QxjyVw", albumRepo.findOne((long)1)));
		songRepo.save(new Song(null, "Born To Die",  "assets/images/ldr2.jpg", "https://www.youtube.com/embed/Bag1gUxuU0g", albumRepo.findOne((long)1)));
		songRepo.save(new Song(null, "Carmen",  "assets/images/ldr3.jpg", "https://www.youtube.com/embed/L6K8Uq88BEQ", albumRepo.findOne((long)1)));
		songRepo.save(new Song(null, "Off to the races",  "assets/images/ldr4.jpg", "https://www.youtube.com/embed/u1Jevm2C4pk", albumRepo.findOne((long)1)));
		
		
		songRepo.save(new Song(null, "Faradenza", "assets/images/ldr5.jpg", "https://www.youtube.com/embed/1t_sMynan_k", albumRepo.findOne((long)2)));
		songRepo.save(new Song(null, "Skibidi", "assets/images/ldr6.jpg", "https://www.youtube.com/embed/mDFBTdToRmw", albumRepo.findOne((long)2)));
		
		songRepo.save(new Song(null, "Honeymoon",  "assets/images/ldr7.jpg", "https://www.youtube.com/embed/uFnDavYARag", albumRepo.findOne((long)3)));
		songRepo.save(new Song(null, "Blue Jeans",  "assets/images/ldr8.jpg", "https://www.youtube.com/embed/JRWox-i6aAk", albumRepo.findOne((long)3)));
		
		songRepo.save(new Song(null, "Shape Of You",  "assets/images/ldr9.jpg", "https://www.youtube.com/embed/JGwWNGJdvx8", albumRepo.findOne((long)4)));
		songRepo.save(new Song(null, "Perfect",  "assets/images/ldr10.jpg", "https://www.youtube.com/embed/2Vv-BfVoq4g", albumRepo.findOne((long)4)));
	
		genreRepo.save(new Genre((long) 1,"POP"));
		genreRepo.save(new Genre((long) 2,"ROCK"));

		sgRepo.save(new SongGenres((long) 1, songRepo.findOne((long) 5), genreRepo.findOne((long) 1)));
		sgRepo.save(new SongGenres((long) 2, songRepo.findOne((long) 6), genreRepo.findOne((long) 1)));
		sgRepo.save(new SongGenres((long) 3, songRepo.findOne((long) 5), genreRepo.findOne((long) 2)));*/

	}
}
