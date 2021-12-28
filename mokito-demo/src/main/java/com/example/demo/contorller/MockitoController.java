package com.example.demo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MockitoService;

@RestController
@RequestMapping("/mockito")
public class MockitoController {
	
	@Autowired
	MockitoService mockitoService;
	
	@GetMapping("/getSum/{first}/{second}")
	public Integer sum(@PathVariable Integer first,@PathVariable Integer second)
	{
		
		return mockitoService.getSum(first, second);
		
	}

}
