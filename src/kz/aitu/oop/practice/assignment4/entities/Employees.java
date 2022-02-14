package kz.aitu.oop.practice.assignment4.entities;

public class Employees {
    private int id ;
    public static int id_gen = 0;
    private String name ,surname ;
    private String position = "/n";
    private double salary; 
    Employees(){
        id = id_gen++;
    }
    public Employees(int id , String name , String surname , String position , int salary){
        setId(id);
        setSurname(surname); setName(name); setPosition(position); setSalary(salary);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
