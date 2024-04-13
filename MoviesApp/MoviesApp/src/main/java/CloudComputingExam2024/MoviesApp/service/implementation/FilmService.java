package CloudComputingExam2024.MoviesApp.service.implementation;

import CloudComputingExam2024.MoviesApp.model.Film;
import CloudComputingExam2024.MoviesApp.repository.FilmRepository;
import CloudComputingExam2024.MoviesApp.service.interfaces.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService implements IFilmService {
    @Autowired
    private FilmRepository filmRepository;
    @Override
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public Film save(Film film) {
        filmRepository.save(film);
        return film;
    }
}
