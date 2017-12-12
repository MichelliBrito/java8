import java.util.*;
import java.lang.*;

public class Teste{
   public static void main(String[] args){
       Cliente c1 = new Cliente("michelli", true, "123");
       Cliente c2 = new Cliente("bruno", true, "456");
       c1.autenticaSenha("852");


       List<Cliente> clientes = Arrays.asList(c1, c2);
       MostraCliente mc = new MostraCliente();
       clientes.forEach(mc);
   }
}
