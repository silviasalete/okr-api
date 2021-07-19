package com.okr.controller;

import com.okr.models.Objective;
import com.okr.repository.ObjectiveRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
@Api(value="Objectives API REST")
@CrossOrigin(origins = "*")
public class ObjectiveResource {

    @Autowired
    ObjectiveRepository objectiveRepository;

    @GetMapping("/objectives")
    @ApiOperation(value = "List of Objectives")
    public List<Objective> findAll(){
        List<Objective> a = objectiveRepository.findAll();
        return objectiveRepository.findAll();
    }

    @GetMapping("/objective/{id}")
    @ApiOperation(value = "Get Objective by Id")
    public Optional<Objective> findById(@PathVariable String id){
        return objectiveRepository.findById(Long.parseLong(id));
    }

    @PostMapping("/objective")
    @ApiOperation(value = "Save a Objective")
    public Objective save(@RequestBody Objective objective){
        return objectiveRepository.save(objective);
    }

    @DeleteMapping("/objective")
    @ApiOperation(value = "Delete a Objective")
    public void delete(@RequestBody Objective objective){
        objectiveRepository.delete(objective);
    }

    @PutMapping("/objective")
    @ApiOperation(value = "Update a Objective")
    public Objective update(@RequestBody Objective objective){
        return objectiveRepository.save(objective);
    }
}
