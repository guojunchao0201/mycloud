package com.mycloud.study;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testList() throws InterruptedException {
        List<Integer> list = new ArrayList<>();


        new Thread(() -> {
            int i = 0;
            while (true) {
                list.add(i);
                i++;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.sleep(1000);
        new Thread(()->{
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(list.get(i));
            }
            System.out.println(list.size());
        }).start();
        Thread.sleep(999_999_999);
    }
}
