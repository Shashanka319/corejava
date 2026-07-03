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

    public int updateWorkerNameByEmail(String email, String newFirstName, String newLastName) {
        int response = 0;
        String sql = "UPDATE employees SET first_name = ?, last_name = ? WHERE email = ?";

        try (Connection connection = DBConnections.getEmployeeConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, newFirstName);
            statement.setString(2, newLastName);
            statement.setString(3, email);

            response = statement.executeUpdate();
            log.info("Worker updated successfully. Rows affected: {}", response);
        } catch (Exception e) {
            log.error("Exception while updating the worker details: {}", e.getMessage(), e);
        }
        return response;
    }
    public int deleteWorkerByEmail(String email) {
        int response = 0;
        String sql = "DELETE FROM employees WHERE email = ?";

        try (Connection connection = DBConnections.getEmployeeConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);

            response = statement.executeUpdate();
            log.info("Worker deleted successfully. Rows affected: {}", response);
        } catch (Exception e) {
            log.error("Exception while deleting the worker: {}", e.getMessage(), e);
        }
        return response;
    }
}
