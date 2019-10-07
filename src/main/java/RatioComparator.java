import java.util.Comparator;

/**
 * Compares boxes according to ratio between box length and box width.
 */
public class RatioComparator implements Comparator<Box>{

    @Override
    public int compare(Box one, Box two){

        Double ratioOne = one.getRatio();
        Double ratioTwo = two.getRatio();

        if(ratioOne < 1 && ratioOne > 0)
        {
            ratioOne = ratioOne * 10000;
            ratioTwo = ratioTwo * 10000;
        }

        if(ratioTwo < 1 && ratioTwo > 0)
        {
            ratioOne = ratioOne * 10000;
            ratioTwo = ratioTwo * 10000;
        }

        return (int)(ratioOne - ratioTwo);
    }

}
