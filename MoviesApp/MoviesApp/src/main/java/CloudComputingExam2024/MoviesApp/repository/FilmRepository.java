package CloudComputingExam2024.MoviesApp.repository;

import CloudComputingExam2024.MoviesApp.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
