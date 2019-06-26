package effective_java_practice;

public class MethodsCommonToAllObjects {

    /**
     * Item 10:
     *<br><br>
     * It is easy to override the equals method in the wrong way.
     * Doing so can create bad bugs that are difficult to fix.
     *
     * <p>
     * Don't override equals if any of these are true:
     * </p>
     * <ul>
     * <li>
     *  Each instance is and should be unique.
     * </li>
     * <li>
     * There is no need to do logical equality test. Ex. The Integer class should have logical equality test.
     * </li>
     * <li>
     * Super class overrides equals and that is suitable for this class.
     * </li>
     * <li>
     * Class is private or package private AND it is certain the equals method will not be called.
     * </li>
     *</ul>
     * <br>
     * <strong>
     * If you have a case where none of the above are true, then refer to effective java item 10 to see best practices
     * for overriding equals.
     * </strong>
     */
    public static void obeyGeneralContractWhenOverridingEquals() {

    }

    /**
     * If you decide to override equals then it must adhere to the equivalence contract.
     * <br><br>
     * The equivalence relation is for any non null references
     * The properties of this are:
     *
     * <ul>
     *     <li>Reflexive: The item must equal itself.</li>
     *     <li>Symmetric: If x equals y then y must equal x.</li>
     *     <li>Transitive: If x equals y and y equals z then x must equal z.</li>
     *     <li>Consistent: If no information used in equals method changes and x equals y, then x must equal y across multiple invocations.</li>
     *     <li>x.equals(null) must return false</li>
     * </ul>
     *
     *
     */
    public static void equalsMethodEquivalenceRelations() {
        //Reflexive example.

        //Symmetric example.

        //Transitive example.

        //Consistent example.

        //Null example.
    }
}
