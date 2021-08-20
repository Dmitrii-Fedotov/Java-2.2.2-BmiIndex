public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi = service.calculate(101, 1.95);

        System.out.println(bmi);

//        Таблица категорий:
//        Крайний недостаток веса - менее 16.5
//        Недостаток в весе от 16.5 до 18.4
//        Нормальный вес тела от 18.5 до 24.9
//        Избыточная масса тела от 25 до 30
//        Ожирение (Класс I) от 30.1 до 34.9
//        Ожирение (Класс II - тяжелое) от 35 до 40
//        Ожирение (Класс III - крайне тяжелое) более 40
    }
}
