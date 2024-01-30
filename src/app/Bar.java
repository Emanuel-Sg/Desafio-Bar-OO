package app;
import entities.Bill;

import java.util.Locale;
import java.util.Scanner;
public class Bar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        System.out.println("Sexo (F/M): ");
        bill.gender = sc.next().charAt(0);
        System.out.println("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.println("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.println("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        sc.close();

        System.out.println("RELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
        if (bill.cover() != 0.00){
            System.out.printf("Couvert = R$ %.2f%n", bill.cover());
        } else {
            System.out.println("Isento de Couvert");
        }
        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
        System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());
    }
}
