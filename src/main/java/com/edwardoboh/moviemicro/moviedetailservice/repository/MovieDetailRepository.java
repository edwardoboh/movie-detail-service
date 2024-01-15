package com.edwardoboh.moviemicro.moviedetailservice.repository;

import com.edwardoboh.moviemicro.moviedetailservice.model.MovieDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface MovieDetailRepository extends JpaRepository<MovieDetailEntity, String> {
}
