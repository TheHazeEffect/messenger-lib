package storage;

import java.util.List;
import messages.Message;

public class StorageProvider{
	List<Message> messages;
	
	public boolean save(Message message)
	{
		return true;
	}
	
	public List<Message> retrieveAll()
	{
		return messages;
	}
 
}
