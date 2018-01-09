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

        //clientes.forEach(c -> System.out.println(c.getNome())); //EXPRESSÃO LAMBDA

        clientes.forEach(Cliente::getNome); //METHOD REFERENCE


        Cliente c3 = new Cliente("Ana", false, "333");

        Consumer<Cliente> consumidor1 = Cliente::getNome; //METHOD REFERENCE
        consumidor1.accept(c3);

        Runnable r1 = c3::getNome; //METHOD REFERENCE
        r1.run();



        Runnable r = () -> System.out.println("Olá mundo!"); //EXPRESSÃO LAMBDA
        new Thread(r).start();
        
   }
}
