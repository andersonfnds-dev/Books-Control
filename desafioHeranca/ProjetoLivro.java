package desafioHeranca;

public class ProjetoLivro {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Andre", 25, "masculino");
		
		Livro l1 = new Livro("Anna Karienina", "Liev Tostoi", 814, 0, false, p1);
		
		Pessoa p2 = new Pessoa("Ana", 29, "feminino");
		
		Livro l2 = new Livro("O exorcista", "Willian Blatty", 335, 0, false, p2);
		
		
		l1.abrir();
		l1.avancarPag(25);
		l1.fechar();
		
		l2.abrir();
		l2.avancarPag(135);
		l2.fechar();
		
		System.out.println(l1.detalhes());
		System.out.println(l2.detalhes());
	}

}
