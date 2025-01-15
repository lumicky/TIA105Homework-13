package work6;

public class CalException extends Exception {
	
//	建立空的例外建構子是個好習慣，以防萬一有臨時需要或者不同作業下的需求
	public CalException() {}
	
	public CalException(String message) {
		super(message);
	}
	
}
