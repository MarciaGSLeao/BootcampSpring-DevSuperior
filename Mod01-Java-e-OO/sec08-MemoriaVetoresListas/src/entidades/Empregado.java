package entidades;

public class Empregado {

    private Integer id;
    private String name;
    private Double salary;

    public Empregado(){
    }
    public Empregado(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumentoSalarial (Double percentual){
        this.salary = this.salary * (1 + (percentual/100));
    }

}
