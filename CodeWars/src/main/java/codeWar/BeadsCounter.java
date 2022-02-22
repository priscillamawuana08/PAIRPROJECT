package codeWar;

//Two red beads are placed between every two blue beads. There are N blue beads. After looking at the arrangement below work out the number of red beads.
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        if (nBlue < 2) {
            return 0;
        } else {
            return (nBlue - 1) * 2;
        }
    }
}
