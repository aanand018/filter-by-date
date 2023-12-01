package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.DataEntity;
import com.app.repository.DataRepository;

import java.util.List;

@Service
public class DataService {

    private final DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public List<DataEntity> getAllDataSortedByTime() {
        // Use the custom query method to get data sorted by timestamp
        return dataRepository.findAllByOrderByTimestampDesc();
    }

    // Other service methods as needed
}

