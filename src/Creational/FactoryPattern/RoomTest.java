package Creational.FactoryPattern;

import Creational.FactoryPattern.RoomFactory.RoomFactory;
import Creational.FactoryPattern.Rooms.Room;

public class RoomTest {
    public static void main(String[] args) {
        Room skinRoom = RoomFactory.GetType(RoomTypes.skin);
        System.out.println("Type of room: " + skinRoom.GetType());
        Room toothRoom = RoomFactory.GetType(RoomTypes.tooth);
        System.out.println("Type of room: " + toothRoom.GetType());
    }
}
