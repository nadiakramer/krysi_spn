import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SPNTest {

    @Test
    void sboxTest(){
        //given
        SPN spn = new SPN();
        int a[] = new int[16];


        //when


        //then
        assertEquals(spn.sbox(a).length, 16);
    }



}