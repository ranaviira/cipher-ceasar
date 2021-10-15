public class DecryptionLogic {

    public static void decipher(String text) {

        String lettersLowerCase = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String lettersUpperCase = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

        int shift;
        for (shift = 0; shift < 33; shift++) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Сдвиг на " + shift);

            StringBuilder decipherText = new StringBuilder();

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '.' || text.charAt(i) == ' ' || text.charAt(i) == ',') {
                    decipherText.append(text.charAt(i));
                }
                for (int j = 0, k = 0; j < lettersLowerCase.length() && k < lettersUpperCase.length(); j++, k++) {
                    if (text.charAt(i) == lettersLowerCase.charAt(j)) {
                        int abc = j + shift;
                        if (abc >= 33) {
                            decipherText.append(lettersLowerCase.charAt(j - 33 + shift));
                        } else {
                            decipherText.append(lettersLowerCase.charAt(j + shift));
                        }
                    } else if (text.charAt(i) == lettersUpperCase.charAt(k)) {
                        int abc = k + shift;
                        if (abc >= 33) {
                            decipherText.append(lettersUpperCase.charAt(k - 33 + shift));
                        } else {
                            decipherText.append(lettersUpperCase.charAt(k + shift));
                        }
                    }
                }
            }
            System.out.println(decipherText);
        }
    }
}
