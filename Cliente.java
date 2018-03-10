public class Cliente implements Autentica{
   private String nome;
   private boolean status;
   private String senha;
   private int pontos;

   public Cliente(String nome, boolean status, String senha, int pontos){
       this.nome = nome;
       this.status = status;
       this.senha = senha;
       this.pontos = pontos;
   }

   public String getNome(){
       System.out.println(this.nome);
       return this.nome;
   }

   public boolean getStatus(){
       return this.status;
   }

   public String getSenha(){
       return this.senha;
   }

   public int getPontos(){
       return this.pontos;
   }

    public boolean autenticaSenha(String senha) {
	if(this.senha != senha){
		System.out.println("Não autenticado!");
		return false;
	}
	System.out.println("Autenticado!");
	return true;
}



}
