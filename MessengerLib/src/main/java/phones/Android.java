package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.Google;
import storage.StorageProvider;

public class Android extends Phone implements MessageProtocol{
	public Android(){
		super(new Google());
	}

	public boolean send(Message message) {
		super.getStorageProvider().save(message);
		return true;
	}

	public boolean receive(Message message) {
		super.getStorageProvider().save(message);
		return false;
	}
	
	


}
