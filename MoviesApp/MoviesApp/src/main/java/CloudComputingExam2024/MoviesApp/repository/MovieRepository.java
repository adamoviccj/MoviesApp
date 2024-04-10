package CloudComputingExam2024.MoviesApp.repository;

import CloudComputingExam2024.MoviesApp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
