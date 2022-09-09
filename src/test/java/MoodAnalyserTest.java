import com.bridgelabz.moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoodAnalyserTest {

    @Test
    public void givenMessageWhenSadShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertSame("SAD",result);


    }
}
