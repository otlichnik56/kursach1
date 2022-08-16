import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void infaEmployee(Employee[] dataBase){
        for (int i = 0; i < dataBase.length; i++) {
            System.out.println(dataBase[i]);
        }
    }

    public static void summEmployee(Employee[] dataBase){
        float summ = 0;
        for (int i = 0; i < dataBase.length; i++) {
            summ = summ + dataBase[i].getPay();
        }
        System.out.println("Сумма затрат на зарплату в месяц - " + summ);
    }

    public static void meanEmployee(Employee[] dataBase){
        float summ = 0;
        double mean;
        for (int i = 0; i < dataBase.length; i++) {
            summ = summ + dataBase[i].getPay();
        }
        mean = summ / dataBase.length;
        System.out.println("Средняя зарплата в месяц - " + mean);
    }

    public static void minEmployee(Employee[] dataBase){
        float min = dataBase[0].getPay();
        for (int i = 0; i < dataBase.length; i++) {
            if (dataBase[i].getPay() < min) {
                min = dataBase[i].getPay();
            }
        }
        System.out.println("Минимальная зарплата в месяц - " + min);
    }

    public static void maxEmployee(Employee[] dataBase){
        float max = dataBase[0].getPay();
        for (int i = 0; i < dataBase.length; i++) {
            if (dataBase[i].getPay() > max) {
                max = dataBase[i].getPay();
            }
        }
        System.out.println("Максимальная зарплата в месяц - " + max);
    }

    public static void nameEmployee(Employee[] dataBase){
        for (int i = 0; i < dataBase.length; i++) {
            System.out.println(dataBase[i].getAllName());
        }
    }

    public static void main(String[] args) {

        Employee[] dataBase = new Employee[10];
        Employee employee1 = new Employee("Алексанров И.А.", 1, 123500);
        Employee employee2 = new Employee("Иванов И.И." , 5, 75800);
        Employee employee3 = new Employee("Петров М.П.", 2, 225750);
        Employee employee4 = new Employee("Сидоров И.А.", 1, 100500);
        Employee employee5 = new Employee("Симонов И.И." , 5, 78800);
        Employee employee6 = new Employee("Сергеев М.П.", 2, 202750);
        Employee employee7 = new Employee("Соколов И.А.", 1, 154500);
        Employee employee8 = new Employee("Орлов И.И." , 5, 68800);
        Employee employee9 = new Employee("Воробьёв М.П.", 2, 215750);
        Employee employee10 = new Employee("Цаплин И.А.", 1, 333500);
        dataBase[0] = employee1;
        dataBase[1] = employee2;
        dataBase[2] = employee3;
        dataBase[3] = employee4;
        dataBase[4] = employee5;
        dataBase[5] = employee6;
        dataBase[6] = employee7;
        dataBase[7] = employee8;
        dataBase[8] = employee9;
        dataBase[9] = employee10;

        employee3.setDepartament(5);
        employee5.setPay(700500);

        infaEmployee(dataBase);
        summEmployee(dataBase);
        meanEmployee(dataBase);
        minEmployee(dataBase);
        maxEmployee(dataBase);
        nameEmployee(dataBase);

    }
}