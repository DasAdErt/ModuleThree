public class Employee {
    String fio;
    String position;
    String email;
    String phoneNumber;
    int payDay;
    int age;

    public Employee(String fio, String position, String email, String phoneNumber, int payDay, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payDay = payDay;
        this.age = age;

        if (this.age > 40){
            System.out.println(
                    "\nФИО: " + this.fio +
                            "\nДолжность: " + this.position +
                            "\nЭлектронная почта: " + this.email +
                            "\nНомер телепхона: " + this.phoneNumber +
                            "\nЗарплата (её нет): " + this.payDay +
                            "\nГодиков: " + this.age
            );
        }
    }
}
