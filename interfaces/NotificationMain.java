package interfaces;

public class NotificationMain {
	

	    public static void main(String[] args) {

	        Notification email = new Email();
	        Notification sms = new SMS();
	        Notification whatsapp = new Whatsapp();

	        NotificationService service1 = new NotificationService(email);
	        service1.notifyUser("Your order has been placed.");

	        NotificationService service2 = new NotificationService(sms);
	        service2.notifyUser("Your OTP is 123456.");

	        NotificationService service3 = new NotificationService(whatsapp);
	        service3.notifyUser("Your package is out for delivery.");
	    }
	}


