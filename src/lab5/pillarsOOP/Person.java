package lab5.pillarsOOP;

/**
 * @author flo
 * @since 06/12/2016.
 */
public class Person {
    // state is encapsulated
    private String firstName;
    private String CNP;

    public String getCNP() {
        return CNP;
    }
    public String talk() {
        Idea idea = think();
        return verbalise(idea);
    }
    //encapsulate private behavior
    private Idea think() {
        return new Idea();
    }
    private String verbalise(Idea idea) {
        return idea.toString() + "cucu";
    }


}
