import java.util.Scanner;

public class EnforcingPrivacyWithCryptography4_38 {
    /*
    * (Enforcing Privacy with Cryptography) The explosive growth of Internet communications and data storage on Internet-connected computers has greatly increased privacy concerns.
    The field of cryptography is concerned with coding data to make it difficult (and hopefully—with the most advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
    simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet has asked you to write a program that will encrypt it so that it may be transmitted more securely.All the data is transmitted as four-digit integers.
    Your application should read a four-digit integer entered by the user and encrypt it as follows:
    *
    * Replace each digit with the result of adding 7 to the digit and getting the remainder after dividing the new value by 10.
    * Then swap the first digit with the third, and swap the second digit with the fourth. Then print the encrypted integer.
    * Write a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the encryption scheme) to form the original number.
    * [Optional reading project: Research “public key cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int encryptedMessage ;



        System.out.print("Enter a Four-Digit Number: ");
        number = input.nextInt();


        digit1 = (number / 1000 + 7) % 10;
        digit2 = (number % 1000 / 100 + 7) % 10;
        digit3 = (number % 100 / 10 + 7) % 10;
        digit4 = (number % 10 + 7) % 10;

//        digit1 = (number / 1000 + 3) % 10;
//        digit2 = (number % 1000 / 100 + 3) % 10;
//        digit3 = (number % 100 / 10 + 3) % 10;
//        digit4 = (number % 10 + 3) % 10;

        encryptedMessage = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;
        System.out.printf(" Encrypted number is : %d\n", encryptedMessage);
//        decryptedMessage = digit1 * 10 + digit2 + digit3 * 1000 + digit4 * 100;





        // * Write a separate application that inputs an encrypted four-digit integer and decrypts
        // it (by reversing the encryption scheme) to form the original number.
        int enCrypte;
        int reverseDigit1;
        int reverseDigit2;
        int reverseDigit3;
        int reverseDigit4;
        int decryptedMessage;


        System.out.print("Enter a Encrypted Number: ");
        enCrypte = input.nextInt();

//        reverseDigit1 = (enCrypte / 1000 + 7) % 10;
//        reverseDigit2 = (enCrypte % 1000 / 100 + 7) % 10;
//        reverseDigit3 = (enCrypte % 100 / 10 + 7) % 10;
//        reverseDigit4 = (enCrypte % 10 + 7) % 10;

        reverseDigit1 = (enCrypte / 1000 + 3) % 10;
        reverseDigit2 = (enCrypte % 1000 / 100 + 3) % 10;
        reverseDigit3 = (enCrypte % 100 / 10 + 3) % 10;
        reverseDigit4 = (enCrypte % 10 + 3) % 10;


        decryptedMessage = reverseDigit1 * 10 + reverseDigit2 + reverseDigit3 * 1000 + reverseDigit4 * 100;
        System.out.printf(" Decrypted number is : %d\n", decryptedMessage);

    }
}
