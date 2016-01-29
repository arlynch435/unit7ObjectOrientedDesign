import java.util.Scanner;
/** 
 * This class supports a fill-in- the blank question where the answer is specified in the question's 
 * text delimited by '_' This class extracts the answer from the question's text and stores the text
 * and answer accordingly.
 */
public class FillInQuestion extends Question
{
    /**
     * extracts the answer form the specified question text. For example:
     * "The inventor of java was _JamesGosling_."
     * test: the inventor of Java was ____
     * answer: James Gosling
     */
    public void setText(String questionText)   
   {
      Scanner parser = new Scanner(questionText);
      parser.useDelimiter("_");
      String question=parser.next();
      String answer=parser.next();
      question+="_________"+parser.next();
      super.setText(question);
      this.setAnswer(answer);
   }
}
