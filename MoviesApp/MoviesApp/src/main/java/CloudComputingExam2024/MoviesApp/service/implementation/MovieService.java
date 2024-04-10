package CloudComputingExam2024.MoviesApp.service.implementation;

import CloudComputingExam2024.MoviesApp.model.Movie;
import CloudComputingExam2024.MoviesApp.repository.MovieRepository;
import CloudComputingExam2024.MoviesApp.service.interfaces.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }
}
