package atividade_2;

import java.util.Scanner;

public class transporte {

    int tipo;
   

    Scanner receba = new Scanner(System.in);

    
    
    
    
    
            //metodo de valor de viagem
    public double valorDaViagem(double valor1) {
System.out.println("digite o tipo de viagem que deseja: \n(1)aereo\t(2)rodoviario\t(3)maritimo");
        tipo = receba.nextInt();
        if (tipo == 1) {

            valor1 = 670.00;
            System.out.println("valor da viagem aerea: R$ "+valor1);
                
        } else if (tipo == 2) {

            valor1 = 325.00;
            System.out.println("valor da viagem rodoviaria: R$ "+valor1);
                
        } else if (tipo == 3) {

            valor1= 550.00;
            System.out.println("valor da viagem maritima: R$ "+valor1);
              
        }
        return valor1;

    }

    
}
