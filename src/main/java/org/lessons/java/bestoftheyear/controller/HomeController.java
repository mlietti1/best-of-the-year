package org.lessons.java.bestoftheyear.controller;


import org.lessons.java.bestoftheyear.model.Movie;
import org.lessons.java.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
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

    private List<Song> getBestSongs(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("2 Be Loved", 1));
        songs.add(new Song("Jaded", 2));
        songs.add(new Song("Good Days", 3));
        return songs;
    }

    @GetMapping("/songs")
    public String songs (Model model){
        List<Song> list = getBestSongs();
        String titles = list.stream().map(Song::getTitle).collect(Collectors.joining(", "));
        model.addAttribute("songs", titles);
        return "songs";
    }

    @GetMapping("/movies")
    public String movies (Model model){
        List<Movie> list = getBestMovies();
        String titles = list.stream().map(Movie::getTitle).collect(Collectors.joining(", "));
        model.addAttribute("movies", titles);
        return "movies";
    }

    private List<Movie> getBestMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Do Revenge", 1));
        movies.add(new Movie("Everything Everywhere All at Once", 2));
        movies.add(new Movie("The Dirt", 3));
        return movies;
    }

}
