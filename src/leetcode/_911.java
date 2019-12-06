package leetcode;

public class _911 {
}

class TopVotedCandidate {
    TimeWinner[] timeWinners;
    public TopVotedCandidate(int[] persons, int[] times) {
        int[] personScore = new int[persons.length];
        timeWinners = new TimeWinner[persons.length];
        int win = Integer.MIN_VALUE;
        for(int i = 0; i < persons.length; i++){

            if(personScore[persons[i]]++>win){}
        }


    }

    public int q(int t) {

        //二分查找


    return 1;
    }
}
class TimeWinner{
    public int time;
    public int winner;
    public TimeWinner(int time,int winner){
        this.time = time;
        this.winner = winner;
    }
}