package com.sxg.springboot.controller;

import com.sxg.springboot.dao.DepartmentDao;
import com.sxg.springboot.dao.EmployeeDao;
import com.sxg.springboot.entities.Department;
import com.sxg.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@SuppressWarnings("ALL")
@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String empsList(Model model) {
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps", all);

        return "emps/list";
    }

    @GetMapping("/emp")
    public String toAdd(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emps/add";
    }
}
