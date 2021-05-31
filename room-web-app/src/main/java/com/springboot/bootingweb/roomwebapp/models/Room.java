package com.springboot.bootingweb.roomwebapp.models;

import javax.persistence.*;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 01:37
 * @project booting-web
 */

@Entity
@Table(name = "ROOM")
public class Room {

    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ROOM_NUMBER")
    private String number;

    @Column(name = " NAME")
    private String name;

    @Column(name = "BED_INFO")
    private String info;

    public Room() {
    }

    public Room(long id, String number, String name, String info) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
