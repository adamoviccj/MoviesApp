package CloudComputingExam2024.MoviesApp.service.interfaces;

import CloudComputingExam2024.MoviesApp.model.Movie;

import java.util.List;

public interface IMovieService {
    public List<Movie> findAll();
    public Movie save(Movie movie);

}
