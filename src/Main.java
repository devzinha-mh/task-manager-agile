import model.Task;
import service.TaskService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskService service = new TaskService();

        int option;

        do {

            System.out.println("\n===== TASK MANAGER AGILE =====");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Atualizar tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:

                    System.out.print("Digite o ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o título da tarefa: ");
                    String title = scanner.nextLine();

                    System.out.print("Digite a prioridade: ");
                    String priority = scanner.nextLine();

                    service.addTask(new Task(id, title, priority));

                    System.out.println("Tarefa criada com sucesso!");
                    break;

                case 2:

                    System.out.println("\n===== LISTA DE TAREFAS =====");
                    service.listTasks();
                    break;

                case 3:

                    System.out.print("Digite o ID da tarefa que deseja atualizar: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o novo título: ");
                    String newTitle = scanner.nextLine();

                    service.updateTask(updateId, newTitle);

                    System.out.println("Tarefa atualizada!");
                    break;

                case 4:

                    System.out.print("Digite o ID da tarefa que deseja remover: ");
                    int removeId = scanner.nextInt();

                    service.removeTask(removeId);

                    System.out.println("Tarefa removida!");
                    break;

                case 0:

                    System.out.println("Sistema encerrado com sucesso...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (option != 0);

        scanner.close();
    }
}
