package pkehrer.alexa;

import java.util.Random;

import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.SimpleCard;

public class WifeCompliments {
	
	static String[] compliments = new String[] {
		"Well, Kristen is certainly super hot",
		"Kristen Kehrer is the most beautiful woman in the world",
		"Kristen Kehrer is the fairest of them all",
		"Any man would be lucky to call Kristen his own"
	};
	
	static SpeechletResponse GetWifeCompliments(IntentRequest request, Session session) throws SpeechletException {
		int randInt = new Random().nextInt(compliments.length);
		
		String speechText = compliments[randInt];
    	
    	SimpleCard card = new SimpleCard();
    	card.setTitle("Wife compliment");
    	card.setContent(speechText);
    	
    	PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
    	speech.setText(speechText);
    	
    	return SpeechletResponse.newTellResponse(speech, card);
	}
}
