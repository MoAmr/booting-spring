package com.springboot.bootingweb.roomwebapp.controllers;

import com.springboot.bootingweb.roomwebapp.models.Room;
import com.springboot.bootingweb.roomwebapp.service.RoomService;
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

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }
}
