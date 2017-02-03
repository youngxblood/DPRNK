/**
 * Created by Mark on 2/2/2017.
 */
public class BallotManager {
    private Candidate candidate1;
    private Candidate candidate2;
    private Candidate candidate3;
    private Candidate winner;


    public BallotManager(String cand1, String cand2, String cand3)

    {
        this.candidate1 = new Candidate(cand1);
        this.candidate2 = new Candidate(cand2);
        this.candidate3 = new Candidate(cand3);
        this.winner = new Candidate("");
    }

    public void castVote(int vote)

    {
        if (vote == 1)
            candidate1.incrementVoteCount();
        else if (vote == 2)
            candidate2.incrementVoteCount();
        else if (vote == 3)
            candidate3.incrementVoteCount();

    }
    public String reportResults()
    {
        String cat;

    }

}