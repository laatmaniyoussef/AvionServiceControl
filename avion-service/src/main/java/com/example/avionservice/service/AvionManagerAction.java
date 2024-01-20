package com.example.avionservice.service;

import com.example.avionservice.service.dtos.AvionDto;

public interface AvionManagerAction {
    public AvionDto getAvionById(Long id);
    public AvionDto saveAvion(AvionDto avionDto);
}
