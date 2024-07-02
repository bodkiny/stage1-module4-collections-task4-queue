package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int currentDish = queue.poll();
            count++;
            if (count == everyDishNumberToEat) {
                result.add(currentDish);
                count = 0;
            } else {
                queue.add(currentDish);
            }
        }

        return result;
    }
}
