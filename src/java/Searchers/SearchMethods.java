
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import model.Movie;
import model.Search;

@Named("searchMethods")
@RequestScoped
public class SearchMethods {

   public SearchMethods(){
       
   }

    public Movie getSingleMovie(String word) {
<<<<<<< HEAD
=======
=======
import model.Movie;
import model.Search;


public class SearchMethods {
private String word;
    public static Movie getSingleMovie(String word) {
>>>>>>> 35cf1be4cc55c3f46022402aa2b25a1c959cb68e
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
       
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
//            System.out.println("Output from Server .... \n");
//            if (output!= null) {
//                System.out.println(output);
//            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Movie movie = gson.fromJson(output, Movie.class);
//            System.out.println(movie.getTitle());
            List<Movie> exList  = Arrays.asList(movie);

//            for (Movie mov : exList) {
//                System.out.println(mov.getTitle());
//
//            }
           
            conn.disconnect();
            return movie;
        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return null;
    } 
<<<<<<< HEAD
    public void getListOfMovies(String word) {
=======
<<<<<<< HEAD
    public void getListOfMovies(String word) {
=======
    public static void getListOfMovies(String word) {
>>>>>>> 35cf1be4cc55c3f46022402aa2b25a1c959cb68e
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
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
//            int index = output.lastIndexOf("]");
//            String newOutput = output.substring(0, index + 1);
//            newOutput = newOutput.concat("}");
//
//            System.out.println("Output from Server .... \n");
//            
//            if (output!= null) {
//                System.out.println(output);
//            }
           
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Movie movies = gson.fromJson(output, Movie.class);
//            List<Movie> exList  = Arrays.asList(movies);
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
     public void getNextPage(String word, int step) {
         
        try {

            URL url = new URL("http://www.omdbapi.com/?s=" + word + "&page=" +step+ "&apikey=d8bd6f43");
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
//            int index = output.lastIndexOf("]");
//            String newOutput = output.substring(0, index + 1);
//            newOutput = newOutput.concat("}");
//
//            System.out.println("Output from Server .... \n");
//            
//            if (output!= null) {
//                System.out.println(output);
//            }
           
            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Movie movies = gson.fromJson(output, Movie.class);
//            List<Movie> exList  = Arrays.asList(movies);
            List<Search> result = movies.getSearch();
            if(result.isEmpty()) {
                System.out.println("Empty");
            }
            for (Search mov : result) {
                System.out.println(mov.getTitle() + ", imdbID: " + mov.getImdbID());

            }
           
            conn.disconnect();
       
            System.out.println(step);
        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
<<<<<<< HEAD
=======
=======
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
>>>>>>> 35cf1be4cc55c3f46022402aa2b25a1c959cb68e
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
}
