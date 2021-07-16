package com.example.webapp3.Controller;

import com.example.webapp3.Model.Employee;
import com.example.webapp3.Service.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

    @Autowired
    EmployeeRepo employeeRepo;
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("addEmployee")
    public String addEmployee(Employee ob){
        System.out.println(ob);
        employeeRepo.save(ob);
        return "home";
    }
    @RequestMapping("fetchData")
    public ModelAndView addEmployee(int id){
        Employee ob = employeeRepo.findById(id).orElse(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("fetchedData");
        modelAndView.addObject("fetchedData",ob);
        return modelAndView;
    }
}
