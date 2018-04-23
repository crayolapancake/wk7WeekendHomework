import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before(){
        drum = new Drum("Pearl", "VX", "silver", "acoustic"); // Sound.DRUM);
    }

    @Test
    public void canGetMake(){
        assertEquals("Pearl", drum.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("VX", drum.getModel());
    }

    @Test
    public void canGetColor(){
        assertEquals("silver", drum.getColor());
    }

    @Test
    public void canGetType(){
        assertEquals("acoustic", drum.getType());
    }



}
