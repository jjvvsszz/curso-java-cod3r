package fundamentos.desafios.operadores;

public class DesafioAritimeticos {

     public static void main(String[] args) {

          double bloco1 = Math.pow((6*(3+2)), 2)/(3*2);
          double bloco2 = Math.pow(((1-5)*(2-7))/2.0,2);
          double bloco3 = Math.pow(bloco1 - bloco2, 3);
          double resultado = bloco3 / Math.pow(10, 3);

          System.out.println((int)resultado);
     }
}
