
package interfaces;

public class NotificationService {
	

	    private Notification notification;

	    NotificationService(Notification notification) {
	        this.notification = notification;
	    }

	    public void notifyUser(String message) {
	        notification.send(message);
	    }
	}


