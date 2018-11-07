import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EducatorModelTest{
	EducatorModel educatorTest = new EducatorModel(); 

	@Test
	public void checkAnswerTest() {
		
		assertNotNull(educatorTest.generateChoices());
		assertNotNull(educatorTest.generateQuestions());
		assertTrue(educatorTest.checkAnswer());
		
	}

}
