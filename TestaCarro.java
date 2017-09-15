class TestaCarro
{
	public static void main ( String[] args)
	{
		Carro meuCarro;
		meuCarro = new Carro( );
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;

		//Liga o carro
		meuCarro.liga( );

		//Acelera o carro
		meuCarro.acelera( 20 );
		System.out.println( meuCarro.velocidadeAtual);
	}
}