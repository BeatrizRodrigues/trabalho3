package beatriz.trabalho_eng3;

import java.util.Date;

public class Debito {
	
	int codigoAluno;
	
	public Debito(int aluno){
		this.codigoAluno =aluno;
	}
	
	public boolean verificaDebito()	{
	if(this.codigoAluno == 4)
		 return false;
	 else
		return true;
	}
}
