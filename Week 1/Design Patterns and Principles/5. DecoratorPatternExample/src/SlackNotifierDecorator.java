// Step 4
public class SlackNotifierDecorator extends NotifierDecorator
{
	public SlackNotifierDecorator(Notifier notifier)
	{
		super(notifier);
	}

    @Override
    public void send(String message)
    {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) 
    {
        System.out.println("Sending SMS with message: " + message);
    }
}
