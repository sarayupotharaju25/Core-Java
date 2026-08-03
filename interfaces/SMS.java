package interfaces;

public class SMS implements Notification {

	    public void send(String message) {
	        System.out.println("SMS Sent: " + message);
	    }
	}


