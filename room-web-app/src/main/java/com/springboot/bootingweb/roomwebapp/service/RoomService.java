package com.springboot.bootingweb.roomwebapp.service;

import com.springboot.bootingweb.roomwebapp.data.RoomRepository;
import com.springboot.bootingweb.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 01:48
 * @project booting-web
 */

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
