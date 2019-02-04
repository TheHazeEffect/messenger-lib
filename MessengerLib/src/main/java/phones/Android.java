package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.StorageProvider;

public class Android extends Phone implements MessageProtocol{
	public Android(StorageProvider storage){
		super(storage);
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
