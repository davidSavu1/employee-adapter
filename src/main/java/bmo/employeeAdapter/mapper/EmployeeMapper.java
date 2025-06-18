package bmo.employeeAdapter.mapper;

import bmo.employeeAdapter.dto.EmployeeDto;
import bmo.employeeAdapter.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getName());
    }

    public Employee toEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setId(dto.getId());
        employee.setName(dto.getName());
        return employee;
    }
}
