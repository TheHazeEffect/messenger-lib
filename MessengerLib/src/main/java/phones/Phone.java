package phones;

import java.util.List;

import messages.Message;
import storage.StorageProvider;

public abstract class Phone{
	private StorageProvider storage;
	
	public Phone(StorageProvider newstorage)
	{
		storage = newstorage;
	}
	
	public StorageProvider getStorageProvider()
	{
		return storage;
	}
	public void viewAllMessages()
	{
		List<Message> messages = storage.retrieveAll();
		
		for(int i=0;i<messages.size();i++)
		{
			System.out.println("Message#" + (i+1) + ": " + messages.get(i).getData() );
		}
		
	}

}