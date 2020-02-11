package com.codeclan.example.EmployeesLab.repositories;

import com.codeclan.example.EmployeesLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
