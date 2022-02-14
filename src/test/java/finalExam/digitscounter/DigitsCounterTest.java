package finalExam.digitscounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitsCounterTest {

    @Test
    void getCountOfDigits() {
        DigitsCounter digitsCounter = new DigitsCounter();

        assertEquals(0, digitsCounter.getCountOfDigits(null));
        assertEquals(0, digitsCounter.getCountOfDigits(""));
        assertEquals(1, digitsCounter.getCountOfDigits("1"));
        assertEquals(2, digitsCounter.getCountOfDigits("111112222"));
        assertEquals(3, digitsCounter.getCountOfDigits("1212123123123123"));
        assertEquals(3, digitsCounter.getCountOfDigits("12asd 12ewr1q2breg31 rw23123123"));
    }

    @Test
    void getCountOfDigits2() {
        DigitsCounter2 digitsCounter = new DigitsCounter2();

        assertEquals(0, digitsCounter.getCountOfDigits(null));
        assertEquals(0, digitsCounter.getCountOfDigits(""));
        assertEquals(1, digitsCounter.getCountOfDigits("1"));
        assertEquals(2, digitsCounter.getCountOfDigits("111112222"));
        assertEquals(3, digitsCounter.getCountOfDigits("1212123123123123"));
        assertEquals(3, digitsCounter.getCountOfDigits("12asd 12ewr1q2breg31 rw23123123"));

        assertEquals(0, digitsCounter.getCountOfDigits2(null));
        assertEquals(0, digitsCounter.getCountOfDigits2(""));
        assertEquals(1, digitsCounter.getCountOfDigits2("1"));
        assertEquals(2, digitsCounter.getCountOfDigits2("111112222"));
        assertEquals(3, digitsCounter.getCountOfDigits2("1212123123123123"));
        assertEquals(3, digitsCounter.getCountOfDigits2("12asd 12ewr1q2breg31 rw23123123"));
    }
}