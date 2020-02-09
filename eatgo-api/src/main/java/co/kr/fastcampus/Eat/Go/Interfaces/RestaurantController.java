package co.kr.fastcampus.Eat.Go.Interfaces;

import co.kr.fastcampus.Eat.Go.domain.Restuarant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restuarant> list(){
        List<Restuarant> restuarants = new ArrayList<>();

        Restuarant restuarant = new Restuarant(1004,"Bob zip", "Seoul");

        restuarants.add(restuarant);

        return restuarants;
    }

    @GetMapping("/restaurants/{id}")
    public Restuarant detail(@PathVariable("id") Long id){
        List<Restuarant> restaurants = new ArrayList<>();
        Restuarant restuarant = null;

        restaurants.add(new Restuarant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restuarant(2020L, "Cyber Food", "Seoul"));

        for(Restuarant aa : restaurants){
            if ( aa.getId() == id ){
                restuarant = aa;
            }
        }

        return restuarant;
    }
}
