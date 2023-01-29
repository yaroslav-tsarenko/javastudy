package org.example.examClouds.Lesson24.intercurrentCommunications;

import java.util.Objects;

public class Consumer<T extends Sortable> implements Runnable {
    private MyQueue<T> queue;

    public Consumer(MyQueue<T> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            T t = queue.get();
            if (t != null) {
                t.sort();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consumer<?> consumer)) return false;

        return Objects.equals(queue, consumer.queue);
    }

    @Override
    public int hashCode() {
        return queue != null ? queue.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name=\'" + Thread.currentThread().getName() + '\'' +
                ", queue=" + queue +
                '}';
    }
}
