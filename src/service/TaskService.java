package service;

import model.Task;
import java.util.ArrayList;

public class TaskService {
     private ArrayList<Task> tasks = new ArrayList<>();

     public void addTask(Task task){
         tasks.add(task);
     }

     public void listTasks() {
         for (Task task : tasks) {
             System.out.println(task);
         }
     }
    public void updateTask(int id, String newTitle) {

        for (Task task : tasks) {

            if(task.getId() == id) {
                task.setTitle(newTitle);
            }
        }
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
