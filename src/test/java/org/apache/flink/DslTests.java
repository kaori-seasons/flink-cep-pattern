package org.apache.flink;

import org.apache.flink.cep.PatternStream;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class DslTests {

    @Test
    public void shouldEvaluateNextPattern() throws Exception {


        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        List<Event> eventList = generate(10);
        DataStream<Event> dataStream = env.fromCollection(eventList);
        PatternStream<Event> patternStream = Dsl.compile("A(attribute='testabc') -> B(attribute=30) ) (3s)", dataStream);

//        assertThat(patternStream.getPattern(), is(notNullValue()));
//        assertThat(patternStream.getPattern().getName(), is("B"));
//        assertThat(patternStream.getPattern().getPrevious(), is(notNullValue()));
//        assertThat(patternStream.getPattern().getPrevious().getName(), is("A"));
    }

    @Test
    public void shouldWithin() {
        DataStream<Event> dataStream = null;
        PatternStream<Event> patternStream = Dsl.compile("A(attribute='test2c') * 3s", dataStream);
    }

    private List<Event> generate(int count){
        List<Event> events = new ArrayList<>();
        for (int i=0;i<count;i++) {
            TestEvent event = new TestEvent();
            event.setEventType("A");
            event.setAttribute("attribute", "testanc");
            events.add(event);
        }
        return events;
    }

}
