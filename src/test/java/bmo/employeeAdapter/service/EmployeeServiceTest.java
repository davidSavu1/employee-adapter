package bmo.employeeAdapter.service;

import bmo.employeeAdapter.dto.EmployeeDto;
import bmo.employeeAdapter.exception.EmployeeNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testFindByIdOk() {
        EmployeeDto dto = employeeService.findById(1);
        Assertions.assertEquals(1, dto.getId());
        Assertions.assertEquals("Alice", dto.getName());
    }

    @Test
    public void testFindByIdNotFound() {
        Assertions.assertThrows(EmployeeNotFoundException.class, () -> {
            employeeService.findById(999);
        });
    }
}
