package Behavior.IteratorPattern;

public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new Room("Room1", 101, 1));
        menu.addItem(new Room("Room2", 102, 0));
        menu.addItem(new Room("Room3", 103, 0));

        RoomIterator<Room> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.println("Room " + room.ToString());
        }
    }
}
