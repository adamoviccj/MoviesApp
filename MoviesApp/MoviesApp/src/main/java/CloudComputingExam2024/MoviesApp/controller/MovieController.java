package CloudComputingExam2024.MoviesApp.controller;

import CloudComputingExam2024.MoviesApp.dto.CreateMovieDTO;
import CloudComputingExam2024.MoviesApp.dto.MovieDTO;
import CloudComputingExam2024.MoviesApp.model.Movie;
import CloudComputingExam2024.MoviesApp.service.implementation.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<MovieDTO>> getAllMovies() {
        List<Movie> movies = movieService.findAll();

        List<MovieDTO> movieDTOS = new ArrayList<>();
        for(Movie m : movies) {
            movieDTOS.add(new MovieDTO(m));
        }

        return new ResponseEntity<>(movieDTOS, HttpStatus.OK);
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public ResponseEntity<CreateMovieDTO> saveMovie(@RequestBody CreateMovieDTO createMovieDTO) {
        Movie movie = new Movie();
        movie.setTitle(createMovieDTO.getTitle());
        movie.setGenre(createMovieDTO.getGenre());
        movie.setReleaseYear(createMovieDTO.getRelease_year());
        movie = movieService.save(movie);
        return new ResponseEntity<>(new CreateMovieDTO(movie), HttpStatus.CREATED);
    }
}
