import java.util.Comparator;

/**
 * Compares boxes according to length.
 */
public class LengthComparator implements Comparator<Box>{

    @Override
    public int compare(Box one, Box two){
        return two.getLength() - one.getLength();
    }

}
