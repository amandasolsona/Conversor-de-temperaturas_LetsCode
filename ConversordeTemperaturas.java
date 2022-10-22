import java.util.Scanner;

public class ConversordeTemperaturas {
	
	private static final String CELSIUS = "C";
	private static final String KELVIN = "K";
	private static final String FAHRENHEIT = "F";
	
    public static void main(String [] args) {

    	Scanner scanner = new Scanner(System.in);
    	
        System.out.println("Qual a quantidade de temperaturas a serem transformadas ? ");

        int quantidadeDeTemperaturas = scanner.nextInt();
        
        double somaTemperaturasIniciais = 0.0;
        double somaTemperaturasTransformadas = 0.0;
        
        for(int i = 0; i < quantidadeDeTemperaturas; i++) {
        	
        	System.out.println("Conversor de Temperaturas");
        	System.out.println("Use C para Celsius, F para Fahrenheit e K para Kelvin ");
        	
        	System.out.println("Qual unidade de origem da temperatura ? ");
        	String origemTemperatura = scanner.next();
        	
        	System.out.println("Qual unidade de temperatura a ser transformada ? ");
        	String transformadaEmTemperatura = scanner.next();
        	
        	System.out.println("Digite a temperatura que será utilizada ? ");
        	double temperatura = scanner.nextDouble();
        	
        	double resultado = 0.0;
        	
        	if (origemTemperatura.equals(CELSIUS) && transformadaEmTemperatura.equals(FAHRENHEIT)){
        		resultado =  calcularCelsiusEmFahrenheit(temperatura);
        		
        	} else if (origemTemperatura.equals(CELSIUS) && transformadaEmTemperatura.equals(KELVIN)) {
        		resultado = calcularCelsiusEmKelvin(temperatura);
        		
        	} else if (origemTemperatura.equals(FAHRENHEIT) && transformadaEmTemperatura.equals(CELSIUS)) {
        		resultado = calcularFahrenheitEmCelsius(temperatura);
        		
        	} else if (origemTemperatura.equals(FAHRENHEIT) && transformadaEmTemperatura.equals(KELVIN)) {
        		resultado = calcularFahrenheitEmKelvin(temperatura);
        		
        	} else if (origemTemperatura.equals(KELVIN) && transformadaEmTemperatura.equals(CELSIUS)) {
        		resultado = calcularKelvinEmCelsius(temperatura);
        		
        	} else if (origemTemperatura.equals(KELVIN) && transformadaEmTemperatura.equals(FAHRENHEIT)) {
        		resultado = calcularKelvinEmFahrenheit(temperatura);
        	}
        	
        	System.out.println("Temperatura passada na unidade " + origemTemperatura + ": " + temperatura +
        			" convertida para unidade " + transformadaEmTemperatura + " é " + resultado);
        	
        	somaTemperaturasIniciais += temperatura;
        	somaTemperaturasTransformadas += resultado;
        }
        
        double mediaTemperaturasIniciais = somaTemperaturasIniciais/quantidadeDeTemperaturas;
        double mediaTemperaturasTransformadas = somaTemperaturasTransformadas/quantidadeDeTemperaturas;
        
        System.out.println("A media de temperaturas iniciais é: " + mediaTemperaturasIniciais);
        System.out.println("A media de temperaturas transformadas é: " + mediaTemperaturasTransformadas);

    }

    private static double calcularCelsiusEmFahrenheit(double celsius){
            double fator1 = 9.0/5.0;
            double fator2 = 32.0;

            double fahrenheit = (celsius * fator1) + fator2;

            return fahrenheit;
    }
    private static double calcularCelsiusEmKelvin (double celsius){
        double fator = 273.15;

        double kelvin = celsius + fator;

        return kelvin;
    }

    private static double calcularFahrenheitEmCelsius(double fahrenheit){
        double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;

        return celsius;
    }

    private static double calcularFahrenheitEmKelvin (double fahrenheit){
        double kelvin = 273.15 + ((fahrenheit - 32.0) * (5.0/9.0));

        return kelvin;
    }

    private static double calcularKelvinEmCelsius (double kelvin){
        double celsius = kelvin - 273.15;

        return celsius;
    }

    private static double calcularKelvinEmFahrenheit (double kelvin) {
        double fahrenheit = 9.0/5.0 * (kelvin - 273.15) + 32;

        return fahrenheit;
    }
}

