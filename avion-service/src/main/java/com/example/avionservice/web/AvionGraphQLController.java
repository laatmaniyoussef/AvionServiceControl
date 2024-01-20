package com.example.avionservice.web;

import com.example.avionservice.service.AvionManagerAction;
import com.example.avionservice.service.dtos.AvionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AvionGraphQLController {
    @Autowired
    private AvionManagerAction avionManagerAction;


    @QueryMapping
    public AvionDto getAvionById(@Argument Long id) {
        return avionManagerAction.getAvionById(id);
    }


    @MutationMapping
    public AvionDto saveAvion(AvionDto avionDto) {
        return avionManagerAction.saveAvion(avionDto);
    }
}
