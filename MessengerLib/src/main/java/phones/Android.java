package phones;

import messages.Message;
import protocols.MessageProtocol;
import storage.StorageProvider;

public class Android extends Phone implements MessageProtocol{
	Android(StorageProvider storage){
		super(storage);
	}

	public boolean send(Message message) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean receive(Message message) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void viewAllMessages()
	{
		
	}

}
