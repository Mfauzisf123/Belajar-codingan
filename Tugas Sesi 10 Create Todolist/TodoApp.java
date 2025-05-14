import java.io.*;
import java.util.*;

public class TodoApp {
    static final String FILE_NAME = "Todo.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> todos = loadTodos();

        while (true) {
            // Menampilkan daftar todo
            System.out.println("\n--- TODO LIST ---");
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }

            // Menampilkan menu pilihan
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Todo");
            System.out.println("2. Update Todo");
            System.out.println("3. Delete Todo");
            System.out.println("4. Exit");
            System.out.print(">> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Menambahkan todo baru
                    System.out.print("Enter new todo: ");
                    String newTodo = scanner.nextLine();
                    todos.add(newTodo);
                    saveTodos(todos);
                    break;

                case "2":
                    // Memperbarui todo
                    System.out.print("Enter the todo number to update: ");
                    int updateIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    if (isValidIndex(updateIndex, todos)) {
                        System.out.print("Enter updated todo: ");
                        String updatedTodo = scanner.nextLine();
                        todos.set(updateIndex, updatedTodo);
                        saveTodos(todos);
                    } else {
                        System.out.println("Invalid number!");
                    }
                    break;

                case "3":
                    // Menghapus todo
                    System.out.print("Enter the todo number to delete: ");
                    int deleteIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    if (isValidIndex(deleteIndex, todos)) {
                        todos.remove(deleteIndex);
                        saveTodos(todos);
                    } else {
                        System.out.println("Invalid number!");
                    }
                    break;

                case "4":
                    // Keluar dari program
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    // Membaca todo dari file
    static List<String> loadTodos() {
        List<String> todos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                todos.add(line);
            }
        } catch (IOException e) {

        }
        return todos;
    }
    static void saveTodos(List<String> todos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String todo : todos) {
                writer.write(todo);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Failed to save todos: " + e.getMessage());
        }
    }

    // Mengecek index yang valid
    static boolean isValidIndex(int index, List<String> todos) {
        return index >= 0 && index < todos.size();
    }
}
