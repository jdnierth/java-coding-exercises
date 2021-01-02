package nierth.learnjava.FirstSteps.MegaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes;
        int remainKB;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        remainKB = kiloBytes % 1024;
        megaBytes = (kiloBytes - remainKB) / 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKB + " KB");
    }
}
