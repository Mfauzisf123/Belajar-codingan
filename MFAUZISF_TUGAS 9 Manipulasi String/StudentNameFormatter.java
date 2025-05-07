public class StudentNameFormatter {
    public static void main(String[] args) {
        String[] students = {
            "Mohamed Ahmed",
            "Mohamed Ali",
            "Mohamed Salah",
            "Mohamed Hassan",
            "Mohamed Ibrahim",
            "Mohamed Noor",
            "Mohamed Farah",
            "Mohamed Yusuf",
            "Mohamed Ismail",
            "Mohamed Kamal"
        };

        for (String student : students) {
            String[] parts = student.split(" ");
            if (parts.length == 2) {
                String first = parts[0];
                String last = parts[1];
                if (first.equalsIgnoreCase("Mohamed")) {
                    first = "Muhammad";
                }
                System.out.println(last + ", " + first);
            }
        }
    }
}
