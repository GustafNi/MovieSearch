
package main;

import Searchers.SearchMethods;
import java.util.Scanner;
import javax.json.JsonBuilderFactory;
import model.Movie;

public class MovieSearch {
    JsonBuilderFactory factory;
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);  
    System.out.println("Do you want to...");
    System.out.println("1: search for one movie?");
    System.out.println("2: search for many movies? ");
    int choice = sc.nextInt();
    sc.nextLine();
    if(choice==1) {
        System.out.println("type in your searchword:");
        String word = sc.nextLine();
        Movie mov = SearchMethods.getSingleMovie(word);
        System.out.println(mov.getTitle());
    }else if(choice==2) {
//        System.out.println("Disabled at the moment, sry");
        System.out.println("type in your searchword:");
        String word = sc.nextLine();
        SearchMethods.getListOfMovies(word);
    }else {
        System.out.println("invalid choice");
    }

    }
    public void movieChoice(Movie mov) {
        
    }
}
