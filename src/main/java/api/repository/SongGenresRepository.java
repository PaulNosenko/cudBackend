package api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.entity.*;
@Repository
public interface SongGenresRepository extends JpaRepository<SongGenres, Long> {}
