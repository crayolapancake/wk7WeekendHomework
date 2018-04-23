import Instruments.Guitar;
import Instruments.Sound;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson", "Les Paul", "red", "Electric"); //Sound.GUITAR)
    }

    @Test
    public void canGetMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Les Paul", guitar.getModel());
    }

    @Test
    public void canGetColor(){
        assertEquals("red", guitar.getColor());
    }

    @Test
    public void canGetType(){
        assertEquals("Electric", guitar.getType());
    }

//    @Test
//    public void canGetSound(){
//        assertEquals(Sound.GUITAR, guitar.getSound());
//    }

}

