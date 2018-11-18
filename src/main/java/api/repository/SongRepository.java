package api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.entity.Song;
@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
	List<Song> findByAlbumName(String name);
	Song findByName(String name);
	
	List<Song> findByGenresGenreId(long id);
}