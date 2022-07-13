package src.main.models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void sellMovie(String name) {
        if (!(this.movies.get(this.getMovieIndex(name)).isAvailable())) {
            throw new IllegalStateException();
        }

        this.movies.removeIf((movie) -> movie.getName().equals(name));
    }

    public void rentMovie(String name) {
        this.movies.get(this.getMovieIndex(name)).setAvailable(false);
    }

    private int getMovieIndex(String name) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public boolean contains(Movie movie) {
        return this.movies.contains(movie);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}
