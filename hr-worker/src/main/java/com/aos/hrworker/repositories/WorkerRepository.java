package com.aos.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aos.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
