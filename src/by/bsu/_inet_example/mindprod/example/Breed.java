package by.bsu._inet_example.mindprod.example;


/*
 * [Breed.java]
 *
 * Summary: example use of enum define the possible dog breeds.
 *
 * Copyright: (c) 2009-2016 Roedy Green, Canadian Mind Products, http://mindprod.com
 *
 * Licence: This software may be copied and used freely for any purpose but military.
 *          http://mindprod.com/contact/nonmil.html
 *
 * Requires: JDK 1.8+
 *
 * Created with: JetBrains IntelliJ IDEA IDE http://www.jetbrains.com/idea/
 *
 * Version History:
 *  1.0 2009-01-01 initial version
 */


import static java.lang.System.*;
// Following is how you could import this enum in other classes
// with an import to allow dropping the explicit Breed.
// import static com.mindprod.dogs.Breed.*;

/**
 * example use of enum define the possible dog breeds.
 * <p/>
 * This automatically creates three Breed objects to represent the three breeds. All Breed variables will be either null
 * or point to one of these three objects.
 *
 * @author Roedy Green, Canadian Mind Products
 * @version 1.0 2009-01-01 initial version
 * @since 2009-01-01
 */
@SuppressWarnings( { "UnusedAssignment", "UnusedDeclaration", "WeakerAccess" } )
public enum Breed
{
    /**
     * Dachshund, smooth and shaggy
     */
    DACHSHUND,
    /**
     * Dalmatian
     */
    DALMATIAN,
    /**
     * Labrador, black and golden
     */
    LABRADOR;

    /**
     * constructor, implicitly public
     */
    Breed()
    {
    }
    // I could have used lower case enum constant names
    // e.g. dalmatian, or mixed case, e.g. Dalmatian
    // but since enums are actually constants,
    // Java convention says they should be all caps.
    // Traditionally you order them alphabetically.
    // Eclipse does that when you reorder methods.

    /**
     * is this a lap dog?
     *
     * @param breed breed of dog
     *
     * @return true if it is a lap dog
     */
    public static boolean lap( Breed breed )
    {
        // Example use of an enum in a switch
        switch ( breed )
        {
            // Note how you do not specify Breed.DALMATIAN in the case label.
            // Java knows all case labels are Breed., because breed is a Breed.
            case DALMATIAN:
            case LABRADOR:
            default:
                return false;
            case DACHSHUND:
                return true;
        }
    }

    /**
     * Breed Test harness
     *
     * @param args not used
     */
    @SuppressWarnings( { "UnusedParameters" } )
    public static void main( String[] args )
    {
        // assignment
        Breed cedar = Breed.LABRADOR;
        // prints "LABRADOR";
        out.println( cedar );
        // Prints 2. DACHSHUND is 0. ordinals are 0-based as you would expect.
        out.println( cedar.ordinal() );
        // prints "DACHSHUND";
        out.println( Breed.DACHSHUND );
        // comparison
        if ( cedar.compareTo( Breed.DALMATIAN ) > 0 )
        {
            // should print this:
            out.println( "LABRADOR comes after DALMATIAN" );
        }
        else
        {
            out.println( "DALMATIAN comes after LABRADOR" );
        }
        // set to none of the above
        cedar = null;
        // converting from String to enum, peculiar but slick
        // saves reams of ifs or hashMap lookups.
        // The compiler magically generates this method for you.
        // You will not find item is the base Enum class.
        // Works for any String matching one of the breeds.
        // If there is no match for the String, valueOf will throw an
        // IllegalArgumentException.
        Breed myDogsBreed = Breed.valueOf( "Dachshund".toUpperCase() );
        out.println( myDogsBreed );
        // converting int to enum
        // breed 1 is Dalmatian.
        int i = 1;
        Breed theBreed = Breed.values()[ i ];
        out.println( theBreed );
        // Example iterating over all possibilities.
        // Print out a list of all possible breeds.
        out.println( "All possible breeds" );
        for ( Breed breed : Breed.values() )
        {
            out.println( breed );
        }
        // you might thin you could say for ( Breed breed : Breed ) but you cannot; You need Breed.values()
        // end main
    }
}
