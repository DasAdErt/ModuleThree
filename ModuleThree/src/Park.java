public class Park {
    private String name;

    public Park(String name) {
        this.name = name;

        System.out.println("\n\nНазвание парка: " + this.name);
    }

    public static class Attraction {
        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;

            System.out.println(
                    "\nНазвание аттракционна: " + this.name +
                            "\nВремя работы тюрьмы: " + this.workTime +
                            "\nСтоимость: " + this.price + " Рублей"
            );
        }
    }
}
