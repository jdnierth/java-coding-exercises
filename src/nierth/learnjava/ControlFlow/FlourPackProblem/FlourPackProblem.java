package nierth.learnjava.ControlFlow.FlourPackProblem;

public class FlourPackProblem {

    /**
     * @param bigCount   represents big flour bags with 5kg each.
     * @param smallCount represents small flour bags with 1 kg each.
     * @param goal       represents the goal amount of kilos of flour needed to assemble a package.
     * @return boolean
     */
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0 || smallCount < 0 || goal < 0) ||
                (bigCount * 5 + smallCount < goal)) {
            return false;
        }

        return (smallCount >= goal % 5);
    }
}
