/**
 * Created by Mark on 2/2/2017.
 */
public class Candidate {

    private String name;
    private int votes;

    /**
     * Created by Mark on 2/2/2017.
     */

    public Candidate(String name) {
        this.name = name;
        votes = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incrementVoteCount() {
        votes++;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfVotes() {
        return votes;
    }
}