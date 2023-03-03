public interface Administrator {
    public Room addChairs(Room room,Integer chairsToBeAdded);
    public Room removeChairs(Room room,Integer chairsToBeRemoved)throws RoomException;
    public Room addTables(Room room,Integer TablesToBeAdded);
    public Room removeTables(Room room,Integer tablesToBeRemoved)throws RoomException;
    public Room addProjectors(Room room,Integer projectorsToBeAdded)throws RoomException;
    public Room removeProjectors(Room room,Integer projectorsToBeRemoved)throws RoomException;
}
