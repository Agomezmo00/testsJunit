package code;

public class Array2String {
	
	
	public String conversorArrayaString(String[] miArray) {
		StringBuffer cad = new StringBuffer();
		
		for (int x=0;x<miArray.length;x++){
			   cad =cad.append(miArray[x]);
			}
		
		
		return cad.toString();
	}

}
