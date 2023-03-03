public class Driver {
    public static void main(String args[] )
    {
        Administrator admin=new AdministratorImpl();
        Room room1=admin.addTables(new Room("101",200.0),5);
        System.out.println("number of Tables in room 101 :"+room1.getTables());
        Room room2=admin.addChairs(new Room("201",400.0),3);
        System.out.println("number of Chairs in room 101 :"+room2.getChairs());
        try {
        admin.removeChairs(new Room("301",510.9),2);
        }
        catch (RoomException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            admin.removeTables(new Room("301",510.9),4);
        }
        catch (RoomException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            Room room3 = admin.addProjectors(new Room("501", 450.0), 3);
            System.out.println(room3);
            Room room5=admin.addProjectors(new Room("450",230.9),2);
            System.out.println(room5);
            Room room4=admin.addProjectors(new Room("520",520.5),5);
        }
        catch (RoomException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            Room room6 = admin.removeProjectors(new Room("501", 450.0), 0);
            System.out.println(room6);
            Room room8=admin.removeProjectors(new Room("560",350.0),0);
            System.out.println(room8);
            Room room7=admin.removeProjectors(new Room("520",520.5),5);

        }
        catch (RoomException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
