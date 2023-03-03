
public class AdministratorImpl implements Administrator{

    public Room addChairs(Room room,Integer chairsToBeAdded)
    {
        room.setChairs(room.getChairs()+chairsToBeAdded);
        return room;
    }
    public Room removeChairs(Room room,Integer chairsToBeRemoved)throws RoomException
    {
        if(room.getChairs()<chairsToBeRemoved)
            throw new RoomException("number of chairs are:"+room.getChairs()+" which are less than chairs to be removed i.e:"+chairsToBeRemoved);
        room.setChairs(room.getChairs()-chairsToBeRemoved);
        return room;
    }
    public Room addTables(Room room,Integer TablesToBeAdded)
    {
        room.setTables(room.getTables()+TablesToBeAdded);
        return room;
    }
    public Room removeTables(Room room,Integer tablesToBeRemoved)throws RoomException
    {
        if(room.getTables()<tablesToBeRemoved)
            throw new RoomException("number of tables are:"+room.getTables()+" which are less than tables to be removed i.e:"+tablesToBeRemoved);
        room.setTables(room.getTables()-tablesToBeRemoved);
        return room;
    }
    public Room addProjectors(Room room,Integer projectorsToBeAdded)throws RoomException
    {
        if(room.getSize()>400)
        {
            Integer projectors=room.getProjectors()+projectorsToBeAdded;
            if(projectors>3)
                throw new RoomException("maximum number of projectors in the room should be 3");
            room.setProjectors(projectors);
        }
        else {
            Integer projectors=room.getProjectors()+projectorsToBeAdded;
            if(projectors>2)
                throw new RoomException("maximum number of projectors in the room should be 2");
            room.setProjectors(projectors);
        }
        return room;
    }
    public Room removeProjectors(Room room,Integer projectorsToBeRemoved)throws RoomException
    {
        if(room.getSize()>400)
        {
            Integer projectors=room.getProjectors()-projectorsToBeRemoved;
            if(projectors<0)
                throw new RoomException("number of projectors in the room cannot be negative:Invalid input");
            if(projectors>3)
                throw new RoomException("maximum number of projectors in the room should be 3");
            room.setProjectors(projectors);
        }
        else {
            Integer projectors=room.getProjectors()-projectorsToBeRemoved;
            if(projectors<0)
                throw new RoomException("number of projectors in the room cannot be negative:Invalid input");
            if(projectors>2)
                throw new RoomException("maximum number of projectors in the room should be 2");
            room.setProjectors(projectors);
        }
        return room;
    }
}
