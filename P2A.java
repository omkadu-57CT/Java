// write a program to implement method overriding using java

class Employee {
    public void calculateSalary() {
        System.out.print("this is the base function\n"); 
    }
}

class Manager extends Employee {

    private String s;
    private int salary;

    Manager(String s, int salary) {
        this.s = s;
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("manager's name: "+this.s+"\nsalary: "+this.salary);
    }
}


class Programmer extends Employee {

    private String s;
    private int salary;

    Programmer(String s, int salary) {
        this.s = s;
        this.salary = salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("programmer's name: "+this.s+"\nsalary: "+this.salary);
    }
}

class Main1 {
public static void main(String[] args) {
    Employee e1 = new Manager("abc", 260000);
    Employee e2 = new Programmer("xyz", 20000);
    e1.calculateSalary();
    e2.calculateSalary();
}
}