package CloudComputingExam2024.MoviesApp.controller;

import CloudComputingExam2024.MoviesApp.dto.CreateFilmDTO;
import CloudComputingExam2024.MoviesApp.dto.FilmDTO;
import CloudComputingExam2024.MoviesApp.model.Film;
import CloudComputingExam2024.MoviesApp.service.implementation.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping(value = "/all")
    public ResponseEntity<List<FilmDTO>> getAllMovies() {
        List<Film> films = filmService.findAll();

        List<FilmDTO> filmDTOS = new ArrayList<>();
        for(Film f : films) {
            filmDTOS.add(new FilmDTO(f));
        }

        return new ResponseEntity<>(filmDTOS, HttpStatus.OK);
    }

    @PostMapping(value = "/create", consumes = "application/json")
    public ResponseEntity<CreateFilmDTO> saveMovie(@RequestBody CreateFilmDTO createFilmDTO) {
        Film film = new Film();
        film.setTitle(createFilmDTO.getTitle());
        film.setGenre(createFilmDTO.getGenre());
        film.setYear(createFilmDTO.getYear());
        film = filmService.save(film);
        return new ResponseEntity<>(new CreateFilmDTO(film), HttpStatus.CREATED);
    }
}
