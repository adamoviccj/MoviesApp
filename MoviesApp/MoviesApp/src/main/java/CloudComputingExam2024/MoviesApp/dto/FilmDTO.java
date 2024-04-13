package CloudComputingExam2024.MoviesApp.dto;

import CloudComputingExam2024.MoviesApp.model.Film;
import lombok.Data;

@Data
public class FilmDTO {
    private Long id;
    private String title;
    private String genre;
    private Long year;

    public FilmDTO() {
    }

    public FilmDTO(Film film) {
        this(film.getId(), film.getTitle(), film.getGenre(), film.getYear());
    }

    public FilmDTO(Long id, String title, String genre, Long year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public static FilmDTO makeFromFilm(Film movie) {
        return new FilmDTO(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getYear());
    }
}
