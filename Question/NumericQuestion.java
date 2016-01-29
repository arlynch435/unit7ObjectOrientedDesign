

/**
 * ssldkfjlsdfkjsdlfkj  dslkfdl;sfla;l ;asldfjjwoeifjaw;efasldkfjdsdd
 */
public class NumericQuestion extends Question
{
    private double answer;
    //example of method overloading
    //this method overloads the setAnswer method of the question class
    public void setAnswer (double correctResponse)
    {
        this.answer = correctResponse;
    }
    //this is an example of method overriding
    //this method overrides the checkAnswer method of the question class
    public boolean checkAnswer(String response)
    {
        double responseAsDouble= Double.parseDouble(response);
        return Math.abs(responseAsDouble-this.answer)<=0.01;
    }
}
