package com.example.mybaits.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
    private String id;

    private String name;

    private String password;

    private String access;

    private String info;

    private static final long serialVersionUID = 1L;


}
