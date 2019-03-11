
package main;

import Searchers.SearchMethods;
import java.util.Scanner;
import javax.json.JsonBuilderFactory;
import model.Movie;

public class MovieSearch {
    JsonBuilderFactory factory;
public static void main(String[] args) {
<<<<<<< HEAD
    SearchMethods sM = new SearchMethods();
=======
<<<<<<< HEAD
    SearchMethods sM = new SearchMethods();
=======
    
>>>>>>> 35cf1be4cc55c3f46022402aa2b25a1c959cb68e
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
    Scanner sc = new Scanner(System.in);  
    System.out.println("Do you want to...");
    System.out.println("1: search for one movie?");
    System.out.println("2: search for many movies? ");
    int choice = sc.nextInt();
    sc.nextLine();
    if(choice==1) {
        System.out.println("type in your searchword:");
        String word = sc.nextLine();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
        Movie mov = sM.getSingleMovie(word);
        System.out.println(mov.getTitle());
        System.out.println(mov.getYear());
        System.out.println(mov.getRuntime());
        System.out.println(mov.getDirector());
        System.out.println(mov.getGenre());
        
<<<<<<< HEAD
=======
=======
        Movie mov = SearchMethods.getSingleMovie(word);
        System.out.println(mov.getTitle());
>>>>>>> 35cf1be4cc55c3f46022402aa2b25a1c959cb68e
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
    }else if(choice==2) {
//        System.out.println("Disabled at the moment, sry");
        System.out.println("type in your searchword:");
        String word = sc.nextLine();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
        sM.getListOfMovies(word);
        System.out.println("Do you want to see next page? Y/N");
        String nextPage = sc.nextLine();
        int step = 1;
        do{
            sM.getNextPage(word,step);
                System.out.println("Next page? Y/N");
                nextPage = sc.nextLine();
                step++;
        }while(nextPage.equalsIgnoreCase("Y"));
        
           
        
<<<<<<< HEAD
=======
=======
        SearchMethods.getListOfMovies(word);
>>>>>>> 35cf1be4cc55c3f46022402aa2b25a1c959cb68e
>>>>>>> 8df7f76afeaefa9c25386223c6ce463119cf5c98
    }else {
        System.out.println("invalid choice");
    }

    }
    public void movieChoice(Movie mov) {
        
    }
}
