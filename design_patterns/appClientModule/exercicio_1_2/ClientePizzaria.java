package exercicio_1_2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class ClientePizzaria {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static GregorianCalendar gc = new GregorianCalendar();
    static int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
    
    public static void main(String [] args) {
    	AbstractPizzariaFactory pizzariaFactory = new PizzariaFactory();
    	Pizzaria pizzas = pizzariaFactory.getPizzaInstance(diaDaSemana);
    	pizzas.pizza();
    }
    
}
