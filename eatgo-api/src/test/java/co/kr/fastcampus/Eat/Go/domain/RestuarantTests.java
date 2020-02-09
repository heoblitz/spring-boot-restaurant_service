package co.kr.fastcampus.Eat.Go.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class RestuarantTests {

    @Test
    public void creation() {
        Restuarant restuarant = new Restuarant(1004L,"Bob zip", "Seoul");

        assertThat(restuarant.getId(), is(1004L));
        assertThat(restuarant.getName(), is("Bob zip"));
        assertThat(restuarant.getAddress(), is("Seoul"));
    }

    @Test
    public void information(){
        Restuarant restuarant = new Restuarant(1004L,"Bob zip", "Seoul");

        assertThat(restuarant.getInformation(), is("Bob zip in Seoul"));
    }

}