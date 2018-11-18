package api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.entity.Artist;
@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
