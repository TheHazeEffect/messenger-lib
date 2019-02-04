package messages;

public abstract class Message {
	private String data;

	public void setData(String newData)
	{
		data = newData;
	}
	
	public String getData()
	{
		return data;
	}
}
