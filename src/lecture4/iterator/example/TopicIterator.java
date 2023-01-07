package lecture4.iterator.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopicIterator implements Iterator {
    private List<Topic> topics;
    private int position;

    public TopicIterator(Topic[] topics){
        this.topics = new ArrayList<>(Arrays.asList(topics));
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= topics.size() || topics.get(position) == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        return topics.get(position++);
    }
}
