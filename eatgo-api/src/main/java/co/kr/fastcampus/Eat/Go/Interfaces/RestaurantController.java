package co.kr.fastcampus.Eat.Go.Interfaces;

import co.kr.fastcampus.Eat.Go.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));
        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));

        Restaurant restuarant = null;

        for(Restaurant aa : restaurants){
            if ( aa.getId() == id ){
                restuarant = aa;
            }
        }

        return restuarant;
    }
}
