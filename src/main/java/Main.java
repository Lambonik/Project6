import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();
        System.out.println("Фрилансер отдохнет " + service.calculate(10000, 3000, 20000) + " месяца.");
    }
}
