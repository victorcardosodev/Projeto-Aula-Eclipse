package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Victor Henrique");
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("Av. Fernando Pacheco Jord�o");
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Jd. S�o Luis");
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(8121510);
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("S�o Paulo");
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("S�o Paulo");
		System.out.println(pessoa.getEstado());
		
	}

}
