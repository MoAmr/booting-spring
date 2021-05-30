package com.springboot.bootingweb.roomwebapp.controllers;

import com.springboot.bootingweb.roomwebapp.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 01:38
 * @project booting-web
 */

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 18; i++) {
            rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}
