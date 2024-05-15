package example1_Thread;

public class Process extends Thread
{
//	String nameProcess;
	
	public Process(String nameProcess) {
		super(nameProcess);
//		this.nameProcess = nameProcess;
	}

	public void listValues ()
	{
		for (int i=0 ; i<5 ; i++)
		{
			System.out.println(getName() + " | " + i);
		}
	}
	
	public void run ()
	{
		listValues();
	}
}
