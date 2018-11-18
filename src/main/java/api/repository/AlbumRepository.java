package api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.entity.*;
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
	List<Album> findByArtistName(String name);
}
