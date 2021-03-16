import java.util.concurrent.Callable;

class Task implements Callable
{
	@Override
	public Object call() throws Exception {
		throw new RuntimeException();
	}
}


public class CallableException {

	public static void main(String[] args) throws Exception {
		Task task = new Task();

		task.call();
		
		
	}
	
	
}
