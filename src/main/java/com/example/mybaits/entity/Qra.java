package com.example.mybaits.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Qra implements Serializable {
    private String aid;

    private String bid;

    private static final long serialVersionUID = 1L;
}