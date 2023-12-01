package com.app.contrller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.DataEntity;
import com.app.repository.DataRepository;
import com.app.service.DataService;

import java.util.List;

@RestController
public class DataController {

    private final DataService dataService;
    
    @Autowired
    private DataRepository repo;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/sorted")
    public List<DataEntity> getAllDataSortedByTime() {
        // Endpoint to get data sorted by timestamp
        return dataService.getAllDataSortedByTime();
    }
    
    
    @PostMapping("/save")
    public String saveData(@RequestBody DataEntity data) {
    	repo.save(data);
    	return "succes";
    	
    }

    // Other controller methods as needed
}

