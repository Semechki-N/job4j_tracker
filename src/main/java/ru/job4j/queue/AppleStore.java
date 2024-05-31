package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer lastHappyCustomer = null;
        int currentCount = count;
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Customer customer = queue.poll();
            if (currentCount > 0) {
                lastHappyCustomer = customer;
                currentCount--;
            } else {
                queue.offer(customer);
                break;
            }
        }

        return lastHappyCustomer.name();
    }

    public String getFirstUpsetCustomer() {
        Customer firstUpsetCustomer = null;
        int currentCount = count;
        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Customer customer = queue.poll();
            if (currentCount > 0) {
                currentCount--;
            } else {
                firstUpsetCustomer = customer;
                break;
            }
            queue.offer(customer);
        }

        return firstUpsetCustomer.name();
    }
}