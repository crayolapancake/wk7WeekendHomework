import Instruments.Oboe;
import Instruments.Sound;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OboeTest {

    private Oboe oboe;

    @Before
    public void before(){
        oboe = new Oboe("Fox", "330", "black", "Conservatoire"); // Sound.OBOE);
    }

    @Test
    public void canGetMake(){
        assertEquals("Fox", oboe.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("330", oboe.getModel());
    }

    @Test
    public void canGetColor(){
        assertEquals("black", oboe.getColor());
    }

    @Test
    public void canGetType(){
        assertEquals("Conservatoire", oboe.getType());
    }



}



