package co.kr.fastcampus.Eat.Go.domain;

public class Restuarant {

    private final String name;
    private final String address;

    public Restuarant(String name, String address) {
        this.name = name;
        this.address = address;
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
