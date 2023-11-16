package application;

import entites.Company;
import entites.Individual;
import entites.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.println("Enter the number of taxpayers:");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Taxpayer: #"+ i + " data: ");
            System.out.println("Individual or company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Anual income:");
            Double anualIncome = sc.nextDouble();
            if (type == 'i'){
                System.out.println("Health expenditures:");
                Double healthExpenditures = sc.nextDouble();
//                list.add(new Individual(name, anualIncome, healthExpenditures));
                Individual x = new Individual(name, anualIncome, healthExpenditures);
                list.add(x);
            }else {
                System.out.println("Number of employess:");
                Integer numberOfemployess = sc.nextInt();
//                 list.add(new Company(name,anualIncome,numberOfemployess));
                Company x = new Company(name,anualIncome,numberOfemployess);
                list.add(x);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tp : list){
            System.out.println(tp.getName() + ": $" +String.format("%.2f",tp.tax()));
        }
        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : list){
            sum += tp.tax();
        }

        System.out.println("Total TAX: " + String.format("%.2f",sum));
        sc.close();
    }
}