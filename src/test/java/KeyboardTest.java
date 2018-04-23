import Instruments.Keyboard;
import Instruments.Sound;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class KeyboardTest {

        private Keyboard keyboard;

    @Before
     public void before(){
     keyboard = new Keyboard("Yamaha", "PSR", "navy", "portable"); //Sound.KEYBOARD
        }

    @Test
    public void canGetMake(){
        assertEquals("Yamaha",keyboard.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("PSR", keyboard.getModel());
    }

    @Test
    public void canGetColor(){
        assertEquals("navy", keyboard.getColor());
    }

    @Test
    public void canGetType(){
        assertEquals("Electric", keyboard.getType());
    }

//    @Test
//        public String CanPlay(){
//        assertEquals("I'm playing music! " );
//        }
    }



