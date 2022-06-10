package leetcode.studyplans.programmingskills1;

public class ProgrammingSkills1 {

    public int countOdds(int low, int high) {
        if ((high - low + 1) % 2 == 0) {
            return ((high - low) + 1) / 2;
        } else if ((high - low + 1) % 2 != 0) {
            if ((low % 2 != 0) && (high % 2 != 0)) {
                return (((high - low) / 2) + 1);
            } else {
                return (((high - low) / 2));
            }
        }
        return - 1;
    }
}
