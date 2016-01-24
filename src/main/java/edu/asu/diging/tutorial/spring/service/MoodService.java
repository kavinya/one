package edu.asu.diging.tutorial.spring.service;
import java.util.*;
import org.springframework.stereotype.Service;
import edu.asu.diging.tutorial.spring.domain.Mood;
import javax.annotation.PostConstruct;
 
@Service
public class MoodService implements IMoodService {
	public List<String> moods = new ArrayList<String>();
	public Map<String,String> moodReason = new HashMap<String,String>();
	
	@PostConstruct
	public void init() {
		String [] moodList = {"Happy","Sad","Miserable","Excited"};
		for (int i = 0; i < moodList.length; i++) {
	        moods.add(moodList[i]);	        
	    }
		// Adding hashmap for reasons behind the mood
		moodReason.put("Happy","weekend is here.!!");
		moodReason.put("Sad","its monday Again..!");
		moodReason.put("Miserable","I never get to see snow..!");
		moodReason.put("Excited","I'm gonna work on a new project..! Yay!");
	}
	
	public Mood getCurrentMood() {
		// Randomly generates the mood and sets the reason to a Mood object.
		Random randomGenerator = new Random();
	    String currentMood = String.valueOf(moods.get(randomGenerator.nextInt(moods.size())));
        return new Mood(currentMood);
    }
	
	public Mood getCurrentMoodReason(String currentMood) {
		// Returns mood object for the given currentMood along with its reason.
        return new Mood(currentMood,String.valueOf(moodReason.get(currentMood)));
    }
}