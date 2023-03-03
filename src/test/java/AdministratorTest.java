import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

public class AdministratorTest {
    Administrator admin=new AdministratorImpl();
    @Test
    public void addChairsTest()
    {
        assertEquals(6,admin.addChairs(new Room("101",200.0),5).getChairs());
        assertTrue(admin.addChairs(new Room("201",400.0),10).getChairs()==11);
    }
    @Test
    public void removeChairsTest()throws RoomException
    {
        assertThrows(RoomException.class,()->admin.removeChairs(new Room("301",510.9),2));
        assertEquals(0,admin.removeChairs(new Room("301",510.9),1).getChairs());
    }
    @Test
    public void addTablesTest()
    {
        assertEquals(6,admin.addTables(new Room("101",200.0),5).getTables());
        assertTrue(admin.addTables(new Room("201",400.0),10).getTables()==11);
    }
    @Test
    public void removeTablesTest()throws RoomException
    {
        assertThrows(RoomException.class,()->admin.removeTables(new Room("301",510.9),2));
        assertEquals(0,admin.removeTables(new Room("301",510.9),1).getTables());
    }
    @Test
    public void addProjectorTest()throws RoomException
    {
       assertThrows(RoomException.class,()->admin.addProjectors(new Room("401",450.0),5));
       assertThrows(RoomException.class,()->admin.addProjectors(new Room("401",240.0),3));
        assertEquals(3,admin.addProjectors(new Room("501",600.0),3).getProjectors());
        assertEquals(2,admin.addProjectors(new Room("501",200.0),2).getProjectors());
    }
    @Test
    public void removeProjectorTest()throws RoomException
    {
        assertThrows(RoomException.class,()->admin.removeProjectors(new Room("401",450.0),5));
        assertThrows(RoomException.class,()->admin.removeProjectors(new Room("401",240.0),3));
  }
}
