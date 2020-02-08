package co.kr.fastcampus.Eat.Go.Interfaces;

import co.kr.fastcampus.Eat.Go.domain.Restuarant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restuarant> list(){
        List<Restuarant> restuarants = new ArrayList<>();

        Restuarant restuarant = new Restuarant("Bob zip", "Seoul");

        restuarants.add(restuarant);

        return restuarants;
    }
}
