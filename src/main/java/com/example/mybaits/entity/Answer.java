package com.example.mybaits.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Answer implements Serializable {

    private String id;

    private String content;

    private String answererid;

    private static final long serialVersionUID = 1L;


}
