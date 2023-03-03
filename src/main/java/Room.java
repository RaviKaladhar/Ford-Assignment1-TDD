public class Room {
    //Every room has a name, a size in square feet and can
    // contain number of projectors, number of tables and number of chairs.
    private String name;
    private Double size;
    private Integer projectors=0;
    private Integer tables=1;
    private Integer chairs=1;

    public Room()
    {

    }

    public Room(String name, Double size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getProjectors() {
        return projectors;
    }

    public void setProjectors(Integer projectors) {
        this.projectors = projectors;
    }

    public Integer getTables() {
        return tables;
    }

    public void setTables(Integer tables) {
        this.tables = tables;
    }

    public Integer getChairs() {
        return chairs;
    }

    public void setChairs(Integer chairs) {
        this.chairs = chairs;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", projectors=" + projectors +
                ", tables=" + tables +
                ", chairs=" + chairs +
                '}';
    }
}
