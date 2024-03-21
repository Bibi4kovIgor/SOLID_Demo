package edu.lemon.singleresponsibility.database;

import edu.lemon.singleresponsibility.model.Report;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Report> reports;

    public Database() {
        reports = new ArrayList<>();
    }

    public void save(Report report) {
        reports.add(report);
    }

    public List<Report> getReports() {
        return reports;
    }
}
