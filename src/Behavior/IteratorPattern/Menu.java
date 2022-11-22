package Behavior.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Room> menuRooms = new ArrayList<>();

    public void addItem(Room item) {
        menuRooms.add(item);
    }

    public RoomIterator<Room> iterator() {
        return new MenuRoomIterator();
    }

    class MenuRoomIterator implements RoomIterator<Room> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < menuRooms.size();
        }

        @Override
        public Room next() {
            return menuRooms.get(currentIndex++);
        }
    }
}
