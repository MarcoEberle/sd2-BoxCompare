import java.util.Comparator;


/**
 * Compares boxes according to colors.
 */
public class ColorComparator implements Comparator<Box>{

    @Override
    public int compare(Box one, Box two){
        return one.getColor().ordinal()- two.getColor().ordinal();
    }

}
