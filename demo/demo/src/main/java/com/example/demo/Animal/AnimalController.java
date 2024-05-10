package com.example.demo.Animal;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    private final AnimalService animalService = null;

    @PostMapping
    public void createAnimal(@RequestBody Animal animal)
    {
        animalService.createAnimal(animal);

    }
    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        List<Animal> animals = animalService.getAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Integer id) {
        return animalService.getAnimalById(id)
                .map(animal -> new ResponseEntity<>(animal, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAnimal(@PathVariable Integer id, @RequestBody Animal updatedAnimal) {
        animalService.updateAnimal(id, updatedAnimal);
        return new ResponseEntity<>("Animal actualizado exitosamente", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAnimal(@PathVariable Integer id) {
        animalService.deleteAnimal(id);
        return new ResponseEntity<>("Animal eliminado exitosamente", HttpStatus.OK);
    }
}
