package com.test.project;

import com.test.project.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController
{
    private final ProductRepository productRepository;

    @Autowired
    public TestController(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @GetMapping("/test")
    public String test(Model model)
    {
        model.addAttribute("tester", productRepository.findAll());
        return "test";
    }
}