package ru.bainc.spring.mvc_hibernate_aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bainc.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.bainc.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;


@Controller
@RequestMapping("/")
public class MyController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("employee")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
