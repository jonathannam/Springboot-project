package com.example.SpringMongoProject.Controller;


import com.example.SpringMongoProject.Entity.Chart;
import com.example.SpringMongoProject.Service.ChartServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/barchart")
public class BarChartController {
    private ChartServices ChartServices;

    @GetMapping(value = "/getdata")
    public Map<String, Integer> getAllChartData() {
        List<Chart> chartDataList = ChartServices.getAllChartData();

        return chartDataList.stream()
                .collect(Collectors.toMap(Chart::getName, Chart::getQuantity));
    }

}
