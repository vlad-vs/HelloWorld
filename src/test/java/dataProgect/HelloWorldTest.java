package dataProgect;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class HelloWorldTest {

    // hello from test


    @Test
    public void getLocationTest() {
        String location = HelloWorld.getLocation();
        if (location.equals("not found")){
            Assert.fail();
        }
    }

    @Test
    public void locationTextEnglishTest() {
        ArrayList<String> local = HelloWorld.locationText("English");
        if (!local.get(0).equals("Good morning, World!")) {
            Assert.fail();
        }
        if (!local.get(1).equals("Good day, World!")) {
            Assert.fail();
        }
        if (!local.get(2).equals("Good evening, World!")) {
            Assert.fail();
        }
        if (!local.get(3).equals("Good night, World!")) {
            Assert.fail();
        }
    }

    @Test
    public void locationTextRusTest() {
        ArrayList<String> local = HelloWorld.locationText("русский");
        if (!local.get(0).equals("Доброе утро, Мир!")) {
            Assert.fail();
        }
        if (!local.get(1).equals("Добрый день, Мир!")) {
            Assert.fail();
        }
        if (!local.get(2).equals("Добрый вечер, Мир!")) {
            Assert.fail();
        }
        if (!local.get(3).equals("Доброй ночи, Мир!")) {
            Assert.fail();
        }
    }

    @Test
    public void locationTextUkrTest() {
        ArrayList<String> local = HelloWorld.locationText("українська");
        if (!local.get(0).equals("Доброго ранку, Світ!")) {
            Assert.fail();
        }
        if (!local.get(1).equals("Добрий день, Світ!")) {
            Assert.fail();
        }
        if (!local.get(2).equals("Добрий вечір, Світ!")) {
            Assert.fail();
        }
        if (!local.get(3).equals("Доброї ночі, Світ!")) {
            Assert.fail();
        }
    }

    @Test
    public void sayHelloTest() {
        ArrayList<String> local = HelloWorld.locationText("русский");
        long dateTime = 6;
        String sayHello = HelloWorld.sayHello(6, local);
        if (sayHello.equals("Добрый день, Мир!")){
            Assert.fail();
        }
    }
}