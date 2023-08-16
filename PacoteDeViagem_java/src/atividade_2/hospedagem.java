package atividade_2;

import java.util.Scanner;

public class hospedagem {

    Scanner receba = new Scanner(System.in);

    int descricao;
    
    public double descri(int valor2) {

        System.out.println("escolha a hospedagem desejada:\n\t(1)Gramado Hotel Palace\t\t(2)Bahia Hotel buffalo\t\t(3)Salvador Hotel tenerife\t\t(4)Santa Catarina Hotel camboriu");

        descricao = receba.nextInt();

        if (descricao == 1) {
            valor2 = 120;
            System.out.println("Hotel palace: R$120 a diaria");
        } else if (descricao == 2) {
            valor2 = 180;
            System.out.println("Hotel buffalo: R$180 a diaria");
        } else if (descricao == 3) {
            valor2 = 150;
            System.out.println("Hotel salvador: R$150 a diaria");

        } else if (descricao == 4) {
            valor2 = 320;
            System.out.println("Hotel camboriu: R$320 a diaria");
        }
        return valor2;

    }

    
}
