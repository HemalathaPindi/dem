package com.example.demo3.controler;

//import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.model.Application;
import com.example.demo3.model.DataProviders;

@RestController
@RequestMapping("/FINDLG1")
public class RestControler {

	@GetMapping(path = "/getJSON1", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> doGetJson() {

		Application application = new Application();
		DataProviders dataProvider01 = new DataProviders("2012-07-27",13);
		
		DataProviders dataProvider02 = new DataProviders("2012-07-28",11);
		DataProviders dataProvider03= new DataProviders("2012-07-29",15);
		DataProviders dataProvider04= new DataProviders("2012-07-30",16);
		DataProviders dataProvider05= new DataProviders("2012-07-31",18);
		DataProviders dataProvider06= new DataProviders("2012-08-01",13);
		DataProviders dataProvider07= new DataProviders("2012-08-02",22);
		DataProviders dataProvider08= new DataProviders("2012-08-03",23);
		DataProviders dataProvider09= new DataProviders("2012-08-04",20);
		DataProviders dataProvider10= new DataProviders("2012-08-05",17);
		DataProviders dataProvider11= new DataProviders("2012-08-06",16);
		DataProviders dataProvider12= new DataProviders("2012-08-07",15);
		DataProviders dataProvider13= new DataProviders("2012-08-08",15);
		
		
		
		application.setDataProvidersObject(new DataProviders[] {dataProvider01,dataProvider02,dataProvider03,dataProvider04,
				dataProvider05,dataProvider06,dataProvider07,dataProvider08,dataProvider09,dataProvider10,
				dataProvider11,dataProvider12,dataProvider13});

		/*
		 * ob.setAdd("Manjera trinity"); ob.setAge(28); ob.setName("Madhu");
		 * ob.setPincode(500090);
		 */

		return new ResponseEntity<>(application, HttpStatus.OK);

	}
}