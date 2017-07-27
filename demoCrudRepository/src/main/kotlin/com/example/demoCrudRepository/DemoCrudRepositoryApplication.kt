package com.example.demoCrudRepository


import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoCrudRepositoryApplication{



        private val log = LoggerFactory.getLogger(DemoCrudRepositoryApplication::class.java)

        @Bean
        fun init(repository: AlumnoRepository) = CommandLineRunner {
            // save a couple of alumnos
            repository.save(Alumno("Elias", "Diaz"))
            repository.save(Alumno("Felipe", "Diaz"))
            repository.save(Alumno("Deborah", "Diaz"))
            repository.save(Alumno("Maria", "Diaz"))
            repository.save(Alumno("Daniel", "Diaz"))

            // fetch all alumnos
            log.info("Alumnos found with findAll():")
            log.info("-------------------------------")
            for (alumno in repository.findAll()) {
                log.info(alumno.toString())
            }
            log.info("")

            // fetch an individual alumno by ID
            val alumno = repository.findOne(1L)
            log.info("Alumno found with findOne(1L):")
            log.info("--------------------------------")
            log.info(alumno.toString())
            log.info("")

            // fetch alumnos by last name
            log.info("Alumno found with findByLastName('Bauer'):")
            log.info("--------------------------------------------")
            for (diaz in repository.findByLastName("Diaz")) {
                log.info(diaz.toString())
            }
            log.info("")
        }


}

fun main(args: Array<String>) {
    SpringApplication.run(DemoCrudRepositoryApplication::class.java, *args)
}
