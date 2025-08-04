package ContainVowel;

public class ContainVowel {
    public static void main(String[] args) {
        String vowel = "VOWEL";
        vowel = vowel.toLowerCase();
        int vowelCount = 0;
        for(int i = 0; i < vowel.length()-1; i++) {
            if(vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o' || vowel.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
