package com.edwardoboh.moviemicro.moviedetailservice.controller;

import com.edwardoboh.moviemicro.moviedetailservice.model.MovieDetailEntity;
import com.edwardoboh.moviemicro.moviedetailservice.repository.MovieDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/detail")
public class MovieDetailController {

    @Autowired
    MovieDetailRepository movieDetailRepository;

    @GetMapping("/{movieId}")
    public ResponseEntity<Optional<MovieDetailEntity>> getMovieDetails(@PathVariable String movieId) {
        Optional<MovieDetailEntity> movieDetail = movieDetailRepository.findById(movieId);
        if(movieDetail.isEmpty()) return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(movieDetail);
    }
}
