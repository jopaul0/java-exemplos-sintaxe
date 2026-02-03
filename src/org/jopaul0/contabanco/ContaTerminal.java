package org.jopaul0.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    private int number;
    private String agency;
    private String name;
    private double cash;


    public ContaTerminal(int number, String agency, String name, double cash) {
        this.number = number;
        this.agency = agency;
        this.name = name;
        this.cash = cash;
    }

    // Getters
    public int getNumber() {
        return number;
    }
    public String getAgency() {
        return agency;
    }
    public String getName() {
        return name;
    }
    public double getCash() {
        return cash;
    }

    // Setters
    public void setNumber(int number) {
        this.number = number;
    }
    public void setAgency(String agency){
        this.agency = agency;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }

    // Methods
    public static void createAccount() {
        System.out.println("Criando uma nova conta...");

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, insira a agência:");
        String agency = scanner.nextLine();

        System.out.println("Por favor, insira o número da conta:");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, insira o nome do titular:");
        String name = scanner.nextLine();

        System.out.println("Por favor, insira o saldo inicial:");
        double cash = scanner.nextDouble();

        ContaTerminal account = new ContaTerminal(number, agency, name, cash);

        System.out.println("Conta criada com sucesso!");
        account.printAccountDetails();
    }

    private void printAccountDetails() {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque \n", this.getName(), this.getAgency(), this.getNumber(), this.getCash());
    }

}
