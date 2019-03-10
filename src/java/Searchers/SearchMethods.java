
package Searchers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import model.Movie;
import model.Search;


public class SearchMethods {
private static String word;
private String listOfMovies;

    public static Movie getSingleMovie(String word) {
        try {
            URL url = new URL("http://www.omdbapi.com/?t==" + word + "&apikey=d8bd6f43");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output = br.readLine();
            System.out.println(output);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Movie movie = gson.fromJson(output, Movie.class);
            List<Movie> exList  = Arrays.asList(movie);
           
            conn.disconnect();
            return movie;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    } 
    public static void getListOfMovies(String word) {
        try {
            URL url = new URL("http://www.omdbapi.com/?s==" + word + "&apikey=d8bd6f43");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output = br.readLine();
            System.out.println(output);
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Movie movies = gson.fromJson(output, Movie.class);
            List<Search> result = movies.getSearch();
            if(result.isEmpty()) {
                System.out.println("Empty");
            }
            for (Search mov : result) {
                System.out.println(mov.getTitle() + ", imdbID: " + mov.getImdbID());
            }
            conn.disconnect();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getListOfMovies() {
        return listOfMovies;
    }

    public void setListOfMovies(String listOfMovies) {
        this.listOfMovies = listOfMovies;
    }
    
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
