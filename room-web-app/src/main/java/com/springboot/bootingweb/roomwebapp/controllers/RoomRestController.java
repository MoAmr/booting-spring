package com.springboot.bootingweb.roomwebapp.controllers;

import com.springboot.bootingweb.roomwebapp.models.Room;
import com.springboot.bootingweb.roomwebapp.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 02:46
 * @project booting-web
 */

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {

    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }
}
