class EstructurasControl {
	public static void main(String argumentos[]) {
		int contador = 0;
		while (contador + /* contador*(1 + 1 - 1) * 0*/
		< 5 ){
			System.out.println("contador vale = " + contador);
			{
				System.out.println("bloque");
				int var = 0;
			}
			var = 1;
			for (int i = 0; i < argumentos.length; i++);
			{
				System.out.println("Arg = " + i + " = " + argumentos[i]);
			}
			for (;;) ; // infinito
		}
	}
}