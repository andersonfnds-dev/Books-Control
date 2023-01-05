package desafioHeranca;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totalPags;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	

	public Livro(String titulo, String autor, int totalPags, int pagAtual, boolean aberto, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPags = totalPags;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	public String detalhes() {
		return "Livro em detalhes\n\nTitulo = " + titulo + "\nAutor = " + autor + 
				"\nTotalPags = " + totalPags + ", PagAtual = " + pagAtual
				+ "\nAberto = " + aberto + "\nLeitor = "
				+ leitor.getNome() + ", idade = " + leitor.getIdade()
				+ ", sexo = " + leitor.getSexo();
	}


	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getTotalPags() {
		return totalPags;
	}
	
	public void setTotalPags(int totalPags) {
		this.totalPags = totalPags;
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		aberto = true;
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		aberto = false;
	}

	@Override
	public void folhear(int num) {
		if(aberto == true) {
			pagAtual = num;
		} else {
			pagAtual += 0;
		}
	}
	
	@Override
	public void avancarPag(int num) {
		if(aberto == true && num + pagAtual <= totalPags) {
			pagAtual += num;
		} else {
			pagAtual += 0;
		}
	}

	@Override
	public void voltarPag(int num) {
		if(aberto == true && pagAtual - num >= 0) {
			pagAtual -= num;
		} else {
			pagAtual = 0;
		}
		
	}
	
	
	
	

}
