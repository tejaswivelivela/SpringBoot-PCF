package com.assign.microservice.MicroServiceDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TemperatureConversion {
	
	@GetMapping("temp-convert/from/{from}/to/{to}/temperature/{tem}")
	public TempConvertBean conversion( @PathVariable String from, @PathVariable String to, @PathVariable int tem) {
		
		TempConvertBean temp = new TempConvertBean();
		temp.setFrom(from);
		temp.setTo(to);
		temp.setConversionValue((tem*1.8)+32);		
		return temp;
		
	}	
}
