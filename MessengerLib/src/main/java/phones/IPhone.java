package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.ICloud;
import storage.StorageProvider;

public final class IPhone extends Phone implements MessageProtocol{
	
	IPhone(){
		super(new ICloud());
	}
	
	public boolean send(Message message) {
		getStorageProvider().save(message);
		return false;
	}
	
	public boolean receive(Message message) {
		getStorageProvider().save(message);
		return false;	
	}
}
