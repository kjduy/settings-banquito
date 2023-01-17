package com.banquito.settings.controller.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class HolidayRS implements Serializable {

    private Date date;
    private String name;
    private String type;
    
}