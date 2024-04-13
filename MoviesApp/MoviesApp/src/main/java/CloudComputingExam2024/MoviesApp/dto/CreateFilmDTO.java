package CloudComputingExam2024.MoviesApp.dto;

import CloudComputingExam2024.MoviesApp.model.Film;
import lombok.Data;

@Data
public class CreateFilmDTO {
    public String title;
    public String genre;
    public Long year;

    public CreateFilmDTO() {
    }

    public CreateFilmDTO(Film film) {
        this(film.getTitle(), film.getGenre(), film.getYear());
    }

    public CreateFilmDTO(String title, String genre, Long year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
}
