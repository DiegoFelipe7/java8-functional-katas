package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Chain filter() and map() to collect the ids of videos that have a rating of 5.0
    DataSource: DataUtil.getMovies()
    Output: List of Integers
*/
public class Kata2 {
    private static final double value=5.0;
    public static List<Double> execute() {
        List<Movie> movies = DataUtil.getMovies();
        return movies.stream()
               .filter(rating-> rating.getRating().equals(value))
               .map(rating->rating.getRating()).collect(Collectors.toList());
    }

}
