package entites;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual (){
    }

    public Individual(String name, Double anualInCome, Double healthExpenditures) {
        super(name, anualInCome);
        this.healthExpenditures = healthExpenditures;
    }
    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {

//      Outra forma de digitar: double basicTax = (getAnualInCome() < 20000.0) ? getAnualInCome() * 15.0/100 : getAnualInCome() * 25.0/100;

        double basicTax;
        if (getAnualInCome() < 20000.0){
            basicTax = getAnualInCome() * 15.0/100;
        } else {
            basicTax = getAnualInCome() * 25.0/100;
        }
//      Também pode escrever dessa forma:  basicTax = basicTax - getHealthExpenditures() * 0.5;
        basicTax -= getHealthExpenditures() * 0.5;
        if (basicTax < 0.0){
            basicTax = 0.0;
        }else {
            return basicTax;
        }
        return basicTax;
    }
}
