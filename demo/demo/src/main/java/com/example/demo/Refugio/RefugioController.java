package com.example.demo.Refugio;

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
@RequestMapping("/refugio")
public class RefugioController {

    private final RefugioService refugioService;

    public RefugioController(RefugioService refugioService) {
        this.refugioService = refugioService;
    }

    @PostMapping
    public void createRefugio(@RequestBody Refugio refugio) {
        refugioService.createRefugio(refugio);
    }
    @GetMapping
    public ResponseEntity<List<Refugio>> getAllRefugios() {
        List<Refugio> refugios = refugioService.getAllRefugios();
        return new ResponseEntity<>(refugios, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateRefugio(@PathVariable Integer id, @RequestBody Refugio updatedRefugio) {
        refugioService.updateRefugio(id, updatedRefugio);
        return new ResponseEntity<>("Refugio actualizado exitosamente", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRefugio(@PathVariable Integer id) {
        refugioService.deleteRefugio(id);
        return new ResponseEntity<>("Refugio eliminado exitosamente", HttpStatus.OK);
    }
}
