package code;

public class VocalesEnCadena {
	
	
	public void numeroVocalesCadena(String cadena) {
		
		int num = this.contarVocales(cadena);
		System.out.println("La cadena: "+cadena+" contiene: "+num+" vocales");
	}
	
	
	public int contarVocales(String sPalabra) {
		int contador = 0;
		
		for(int x=0;x<sPalabra.length();x++) {
			  if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i') || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')){
			    contador++;
			  }
		}
		
		return contador;
	}

}
