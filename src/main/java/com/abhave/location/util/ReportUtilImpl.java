package com.abhave.location.util;

import org.jfree.chart.ChartFactory;

import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReportUtilImpl implements ReportUtil {


    @Override
    public void generatePieChart(String path, List<Object[]> data) {

        DefaultPieDataset dataSet = new DefaultPieDataset();
        for (Object[] objects : data) {
            dataSet.setValue(objects[0].toString(), new Double(objects[1].toString()));
        }
        JFreeChart chart = ChartFactory.createPieChart3D("Location type report", dataSet);
        try {
            ChartUtils.saveChartAsJPEG(new File(path), chart, 300, 300);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
