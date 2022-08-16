public class Employee {
    int id;
    static int counter = 0;
    String allName;
    int departament;
    float pay;

    public Employee(String allName, int departament, float pay) {
        counter = counter + 1;
        id = counter;
        this.allName = allName;
        this.departament = departament;
        this.pay = pay;
    }

    public int getId() {
        return id;
    }


    public String getAllName() {
        return allName;
    }


    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public String toString() {
        return "id сотрудника: " + this.id + ",  Ф.И.О.: " + this.allName + ", Отдел №" + this.departament + ",  З/П: " + this.pay;
    }
}
