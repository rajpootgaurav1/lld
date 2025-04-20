package project.snakeandladder.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
public class Snake {

    private final int head;
    private final int tail;
    // from > to

    public Snake(final SnakeBuilder snakeBuilder) {
        this.head = snakeBuilder.head;
        this.tail = snakeBuilder.tail;
    }

    //created a inner static builder class which will take care of all the checks before we add a new Snake Object
    public static class SnakeBuilder {
        private int head;
        private int tail;

        public static SnakeBuilder builder() {
            return new SnakeBuilder();
        }

        public SnakeBuilder setHead(int head) {
            if (head >= 100) {
                throw new IllegalArgumentException("head of snake should be less than 100");
            }
            this.head = head;
            return this;
        }

        public SnakeBuilder setTail(int tail) {
            if (tail < 0) {
                throw new IllegalArgumentException("tail should be greater than or equals 0");
            }
            this.tail = tail;
            if (this.head <= this.tail) {
                throw new IllegalArgumentException("head should be greater than tail");
            }
            return this;
        }


        public Snake build() {
            return new Snake(this);
        }
    }

}
