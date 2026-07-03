package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Log4j2
public class WorkerDAOImpl implements WorkerDAO {

    @Override
    public int saveWorker(Worker worker) {
        int response=0;
        String sql="insert into employees(first_name,last_name,email) values(?,?,?)";
        try(Connection connection = DBConnections.getEmployeeConnection();
            PreparedStatement statement=connection.prepareStatement(sql)){
            statement.setString(1,worker.firstName());
            statement.setString(2,worker.lastName());
            statement.setString(3,worker.email());
            response=statement.executeUpdate();
        }catch (Exception e){
            log.error("Exception while saving the worker Detaile:{}",e);
        }
        log.info("Inserted the worker detailes,index values:{}",response);
        return response;
    }

    @Override
    public List<Worker> getAllWorkers() {
        List<Worker> list=new ArrayList<>();
        String sql ="select first_name,last_name,email from employees";
        try(Connection connection=DBConnections.getEmployeeConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery()){
            while (resultSet.next()){
                String firstName=resultSet.getString("first_name");
                String lastName=resultSet.getString("last_name");
                String email=resultSet.getString("email");
                Worker worker=new Worker(firstName,lastName,email);
                list.add(worker);
            }
        }catch (Exception exp){
            log.error("Exception while getting all workers",exp);
        }
        return list;
    }
}
