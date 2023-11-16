package entites;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(){
    }

    public Company(String name, Double anualInCome, int numberOfEmployees) {
        super(name, anualInCome);
        this.numberOfEmployees = numberOfEmployees;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {

        if (numberOfEmployees > 10){
            return getAnualInCome() * 0.14;
        } else {
            return getAnualInCome() * 0.16;
        }
    }
}
