package com.homerianreyes.demo;

public class Crypto {

    private String CryptoName;
    private String Cryptoinfo;

    public Crypto(String cryptoName, String cryptoinfo) {
        CryptoName = cryptoName;
        Cryptoinfo = cryptoinfo;
    }

    public String getCryptoinfo() {
        return Cryptoinfo;
    }

    public String getCryptoName() {
        return CryptoName;
    }
}
