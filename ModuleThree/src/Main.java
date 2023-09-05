public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Иван Иванович", "Работник месяца",
                "att@mail.ru", "+7(800)555-35-35", 55555, 55);

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Щукин Марк Иванович", "Сталевар",
                "frenelozoppe-7559@yopmail.com", "+7(286)932-20-14", 81556, 58);

        persArray[1] = new Employee("Игнатьев Варлам Леонидович", "Кровельщик",
                "pemmoicrejoupa-5512@yopmail.com", "+7(208)014-00-26", 32597, 68);

        persArray[2] = new Employee("Ковалёв Максим Иринеевич", "Лингвист",
                "quillissequeddeu-6897@yopmail.com", "+7(402)331-65-48", 59602, 74);

        persArray[3] = new Employee("Молчанов Соломон Владимирович", "Прозектор",
                "lauxefobriffei-2401@yopmail.com", "+7(963)219-39-81", 97126, 666);

        persArray[4] = new Employee("Смирнов Иван Аристархович", "Орнитолог",
                "bazetebrolu-6249@yopmail.com", "+7(936)501-06-52", 54284, 34);

        Park park = new Park("Зоолэнд");
        Park.Attraction сarousel = new Park.Attraction("АТТ", "9:00 - 22:00", 0);
    }
}