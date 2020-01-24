package academy.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class HelloMaven {

    private final static Logger log= LoggerFactory.getLogger(HelloMaven.class);


    public static void main(String[] args) {
        log.info("Hello test");
        log.debug("debug");


    }

//    public static void isPrime(int number) {
//
//        IntStream.rangeClosed(2,number/2).anyMatch(i -> number%i==0);
//    }
}
