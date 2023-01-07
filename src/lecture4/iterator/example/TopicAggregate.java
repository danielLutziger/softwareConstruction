package lecture4.iterator.example;

import java.util.List;

public class TopicAggregate implements Aggregate {
    private Topic[] topics;
    public TopicAggregate(Topic[] topics){
        this.topics = topics;
    }

    @Override
    public Iterator iterator() {
        return new TopicIterator(topics);
    }

}
