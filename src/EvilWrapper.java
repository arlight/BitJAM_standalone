

public class EvilWrapper {
	public static void main(String[] args)
	{
		BitJAM jamout = new BitJAM();
		jamout.init();
		
		while(true)
			try{Thread.sleep(10000);}catch(Exception e){continue;}
	}
}
