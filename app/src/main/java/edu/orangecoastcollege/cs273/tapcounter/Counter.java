package edu.orangecoastcollege.cs273.tapcounter;

/**
 * Created by Justaco on 9/11/2016.
 */
public class Counter
{
    private int numberOfTaps;

    public Counter()
    {
        this.numberOfTaps = 0;
    }

    public Counter(int numberOfTaps)
    {
        this.numberOfTaps = numberOfTaps;
    }

    public int getNumberOfTaps()
    {
        return numberOfTaps;
    }

    public void addNumberOfTaps()
    {
        this.numberOfTaps += 1;
    }
}
