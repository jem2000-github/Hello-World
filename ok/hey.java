package ok
;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class hey
 {

    Fenetre c;

    @Before
    public void faireAvant(){


        c = new Fenetre();

    }

    @Test
    public void yes(){
        
        assertTrue(c instanceof Fenetre);
        //assertFalse(c instanceof Fenetre);

    }
    
}
