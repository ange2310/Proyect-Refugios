package com.example.demo.Animal;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepo;
    public void createAnimal (Animal animal)
    {
        animalRepo.save(animal);
    }
    public List<Animal> getAllAnimals() {
        return animalRepo.findAll();
    }

    public Optional<Animal> getAnimalById(Integer id) {
        return animalRepo.findById(id);
    }

    public void updateAnimal(Integer id, Animal updatedAnimal) {
        if (animalRepo.existsById(id)) {
            updatedAnimal.setId_animal(id);
            animalRepo.save(updatedAnimal);
        }
    }

    public void deleteAnimal(Integer id) {
        animalRepo.deleteById(id);
    }
}
