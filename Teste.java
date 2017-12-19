import java.util.*;
import java.lang.*;
import java.util.function.*;


public class Teste{
   public static void main(String[] args){
       Cliente c1 = new Cliente("michelli", true, "123");
       Cliente c2 = new Cliente("bruno", true, "456");
       c1.autenticaSenha("852");


       List<Cliente> clientes = Arrays.asList(c1, c2);

        // MostraCliente mc = new MostraCliente();
        // clientes.forEach(mc);

        // Consumer<Cliente> consumidor = new Consumer<Cliente>(){ //CLASSE ANÔNIMA
        //     public void accept(Cliente c){
        //         System.out.println(c.getNome());
        //     }
        // };
       //clientes.forEach(consumidor);

        clientes.forEach(c -> System.out.println(c.getNome())); //EXPRESSÃO LAMBDA

        Runnable r = () -> System.out.println("Olá mundo!"); //EXPRESSÃO LAMBDA
        new Thread(r).start();

   }
}
