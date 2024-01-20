package com.example.avionservice.service.dtos;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AvionDto {
    private String color;
    private String price;
    private String model;
}
