package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        
        int vow = 0;
        int con = 0;

        Character[] vowel = {'e', 'y', 'u', 'i', 'o', 'a'};

        Character[] consonant = {'q', 'w', 'r', 't', 'p', 's',
                                 'd', 'f', 'g', 'h', 'j', 'k',
                                 'l', 'z', 'x', 'c', 'v', 'b',
                                 'n', 'm'};

        for (int i = 0; i < vowel.length; i++) {
            char uppercaseVowel = Character.toUpperCase(vowel[i]);
            if (character == vowel[i] || character == uppercaseVowel) {
                vow++;
            }

            else {
                for (int j = 0; j < consonant.length; j++) {
                    char uppercaseConsonant = Character.toUpperCase(consonant[j]);
                    if (character == consonant[j] || character == uppercaseConsonant) {
                        con++;
                    }
                }
            }
        }

        if (vow > 0) {
            return "Vowel";
        }
        else if (con > 0) {
            return "Consonant";
        }
        else {
            return "wrong alphabet!";
        }
    }
}
