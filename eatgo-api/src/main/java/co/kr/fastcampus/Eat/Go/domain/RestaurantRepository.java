package co.kr.fastcampus.Eat.Go.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepository () {
        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));
    }

    public List<Restaurant> findAll() {
        return restaurants;
    }

    public Restaurant findById(Long id) {
        Restaurant restuarant = null;

        for(Restaurant aa : restaurants){
            if ( aa.getId() == id ){
                restuarant = aa;
            }
        }

        return restuarant;
    }
}
