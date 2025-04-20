package project.snakeandladder.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter
public class Ladder {

    private final int foot;
    private final int ceil;

    // from < to
    private Ladder(final LadderBuilder ladderBuilder) {
    this.foot = ladderBuilder.foot;
    this.ceil = ladderBuilder.ceil;
    }


    public static class LadderBuilder {

        private int foot;
        private int ceil;


        public static LadderBuilder builder(){
            return new LadderBuilder();
        }

        public LadderBuilder setFoot(int foot) {
            if(foot <= 0) {
                throw new IllegalArgumentException("foot should be greater than 0");
            }
            this.foot = foot;
            return this;
        }

        public LadderBuilder setCeil(int ceil) {
            if(ceil >100) {
                throw  new IllegalArgumentException("ceil cannot be greater than 100");
            }
            if(ceil <= foot){
                throw new IllegalArgumentException("ceil should be greater than foot");
            }
            this.ceil = ceil;
            return this;
        }

        public Ladder build(){
            return new Ladder(this);
        }


    }

}
