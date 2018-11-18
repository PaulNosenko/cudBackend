package api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.entity.Genre;
import api.entity.Song;
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	List<Genre> findBySongsSongId(long id);
}