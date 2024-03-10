package com.vivek.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	 public String getDemo(Integer id) {
		 int i=10/0;
		 return "index";
	 }

}
