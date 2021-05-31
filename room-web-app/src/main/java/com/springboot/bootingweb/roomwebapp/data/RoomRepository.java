package com.springboot.bootingweb.roomwebapp.data;

import com.springboot.bootingweb.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 04:16
 * @project booting-web
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
}
