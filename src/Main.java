public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // Начальный баланс

        // Сумма пополнения
        int topUpAmount = 1100; // Сумма пополнения
        int bonus = 11; // 1 рубль за каждые 100 рублей при пополнение свыше 1000

        // Итоговая сумма на счету клиента
        int finalBalance = initialBalance + topUpAmount + bonus;

        System.out.println("Начальная сумма на счету: " + initialBalance + " рублей");
        System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }

}

