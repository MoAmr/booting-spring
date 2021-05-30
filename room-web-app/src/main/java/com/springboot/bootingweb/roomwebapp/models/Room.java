package com.springboot.bootingweb.roomwebapp.models;

/**
 * @author Mohammed Amr
 * @created 31/05/2021 - 01:37
 * @project booting-web
 */
public class Room {

    private long id;
    private String name;
    private String info;

    public Room() {
    }

    public Room(long id, String s, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
