package com.springboot.bootingweb.roomwebapp.service;

import java.util.List;

import com.springboot.bootingweb.roomwebapp.data.StaffRepository;
import com.springboot.bootingweb.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}