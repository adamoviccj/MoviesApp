package CloudComputingExam2024.MoviesApp.dto;

import CloudComputingExam2024.MoviesApp.model.Movie;
import lombok.Data;

@Data
public class CreateMovieDTO {
    public String title;
    public String genre;
    public Long release_year;

    public CreateMovieDTO() {
    }

    public CreateMovieDTO(Movie movie) {
        this(movie.getTitle(), movie.getGenre(), movie.getReleaseYear());
    }

    public CreateMovieDTO(String title, String genre, Long release_year) {
        this.title = title;
        this.genre = genre;
        this.release_year = release_year;
    }
}
