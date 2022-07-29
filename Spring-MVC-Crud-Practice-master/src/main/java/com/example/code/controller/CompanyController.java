package com.example.code.controller;

import com.example.code.model.Company;
import com.example.code.service.CompanyService;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.Console;
import java.util.List;

@Controller()
public class CompanyController {

    private final CompanyService service;
    private int id;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(){
        return "redirect:/company";
    }

    @GetMapping("company")
    public ModelAndView home(){
        List<Company> companies = service.getCompanies();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("companies", companies);

        return mav;
    }

    @GetMapping("company-add")
    public String createCompany(){
        return "create-company";
    }

    @RequestMapping(value = "company-create", method = RequestMethod.POST)
    public String addCompany(Company company){
        service.addCompany(company);
        return "redirect:/company";
    }

    @GetMapping("company-edit/{id}")
    public ModelAndView editCompany(@PathVariable int id){
        Company company = service.getCompanyById(id);
        ModelAndView mav = new ModelAndView("update-company");
        mav.addObject("company", company);

        return mav;
    }

    @PostMapping("company-update")
    public String updateCompany(Company company){

        this.service.updateCompany(company);
        return "redirect:/company";
    }

    @GetMapping("company-delete/{id}")
    public String deleteCompany(@PathVariable int id){
        this.service.deleteCompany(id);
        return "redirect:/company";
    }
}
