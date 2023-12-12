package lab4;
import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String text = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);

        System.out.println("Текст после преобразования:");
        System.out.println(encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.next();

        if (answer.equals("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Расшифрованный текст:");
            System.out.println(decryptedText);
        } else {
            System.out.println("До свидания!");
        }
    }

    private static String encrypt(String text, int key) {
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] + key);

            if (characters[i] > 'z') {
                characters[i] -= 26;
            }
        }
        return new String(characters);
    }

    private static String decrypt(String text, int key) {
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] - key);

            if (characters[i] < 'a') {
                characters[i] += 26;
            }
        }
        return new String(characters);
    }
}
