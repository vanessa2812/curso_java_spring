



class HolaMundo {
	public static void main(String[] argumentos) {
		System.out.println("Hola mundo");
		for (int i = 0; i < argumentos.length; i++) {
			System.out.println("Arg " + i + " = "
			+ argumentos[i]);
	}
	int entero; 
	entero = 1234567890;
	float decimal = 1234567890123456789f;
	double doblePrecision = 1234567890123456789D;
	long enteroLargo = 1234567890L;
	byte unByte = -127; // hasta 127
	
	System.out.println("entero = " + entero);
	System.out.println("decimal = " + decimal);
	System.out.println("doblePrecision = " + doblePrecision);
	System.out.println("enteroLargo = " + enteroLargo);
	System.out.println("unByte = " + unByte);
	char caracter = 'A'; //asignamos único caracter, tipo primitivo
	String texto; // cadena de texto
	texto = "Cualquier texto";
	System.out.println("texto = " + texto); // el más sirve para juntar textos
	System.out.println("caracter = " + caracter);
}
		
}