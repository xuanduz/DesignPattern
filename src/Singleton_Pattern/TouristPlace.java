package Singleton_Pattern;

public class TouristPlace {
    private int id;
    private int idAddress;
    private String name;
    private String demo;
    private String avatar;
    private Float point;
    //constructor
    public TouristPlace() {
    }

    public TouristPlace(int id, int idAddress, String name, String demo, String avatar, Float point) {
        this.id = id;
        this.idAddress = idAddress;
        this.name = name;
        this.demo = demo;
        this.avatar = avatar;
        this.point = point;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }

}


