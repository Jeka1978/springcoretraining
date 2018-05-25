package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ElfTest {

    @Test
    public void testInjectRandomIsWorking() throws Exception {
        Elf elf = new Elf();
        Assert.assertEquals(0,elf.getPower());
        Assert.assertEquals(0,elf.getSpeed());

        Elf elf1 = ObjectFactory.getInstance().createObject(Elf.class);
        Assert.assertNotEquals(0,elf1.getSpeed());
        System.out.println(elf1);
    }
}