public class Soma
{
	public static void main ( String args[])
	{
		int n1,n2, soma;
		/*Os parametros recebidos devem ser convertidos para intiro,
		 *já que os mesmos são do tipo string*/
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);

		soma = n1 + n2;

		System.out.println ( "A soma do n1: " + n1 + " com o n2 " + n2 + " é igual a: " + soma);
	}
}