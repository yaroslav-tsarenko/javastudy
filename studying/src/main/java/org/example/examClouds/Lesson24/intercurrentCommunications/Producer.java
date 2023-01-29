package org.example.examClouds.Lesson24.intercurrentCommunications;

import java.util.Objects;

public class Producer<T extends Sortable> implements Runnable {
    private MyQueue<T> queue;

    public Producer(MyQueue<T> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.put((T) new Task("Task" + ++i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producer<?> producer)) return false;

        return Objects.equals(queue, producer.queue);
    }

    @Override
    public int hashCode() {
        return queue != null ? queue.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name=\'" + Thread.currentThread().getName() + '\'' +
                ", queue=" + queue +
                '}';
    }
}
