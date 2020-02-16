package co.kr.fastcampus.Eat.Go.Interfaces;

import co.kr.fastcampus.Eat.Go.domain.Restaurant;
import co.kr.fastcampus.Eat.Go.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class RestaurantController {

    @Autowired
    private RestaurantRepository repository;

    // private RestaurantRepository repository = new RestaurantRepository();

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = repository.findAll();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){

        //
//        for(Restaurant aa : restaurants){
//            if ( aa.getId() == id ){
//                restuarant = aa;
//            }
//        }

        return repository.findById(id);
    }
}
