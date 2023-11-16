package entites;
public abstract class TaxPayer {

    private String name;
    private Double anualInCome;

    public TaxPayer(){
    }

    public TaxPayer(String name, Double anualInCome) {
        this.name = name;
        this.anualInCome = anualInCome;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualInCome() {
        return anualInCome;
    }

    public void setAnualInCome(Double anualInCome) {
        this.anualInCome = anualInCome;
    }

    public abstract double tax();

}
