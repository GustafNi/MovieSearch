
package model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "searchWord")
@RequestScoped
public class SearchWord {

   private String movieWord;
   
    public SearchWord() {
    }

    public String getMovieWord() {
        return movieWord;
    }

    public void setMovieWord(String movieWord) {
        this.movieWord = movieWord;
    }
    
}
