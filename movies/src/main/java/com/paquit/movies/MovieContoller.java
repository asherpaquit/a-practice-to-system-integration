package com.paquit.movies;

import org.apache.coyote.Response;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieContoller {
    @GetMapping
    public ResponseEntity<String> getAllMovies(){
        return new ResponseEntity<String>("All Movies!", HttpStatus.OK);
    }
}
