//package facade;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//
//public class RandomPointsGenerators {
//
//    public static int getRandomNumberBetween() {
//        Random rand = new Random();
//        return rand.nextInt(20);
//    }
//
//    public static String randXYPoint() {
//        int xValue = getRandomNumberBetween();
//        int yValue = getRandomNumberBetween();
//        return String.format("[%s, %s]", xValue, yValue);
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> randomNumbers = new ArrayList();
//        for (int i = 1; i < 20; i++) {
//            Random rand = new Random();
//            randomNumbers.add(rand.nextInt());
//        }
//        Collections.shuffle(randomNumbers);
//        Map<Integer, Integer> coordinates = new HashMap<>();
//        for (int j = 0; j < 10; j++) {
//            coordinates.put(randomNumbers.get(j), randomNumbers.get(j+1));
//        }
//        System.out.println(coordinates.toString());
//        System.out.println(coordinates.size());
//    }
//}
