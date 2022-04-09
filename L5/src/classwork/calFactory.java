package classwork;

public class calFactory {
    public static calculate getCal(int c){
        switch (c) {
            case '+':
                return new calcPLus();
            case '-':
                return new calcMinus();
            default:
                return null;
        }
    }
}
