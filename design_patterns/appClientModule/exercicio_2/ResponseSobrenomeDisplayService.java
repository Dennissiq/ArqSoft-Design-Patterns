package exercicio_2;

public class ResponseSobrenomeDisplayService extends DisplayService {
	
	@Override
	public NomeParser getParser () {
		return new Sobrenome();
	}
}
