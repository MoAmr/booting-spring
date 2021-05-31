package com.springboot.bootingweb.roomwebapp.service;

import com.springboot.bootingweb.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 01:48
 * @project booting-web
 */

@Service
public class RoomService {

    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
