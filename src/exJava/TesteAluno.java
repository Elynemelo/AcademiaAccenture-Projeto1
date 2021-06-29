package exJava;

public class TesteAluno {

	public static void main(String[] args) { //Teste 
		
		RepositorioAlunosArray rep = new RepositorioAlunosArray(12);
		
		Curso c1 = new Curso(01, "An�lise e Desenvolvimento de Sistemas"); // Cria��o de novo objeto da classe Curso
		

		Curso c2 = new Curso(02, "Sistemas de Informa��o");
		

		Aluno a1 = new Aluno("Maria Ferreira", "102.687.364-98", 26, c1); // Cria��o de novo objeto da classe Aluno
		rep.inserir(a1);// Chamada do metodo inserir da classe reposit�rioAlunosArray

		Aluno a2 = new Aluno("Ana Lima", "703.895.314-96", 23, c2); 
		rep.inserir(a2);

		Aluno a3 = new Aluno("Luana Silva", "911.452.698-26", 28, c2);
		rep.inserir(a3);

		// chamada do m�todo para procurar aluno da classe RepositorioAlunosArray
		Aluno procurado = rep.procurar("102.687.364-98");
		if (procurado == null) { // valida��o do par�metro passado utilizando as condicionais if else
			System.out.println("N�o existe nenhum aluno com o cpf informado");
		} else {
			System.out.println("Aluno encontrado com sucesso, nome:" + procurado.getNome() + ", cpf:  " + procurado.getCpf());
		}

		// chamada do m�todo para remover aluno da classe RepositorioAlunosArray
		procurado = rep.procurar("911.452.698-21");
		if (procurado == null) {
			System.out.println("N�o existe nenhum aluno com o cpf informado");
		} else {
			rep.remover("911.452.698-21");
			System.out.println("Aluno " + procurado.getNome() + " removido com sucesso!");
		}
	}
}

