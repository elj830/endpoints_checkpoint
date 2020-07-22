package com.example.demo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PagesController {

    @GetMapping("/movies/movie")
    public Movie getMovies(){
        Movie movie = new Movie();
        movie.setTitle("The GodFather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setMetascore(100);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control of his " +
                "clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);
        movie.setYear("1972");
        Movie.Credit[] credits = new Movie.Credit[4];
        Movie.Credit credit1 = new Movie.Credit();
        Movie.Credit.Person person1 = new Movie.Credit.Person();
        person1.setFirstName("Francis Ford"); person1.setLastName("Copolla");person1.setRole("Director");
        credit1.setPerson(person1);

        Movie.Credit credit2 = new Movie.Credit();
        Movie.Credit.Person person2 = new Movie.Credit.Person();
        person2.setFirstName("Marlon"); person2.setLastName("Brandon");person2.setRole("Star");
        credit2.setPerson(person2);

        Movie.Credit credit3 = new Movie.Credit();
        Movie.Credit.Person person3 = new Movie.Credit.Person();
        person3.setFirstName("Al"); person3.setLastName("Pacino");person3.setRole("Star");
        credit3.setPerson(person3);

        Movie.Credit credit4 = new Movie.Credit();
        Movie.Credit.Person person4 = new Movie.Credit.Person();
        person4.setFirstName("Diane"); person4.setLastName("Keaton");person4.setRole("Star");
        credit4.setPerson(person4);

        credits[0] = credit1;
        credits[1] = credit2;
        credits[2] = credit3;
        credits[3] = credit4;

        movie.setCredits(credits);


//

        return movie;

    }

    @PostMapping("/flights/tickets/total")
    public Map<String, Double> sumGrossTotal(@RequestBody() Movie[] movies) {
        double total = 0;
        for (Movie movie : movies) {
            total += movie.getGross();
        }
        Map<String, Double> result = new HashMap<>();
        result.put("result", total);
        return result;
    }
}
