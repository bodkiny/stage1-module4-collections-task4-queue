package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        initialMove(firstQueue, secondQueue, deque);


        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            playerMove(firstQueue, deque);
            playerMove(secondQueue, deque);
        }

        return deque;
    }

    private static void playerMove(Queue<Integer> queue, ArrayDeque<Integer> deque) {
        queue.add(deque.pollLast());
        deque.addLast(queue.remove());
        deque.addLast(queue.remove());
    }

    private static void initialMove(Queue<Integer> firstQueue, Queue<Integer> secondQueue, ArrayDeque<Integer> deque) {
        deque.addLast(firstQueue.remove());
        deque.addLast(firstQueue.remove());

        deque.addLast(secondQueue.remove());
        deque.addLast(secondQueue.remove());
    }
}
