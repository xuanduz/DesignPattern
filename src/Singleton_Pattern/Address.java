package Singleton_Pattern;

public class Address {
    private int id;
    private String name;
    private String category;
    private String id_dad;

    //Constructor
    public Address() {
    }

    public Address(int id, String name, String category, String id_dad) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.id_dad = id_dad;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId_dad() {
        return id_dad;
    }

    public void setId_dad(String id_dad) {
        this.id_dad = id_dad;
    } 
}
