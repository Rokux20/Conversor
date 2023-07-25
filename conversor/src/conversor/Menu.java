package conversor;

import javax.swing.JOptionPane;


import ConversorMoneda.OpcionesMoneda;
import ConversorTemperatura.OpcionesTemperatura;

public class Menu {

	public static String getOptions(){
		 return JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
				new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
		
	}
	public static void menu() {
		
		OpcionesMoneda conversion = new OpcionesMoneda();
		OpcionesTemperatura conversionT = new OpcionesTemperatura();
		while(true) {
			 String opciones = getOptions();
				
				
				switch(opciones) {
				case "Conversor de Monedas":
					try {
			            String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
			            if (input == null) {
			                return;
			            }

			            double valorRecibido = Double.parseDouble(input);
			            conversion.ConvertirMonedas(valorRecibido);
			        } catch (NumberFormatException e) {
			           
			            JOptionPane.showMessageDialog(null, "Valor no válido. Ingrese solo números.", "Error", JOptionPane.ERROR_MESSAGE);
			        }
					
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
					if(JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Entra");
						menu();
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					break;
					
				case "Conversor de Temperatura":
					String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double valorRecibidoT = Double.parseDouble(input1);
					conversionT.ConvertirTemperaturas(valorRecibidoT);
					
					
					int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
					if(JOptionPane.OK_OPTION == respuestaT) {
						menu();
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					
					
					
			}
			break;
		}
	}
	public static void main(String[] args) {
	menu();

}
	
	 
	}


