package com.demo.bday;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.demo.bday.MainModel;
import com.demo.bday.MainRepository;


@Service
public class MainService {
	

    @Autowired
    private MainRepository repository;

    public List<MainModel> findAll() {

        return (List<MainModel>) repository.findProjects();
    }
    
    
  
}