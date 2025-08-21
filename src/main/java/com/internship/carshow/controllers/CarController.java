package com.internship.carshow.controllers;

import com.internship.carshow.dto.CarDto;
import com.internship.carshow.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<CarDto> retrieveCars(
            @RequestParam(name = "modelName",required = false) String modelName)
    {
        return carService.getCars(modelName);
    }

    @GetMapping("/{id}")
    public CarDto retrieveCar(@PathVariable long id) {
        return carService.getCarById(id);
    }

    @GetMapping("/most-expensive")
    public CarDto getMostExpensiveCar() {
        return carService.getMostExpensiveCar();
    }

    @PostMapping
    public void addCar(@RequestBody CarDto carDto) {
        carService.addCar(carDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable long id) {
        carService.deleteCar(id);
    }




}
