package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        
         int s = 0;
        Character[] array = {'q','w','e','r','t','y','u','i','o','p','l','k',
                        'j','h','g','f','d','s','a','z','x','c','v','b','n','m',
                       'Q','W','E','R','T','Y','U','I','O','P','A','S',
                       'D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};

       for (int i = 0; i < array.length; i++) {

           if (symbol == array[i]) {
               s++;
           }
       }

       if (s > 0) {
           System.out.println("English");
       } else
           System.out.println("Non English");
    }
}
