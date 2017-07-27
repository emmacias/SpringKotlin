package com.example.demoCrudRepository

import org.springframework.data.repository.CrudRepository

/**
 * Created by josediaz on 7/27/17.
 */
interface AlumnoRepository : CrudRepository<Alumno, Long>{

    fun findByLastName(lastName: String): Iterable<Alumno>
}