package com.example.demoCrudRepository;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AlumnoController(val repository: AlumnoRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{lastName}")
    fun findByLastName(@PathVariable lastName:String)
            = repository.findByLastName(lastName)


}

