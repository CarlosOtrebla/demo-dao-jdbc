package model_dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
  
  void insert(Department obj);
  void update(Department id);
  void deleteById(Integer id);
  Department findById(Integer id);
  List<Department> findAll();
    
}
