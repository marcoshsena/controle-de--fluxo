public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }
        else
            System.out.println("Saldo Insuficiene");
        


        int nota = 8;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");


    }
}
