package com.internship.carshow.dto;

import lombok.Data;

@Data
public class CarDto {
    private long id;
    private String thumbnail;
    private long makeId;
    private long modelId;
    private Details make;
    private Details model;
    private long year;
    private long price;
    private long carStatus;
}