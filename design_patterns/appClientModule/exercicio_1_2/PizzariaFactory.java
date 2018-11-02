package exercicio_1_2;

public class PizzariaFactory implements AbstractPizzariaFactory {

	@Override
	public Pizzaria getPizzaInstance (int diaDaSemana) {
		switch (diaDaSemana) {
		case 1:
			return new PizzaDomingo();
		case 2:
			return new PizzaSegunda();
		case 3:
			return new PizzaTerca();
		case 4:
			return new PizzaQuarta();
		case 5:
			return new PizzaQuinta();
		case 6:
			return new PizzaSexta();
		case 7:
			return new PizzaSabado();
		} 
		return null;
	}
}
