package com.strategy.teste;

public class Main {
  
  	public static void main(String[] args) {
        Calcular calculadora = new Calcular();
        while(true)
        {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Informe o primeiro valor");
        	int num1 = input.nextInt();
            System.out.println("Informe o primeiro valor");
            int num2 = input.nextInt();
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            int op = input.nextInt();
            if(op == 1)
            {
                calculadora.calcular = new Soma();
                calculadora.Operacao(num1, num2);
            }
            if (op == 2)
            {
                calculadora.calcular = new Subtracao();
                calculadora.Operacao(num1, num2);
            }
            if(op == 3)
            {
                calculadora.calcular = new Multiplicacao();
                calculadora.Operacao(num1, num2);
                }
        }
	}

}
