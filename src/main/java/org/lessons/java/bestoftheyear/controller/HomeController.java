package org.lessons.java.bestoftheyear.controller;


import org.lessons.java.bestoftheyear.model.Movie;
import org.lessons.java.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home (Model model){
        String userName = "Cristina";
        model.addAttribute("name", userName);
        return "home";
    }

    @GetMapping("/songs")
    public String songs (Model model){
        List<Song> list = getBestSongs();
        model.addAttribute("songs", list);
        return "songs";
    }

    @GetMapping("/movies")
    public String movies (Model model){
        List<Movie> list = getBestMovies();
        model.addAttribute("movies", list);
        return "movies";
    }

    @GetMapping("/songs/{id}")
    public String bestSong(Model model, @PathVariable int id){
        for (Song s : getBestSongs()){
            if(s.getId() == id){
                model.addAttribute("song", s);
            }
        }
        return "selected-song";
    }

    @GetMapping("/movies/{id}")
    public String bestMovie(Model model, @PathVariable int id){
        for (Movie m : getBestMovies()){
            if(m.getId() == id){
                model.addAttribute("movie", m);
            }
        }
        return "selected-movie";
    }

    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "2 Be Loved", "3:07", "Lizzo", "Special", "/album-covers/lizzo-special.png"));
        songs.add(new Song(2,"Jaded", "3:05", "Miley Cyrus", "Endless Summer Vacation", "/album-covers/miley-cyrus-endless-summer-vacation.png"));
        songs.add(new Song(3, "Good Days", "4:38", "SZA", "Good Days", "/album-covers/sza-good-days.png"));
        return songs;
    }

    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Do Revenge", "A dethroned queen bee at a posh private high school strikes a secret deal with an unassuming new student to exact revenge on each other's enemies.", "Jennifer Kaytin Robinson", "/posters/poster2.jpg"));
        movies.add(new Movie(2, "Everything Everywhere All at Once", "When an interdimensional rupture unravels reality, an unlikely hero must channel her newfound powers to fight bizarre and bewildering dangers from the multiverse as the fate of the world hangs in the balance.", "Daniel Kwan", "/posters/poster1.jpg"));
        movies.add(new Movie(3, "The Dirt", "In this unflinching biopic based on Mötley Crüe's best-selling book, four LA misfits navigate the monster highs and savage lows of music superstardom.", "Jeff Tremaine", "/posters/poster3.jpg"));
        return movies;
    }

}
