package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        
        if (symbol == 'r') {
            System.out.println("English");
        } else if (symbol == 'R') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
