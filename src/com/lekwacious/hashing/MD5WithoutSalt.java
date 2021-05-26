package com.lekwacious.hashing;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5WithoutSalt {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String passwordToHash = "myPassword";

        String securedPassword = GetGeneratedPassword(passwordToHash);
        System.out.println(securedPassword);

    }

    private static String GetGeneratedPassword(String passwordToHash) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
           byte[] bytes = md.digest(passwordToHash.getBytes());
           StringBuilder stringBuilder = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                stringBuilder.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
}
