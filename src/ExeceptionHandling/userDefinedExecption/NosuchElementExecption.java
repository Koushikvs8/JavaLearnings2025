package ExeceptionHandling.userDefinedExecption;

public class NosuchElementExecption extends RuntimeException {
	
	public NosuchElementExecption(String message) {
		super(message);
	}

}
