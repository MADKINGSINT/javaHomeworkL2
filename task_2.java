package java_homework_l;


import java.io.IOException;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2{

public static void main(String[] args) throws SecurityException, IOException {
    Logger loger = Logger.getLogger(task_2.class.getName());
    FileHandler fHandler = new FileHandler("java_homework_l/buble.log");
    SimpleFormatter sFormatter = new SimpleFormatter();
    fHandler.setFormatter(sFormatter);
    loger.addHandler(fHandler);


int[] arr = new int[]{1000, 900, 800, 5, 1, 2, 300, -142, 123, 12, 32, -300, -400, -500};{

for (int i = arr.length-1; i >= 1; i--) {
    int[] arr2 = arr.clone();
    for (int j = 0; j < i; j++) {
        if (arr2[j] > arr2[j + 1]) {
            int shift = arr2[j];
            arr2[j] = arr2[j + 1];
            arr2[j + 1] = shift;
        }
    }
    arr = arr2.clone();
    System.out.println(Arrays.toString(arr));
    loger.info(Arrays.toString(arr));

}

}
}
}