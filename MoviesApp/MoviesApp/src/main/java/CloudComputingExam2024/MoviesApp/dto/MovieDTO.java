package CloudComputingExam2024.MoviesApp.dto;

import CloudComputingExam2024.MoviesApp.model.Movie;
import lombok.Data;

@Data
public class MovieDTO {
    private Long id;
    private String title;
    private String genre;
    private Long release_year;

    public MovieDTO() {
    }

    public MovieDTO(Movie movie) {
        this(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getReleaseYear());
    }

    public MovieDTO(Long id, String title, String genre, Long release_year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.release_year = release_year;
    }

    public static MovieDTO makeFromMovie(Movie movie) {
        return new MovieDTO(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getReleaseYear());
    }
}
