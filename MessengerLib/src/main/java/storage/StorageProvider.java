package storage;

import java.util.ArrayList;
import java.util.List;
import messages.Message;

public class StorageProvider{
	List<Message> messages = new ArrayList<Message>();
	
	public boolean save(Message message)
	{
		messages.add(message);
		return true;
	}
	
	public List<Message> retrieveAll()
	{
		return messages;
	}
 
}
