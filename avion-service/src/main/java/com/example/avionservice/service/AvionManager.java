package com.example.avionservice.service;

import com.example.avionservice.dao.repositories.AvionRepository;
import com.example.avionservice.service.dtos.AvionDto;
import com.example.avionservice.service.mappers.AvionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AvionManager implements AvionManagerAction {

    @Autowired
    private AvionRepository avionRepository;
    @Autowired
    private AvionMapper avionMapper;

    @Override
    public AvionDto getAvionById(Long id) {
        return avionMapper.fromAvionToAvionDto(avionRepository.findById(id).get());
    }

    @Override
    public AvionDto saveAvion(AvionDto avionDto) {
        return avionMapper.fromAvionToAvionDto(avionRepository.save(avionMapper.fromAvionDtoToAvion(avionDto)));
    }
}
