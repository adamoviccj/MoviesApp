package CloudComputingExam2024.MoviesApp.service.interfaces;

import CloudComputingExam2024.MoviesApp.model.Film;

import java.util.List;

public interface IFilmService {
    public List<Film> findAll();
    public Film save(Film movie);

}
