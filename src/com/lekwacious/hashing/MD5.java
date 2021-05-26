package com.lekwacious.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class MD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String passwordToHash = "myPassword";

        byte[] salt = createSalt();
        String securedPassword = getSecurePassword(passwordToHash, salt);
        System.out.println(securedPassword);
        //852aab1843d9ef01e6db692de4be19a04ee4f03e06ad178154f795371bc91529
        //1a31ad17919417515d11316f1141741371d71d914c1f6127
        //deb1536f480475f7d593219aa1afd74c
    }

    private static String getSecurePassword(String passwordToHash, byte[] salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(salt);
            byte[] bytes = md.digest(passwordToHash.getBytes());
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < bytes.length; i++){
                stringBuilder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)).substring(1);
            }
            generatedPassword = stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    private static byte[] createSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt =  new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}
