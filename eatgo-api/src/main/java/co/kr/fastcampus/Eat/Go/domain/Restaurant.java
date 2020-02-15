package co.kr.fastcampus.Eat.Go.domain;

import java.util.List;

public class Restaurant {

    private final String name;
    private final String address;
    private final long id;

    public Restaurant(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }


    public String getInformation(){
        return name + " in " + address;
    }

}
