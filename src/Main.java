import model.Task;
import service.TaskService;

public class Main {
    public static void main(String[] args) {

        TaskService service = new TaskService();

        service.addTask(new Task(1, "Estudar Java"));
        service.addTask(new Task(2, "Fazer trabalho"));

        service.listTasks();

    }
}
