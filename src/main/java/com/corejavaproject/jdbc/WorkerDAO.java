package com.corejavaproject.jdbc;

import java.util.List;

public interface WorkerDAO {
    int saveWorker(Worker worker);
    List<Worker> getAllWorkers();
}
