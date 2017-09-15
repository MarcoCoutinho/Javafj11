class AlgumaClasse
{
	public static void main ( String[] args )
	{
		int[] idades = new int[10];
		for ( int i = 0 ; i < 10 ; i++ )
		{
			idades[i] = i * 100;
		}

		//imprime toda a array
		for ( int x : idades )
		{
			System.out.println(x);
		}
	}
	void imprimeArray ( int[] array )
	{
		for ( int x : array )
		{
			System.out.println(x);
		}
	}
}