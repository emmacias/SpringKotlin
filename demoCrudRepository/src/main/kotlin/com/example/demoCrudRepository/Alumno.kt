package com.example.demoCrudRepository

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by josediaz on 7/27/17.
 */
@Entity
class Alumno(
        val firstName: String,
        val lastName: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {

    override fun toString(): String {
        return "Alumno(id=$id, firstName='$firstName', lastName='$lastName')"
    }
}