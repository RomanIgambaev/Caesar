public class Main {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) ((ch - base + shift) % 26 + base));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String plaintext = "Hello, World!";
        int shift = 3;

        String encryptedText = encrypt(plaintext, shift);
        System.out.println("Зашифрованный текст: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Расшифрованный текст: " + decryptedText);
    }
}