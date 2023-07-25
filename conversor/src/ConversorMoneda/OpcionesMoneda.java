package ConversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesMoneda {
	Moneda moneda = new Moneda();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Pesos a Dólar": 
		moneda.ConvertirPesosDolares(valor);
		break;
	
	case "De Pesos a Euro": 
		moneda.ConvertirPesosEuros(valor);
		break;
		
	case "De Pesos a Libras Esterlinas":
		moneda.ConvertirPesosLibra(valor);
		break;
		
	case "De Pesos a Yen Japonés":
		moneda.ConvertirPesosYen(valor);
		break;
		
	case "De Pesos a Won sub-coreano":
		moneda.ConvertirPesosWon(valor);
		break;
	
	case "De Dólar a Pesos":
		moneda.ConvertirDolaresPesos(valor);
		break;
		
	case "De Euro a Pesos":
		moneda.ConvertirEurosPesos(valor);
		break;
		
	case "De Libras Esterlinas a Pesos":
		moneda.ConvertirLibraPesos(valor);
		break;
	 
	case "De Yen Japonés a Pesos":
		moneda.ConvertirYenPesos(valor);
		break;
		
	case "De Won sub-coreano a Pesos":
		moneda.ConvertirWonPesos(valor);
		break;
	}
	}

}

