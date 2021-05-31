package com.springboot.bootingweb.roomwebapp.data;

import com.springboot.bootingweb.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 05:01
 * @project booting-web
 */

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
