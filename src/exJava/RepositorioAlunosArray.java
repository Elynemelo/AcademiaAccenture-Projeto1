package exJava;

public class RepositorioAlunosArray {
	private Aluno[] alunos;
	private int indice;

	public RepositorioAlunosArray(int tamanho) {
		indice = 0;
		alunos = new Aluno[tamanho];
	}
	//m�todo para inserir aluno
	public void inserir(Aluno a) {
		alunos[indice] = a;
		indice = indice + 1;
	}

	//m�todo para procurar Aluno, passando o cpf como par�metro
	public Aluno procurar(String cpf) {
		for (int x = 0; x < indice; x++) {
			Aluno wtd = this.alunos[x];
			if (wtd.getCpf().equals(cpf))
				return wtd;
		}
		return null;
	}

//m�todo para remover aluno passando cpf como par�metro
	public void remover(String cpf) {
		for (int x = 0; x < indice; x++) {
			Aluno wtd = this.alunos[x];
			if (wtd.getCpf().equals(cpf)) {
				this.alunos[x] = this.alunos[indice - 1];
				this.alunos[indice - 1] = null;
				indice = indice - 1;
			}
		}
	}
}
