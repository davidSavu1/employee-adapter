package bmo.employeeAdapter.service;

import bmo.employeeAdapter.dto.EmployeeDto;
import bmo.employeeAdapter.entity.Employee;
import bmo.employeeAdapter.exception.EmployeeNotFoundException;
import bmo.employeeAdapter.mapper.EmployeeMapper;
import bmo.employeeAdapter.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMapper mapper;

    @Autowired
    public EmployeeService(EmployeeRepository repository,
                           EmployeeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public EmployeeDto findById(int id) {
        Employee employee = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
        return mapper.toDto(employee);
    }

}
