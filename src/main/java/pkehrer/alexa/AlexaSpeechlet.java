package pkehrer.alexa;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;

public class AlexaSpeechlet implements Speechlet {

	public SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;

        if ("WifeCompliment".equals(intentName)) {
        	return WifeCompliments.GetWifeCompliments(request, session);
        } else {
            throw new SpeechletException("Invalid Intent");
        }
	}

	public SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
		// TODO Auto-generated method stub
		return null;
	}

	public void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {
		// TODO Auto-generated method stub
		
	}

	public void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {
		// TODO Auto-generated method stub
		
	}

}
