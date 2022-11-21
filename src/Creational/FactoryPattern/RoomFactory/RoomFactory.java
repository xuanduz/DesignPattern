package Creational.FactoryPattern.RoomFactory;

import Creational.FactoryPattern.RoomTypes;

import Creational.FactoryPattern.Rooms.Room;
import Creational.FactoryPattern.Rooms.SkinRoom;
import Creational.FactoryPattern.Rooms.ToothRoom;

public class RoomFactory {
    public static Room GetType(RoomTypes roomTypes) {
        switch (roomTypes) {
            case tooth:
                return new ToothRoom();
            case skin:
                return new SkinRoom();
            default:
                return null;
        }
    }
}
