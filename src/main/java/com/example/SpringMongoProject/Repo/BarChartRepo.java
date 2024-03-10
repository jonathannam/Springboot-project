package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.Chart;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BarChartRepo {
    List<Chart> getAllChartData();
}
