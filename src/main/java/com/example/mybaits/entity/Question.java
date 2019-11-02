package com.example.mybaits.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Question implements Serializable {
    private String id;

    private String h1info;

    private String h2info;

    private String content;

    private String asker;

    private static final long serialVersionUID = 1L;
}
