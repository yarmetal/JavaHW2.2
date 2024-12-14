public class Main {
    public static void main(String[] args) {
        int account = 150; // Начальный счёт
        int bonusIn = 100; // Для расчёта бонусов
        int transaction = 1200; // Пополнение
        int bonus; 

        if (transaction >= 1000){
            bonus = transaction / bonusIn;
        } else {
            bonus = 0;
        }

        int total = account + transaction + bonus;

        System.out.println("Счёт пополнен на " + transaction + " руб.");
        System.out.println("Полученный бонус: " + bonus + " руб.");
        System.out.println("Ваш баланс: " + total + " руб.");
    }
}



        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
