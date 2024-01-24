package com.edwardoboh.moviemicro.moviedetailservice;

import com.edwardoboh.moviemicro.moviedetailservice.model.MovieDetailEntity;
import com.edwardoboh.moviemicro.moviedetailservice.repository.MovieDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MovieDetailServiceApplication implements CommandLineRunner {

	@Autowired
	MovieDetailRepository movieDetailRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieDetailServiceApplication.class, args);
	}

	public void run(String ...args) {
		List<MovieDetailEntity> movieDetailList = new ArrayList<>();
		for (int i=0; i<5; i++) {
			movieDetailList.add(new MovieDetailEntity(
					Integer.toString(i),
					"Movie: " + Integer.toString(i),
					"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."
			));
		}
		movieDetailRepository.saveAll(movieDetailList);
	}
}
