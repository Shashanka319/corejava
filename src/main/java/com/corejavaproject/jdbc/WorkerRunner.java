package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class WorkerRunner {
    public static void main(String[] args) {
        Worker worker =new Worker("Kumbar","Shashank","shashank1727@gmail.com");
        WorkerDAO workerDAO=new WorkerDAOImpl();
      ;
        log.info("Save the worker Detailes:{}",  workerDAO.saveWorker(worker));
        log.info("Worker detailes in current Database:{}",workerDAO.getAllWorkers());

        log.info("Updates Info:{}",workerDAO.updateWorkerNameByEmail("shashank1727@gmail.com","Shankar","Kumbar"));
        log.info("Workers Detailes After Update:{}",workerDAO.getAllWorkers());
    }
}
