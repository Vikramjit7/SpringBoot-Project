package com.example.demo.repository2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.bean2.Employee;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface Reposit extends JpaRepository<Employee, Integer>{

}
