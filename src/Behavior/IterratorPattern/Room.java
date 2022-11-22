package Behavior.IterratorPattern;

public class Room {
    private String roomName;
    private int roomNumber;
    private int status;

    public Room(String roomName, int roomNumber, int status) {
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.status = status;
    }

    public String ToString() {
        String statuString = this.status == 1 ? "Trong" : "Da dat";
        return "name " + this.roomName + " number " + this.roomNumber + " " + statuString;
    }
}
