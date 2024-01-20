package com.example.avionservice.service.mappers;

import com.example.avionservice.dao.entities.Avion;
import com.example.avionservice.service.dtos.AvionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AvionMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public AvionDto fromAvionToAvionDto(Avion avion) {
        return this.modelMapper.map(avion, AvionDto.class);
    }

    public Avion fromAvionDtoToAvion(AvionDto avionDto) {
        return this.modelMapper.map(avionDto, Avion.class);
    }
}
