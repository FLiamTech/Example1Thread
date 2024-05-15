package example1_Thread;

public class main 
{
	public static void main (String [] args)
	{
		Process pc = new Process ("Proceso 1");
		Process pc2 = new Process ("Proceso 2");
		Process pc3 = new Process ("proceso 3");
		
		pc.start();
		pc2.start();
		pc3.start();
	}
}
