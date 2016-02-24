package pkehrer.alexa;

public final class AlexaSpeechletRequestStreamhandler 
	extends SpeechletRequestHandler {
	
	public AlexaSpeechletRequestStreamhandler() {
		super(new AlexaSpeechlet());
	}
}
