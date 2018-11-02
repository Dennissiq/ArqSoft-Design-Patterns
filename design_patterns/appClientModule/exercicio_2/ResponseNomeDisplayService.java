package exercicio_2;

public class ResponseNomeDisplayService extends DisplayService {
	
	@Override
	public NomeParser getParser () {
		return new Nome();
	}
}
