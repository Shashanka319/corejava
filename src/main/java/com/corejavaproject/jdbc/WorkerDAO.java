package com.corejavaproject.jdbc;

public interface WorkerDAO {
    int saveWorker(Worker worker);
    List<Worker> getAllWorkers();
}
