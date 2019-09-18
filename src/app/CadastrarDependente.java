package app;

import java.util.LinkedList;

public class CadastrarDependente {
	

	//cadastrar um dependente = alocar cada parametro desse metodo em seu vetor especifico.
	Contribuinte source; // Referência para objeto de origem
	DadosNascimento dependente; //Parâmetro para cadastro da função
	private int numDependentes;
	private String[] tempDependentes;
	private boolean alocacaoNomeDependente;
	private int tempDiaNascDep[];
	private boolean alocacaoDiaNascDep;
	private int tempMesNascDep[];
	private boolean alocacaoMesNascDep;
	private int tempAnoNascDep[];
	private boolean alocacaoAnoNascDep;
	
	
	
	//Adicione a classe de origem como objeto Source
	public CadastrarDependente(Contribuinte source, DadosNascimento parameterObject) { 
		this.source = source;
		this.dependente = parameterObject;
	}
	
	
	public boolean Computar() {
		//cadastrar um dependente = alocar cada parametro desse metodo em seu vetor especifico.
		numDependentes = source.cadDep.dependentes.length;
		
		//Alocar o nome do dependente
		tempDependentes = new String[numDependentes + 1];
		for (int i=0; i<numDependentes; i++) {
			tempDependentes[i] = source.cadDep.dependentes[i];
		}
		tempDependentes[numDependentes] = dependente.nome;
		
		//atualizar o vetor de dependentes
		source.cadDep.dependentes = tempDependentes;
		
		//verificar alocacao de dependente
		alocacaoNomeDependente = false;
		if (source.cadDep.dependentes[numDependentes].equals(dependente.nome))
			alocacaoNomeDependente = true;
		
		
		
		//Alocar o dia de nascimento do dependente
		tempDiaNascDep = new int[numDependentes + 1];
		for (int i=0; i<numDependentes; i++) {
			tempDiaNascDep[i] = source.diaNascDeps[i];
		}
		tempDiaNascDep[numDependentes] = dependente.diaNascimento;
		
		//atualizar o vetor de dias de nascimento dos dependentes
		source.diaNascDeps = tempDiaNascDep;
		
		//verificar a alocacao do dia de nascimento do dependente
		alocacaoDiaNascDep = false;
		if (source.diaNascDeps[numDependentes] == dependente.diaNascimento) 
			alocacaoDiaNascDep = true;
		
		
		
		//Alocar o mes de nascimento do dependente
		tempMesNascDep = new int[numDependentes + 1];
		for (int i=0; i<numDependentes; i++) {
			tempMesNascDep[i] = source.mesNascDeps[i];
		}
		tempMesNascDep[numDependentes] = dependente.mesNascimento;
		
		//atualizar o vetor de mes de nascimento dos dependentes
		source.mesNascDeps = tempMesNascDep; 
		
		//verificar a alocacao do dia de nascimento do dependente
		alocacaoMesNascDep = false; 
		if (source.mesNascDeps[numDependentes] == dependente.mesNascimento)
			alocacaoMesNascDep = true;
			
		
		
		//alocar o ano de nascimento do dependente
		tempAnoNascDep = new int[numDependentes + 1];
		for (int i=0; i<numDependentes; i++) {
			tempAnoNascDep[i] = source.anoNascDeps[i];
		}
		tempAnoNascDep[numDependentes] = dependente.anoNascimento;
		
		//atualizar o vetor de ano de nascimento dos dependentes
		source.anoNascDeps = tempAnoNascDep;
		
		//verificar a alocacao do ano de nascimento do dependente
		alocacaoAnoNascDep = false;
		if (source.anoNascDeps[numDependentes] == dependente.anoNascimento) 
			alocacaoAnoNascDep = true;
		
		
		return alocacaoNomeDependente && alocacaoDiaNascDep && alocacaoMesNascDep && alocacaoAnoNascDep;
	
		
	}
	
	
}
