package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.StorageProvider;

public final class IPhone extends Phone implements MessageProtocol{
	
	IPhone(StorageProvider storage){
		super(storage);
	}
	
	public boolean send(Message message) {
		
		return false;
	}
	
	public boolean receive(Message message) {
		
		return false;	
	}
}