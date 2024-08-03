package org.example.springcryptoautomaticalyjava.exception;

public class UpbitClientException extends RuntimeException{
    public UpbitClientException(String errMsg) {
        super(String.format("Upbit Api 호출 중 Error 발생. error=%s", errMsg));
    }
}
