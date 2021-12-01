package com.testmagang.controllers;

import com.testmagang.entity.Penduduk;
import com.testmagang.service.PendudukService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {
    
    @Autowired
    private PendudukService pendudukService;

    @GetMapping
    public String welcome(Model model){
        model.addAttribute("penduduks", pendudukService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("penduduk", new Penduduk());
        return "add";
    }

    @PostMapping("/save")
    public String save(Penduduk penduduk, Model model){
        pendudukService.addPenduduk(penduduk);
        model.addAttribute("penduduks", pendudukService.findAll());
        return "redirect:/";
    }

    @GetMapping("/delete/{nip}")
    public String delete(@PathVariable("nip") Long nip){
        pendudukService.deleteById(nip);
        return "redirect:/";
    }

    @GetMapping("/edit/{nip}")
    public String edit(@PathVariable("nip") Long nip, Model model){
        model.addAttribute("penduduk", pendudukService.findById(nip));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Penduduk penduduk, Model model){
        pendudukService.updatePenduduk(penduduk);
        return "redirect:/";
    }

}