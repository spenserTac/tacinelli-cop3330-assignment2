package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        float result = App.average(nums);
        Assertions.assertEquals(400.0, result);
    }

    @Test
    void min() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        int result = App.min(nums);
        Assertions.assertEquals(100, result);
    }

    @Test
    void max() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        int result = App.max(nums);
        Assertions.assertEquals(1000, result);
    }

    @Test
    void std() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(100);
        nums.add(200);
        nums.add(1000);
        nums.add(300);

        double result = App.std(nums);
        result = Math.round(result*100);
        result = result/100;
        Assertions.assertEquals(353.55, result);
    }
}