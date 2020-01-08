package com.demo.bday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.demo.bday.MainService;

@Component
public class Scheduledtask {
	  private static final Logger logger = LoggerFactory.getLogger(Scheduledtask.class);
	@Autowired
	MainService mainservice;

	@Scheduled(cron = "0 0/1 * * * ?")
	public List<String> checkLogin() throws Exception {
		logger.info("Fixed Rate Task :: Execution Time - {}" + new Date());
		List<String> p = new ArrayList<String>();
		List<String> n = new ArrayList<String>();
		System.out.println("Today's Birthday : ");
		//p.add("Today There is No birthday");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dateobj = new Date();
		List<MainModel> persons = mainservice.findAll();
		for (int i = 0; i < persons.size(); i++)
		{
			int dbdate = persons.get(i).getDate().getDate();
			int dbmonth = persons.get(i).getDate().getMonth();
			
			int curdate = dateobj.getDate();
			int curmonth = dateobj.getMonth();
			if((dbdate == curdate) && (dbmonth == curmonth)) 
			{
				System.out.println(persons.get(i).getuserName());
				p.add(persons.get(i).getuserName());
			}
			
		}
		
		return p;
}
}
