package com.springboot.bootingweb.roomwebapp.controllers;

import com.springboot.bootingweb.roomwebapp.models.StaffMember;
import com.springboot.bootingweb.roomwebapp.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 02:50
 * @project booting-web
 */

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff() {
        return staffService.getAllStaff();
    }
}
