package hoirozn.fakerdata;

import hoirozn.fakerdata.utlis.FakerDataUtils;

import java.util.Locale;

public class test_java {
    public static void main(String[] args) {
        FakerDataUtils fakerDataUtils = new FakerDataUtils();
        String a = fakerDataUtils.fakerDate(Locale.CHINA);
        System.out.println(a);
    }
}
