package tr.gov.gib.sf800taskmanager.service;

import tr.gov.gib.sf800taskmanager.dao.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();
    Task findById(Long id);
    void save(Task task);
    void update(Task task);
    void delete(Long id);
}
