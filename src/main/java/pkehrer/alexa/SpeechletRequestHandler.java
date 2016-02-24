package pkehrer.alexa;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public abstract class SpeechletRequestHandler
	extends SpeechletRequestStreamHandler
	implements RequestHandler<String, String> {

	private static Set<String> appIds = new HashSet<String>();
	
	static {
		appIds.add("amzn1.echo-sdk-ams.app.ba29c5ee-d9c5-4bc0-a31a-916fb7070ec7");
	}
	
	public SpeechletRequestHandler(Speechlet speechlet) {
		super(speechlet, appIds);
	}
	
	@Override
	public String handleRequest(String input, Context context) {
		return "Lambda running. Received input: " + input;
	}
}
