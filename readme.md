# Flink CEP DSL (施工中)

基于flink cep的一个简化dsl
方便用户做规则的快速替换

基于正则的严格模式
# 构建


```
mvn install -DskipTests
```

# 使用方式

```java
DataStream<Event> eventDataStream = ...
PatternStream<Event> patternStream = Dsl.compile("Sensor(temperature > 30)", eventDataStream);
patternStream.select(new PatternSelectFunction<Event, Event>() {
                          @Override
                          public Event select(Map<String, List<Event>> map) throws Exception {
                              return map.get("Sensor");
                          }
                      })

```



## 条件表达式

### 算子

* Equals
```
a(attribute = 30)
```
* Not Equals
```
a(attribute != 30)
```
* Lower Than
```
a(attribute < 30)
```
* Greater Than
```
a(attribute > 30)
```
* Lower Than or Equals
```
a(attribute <= 30)
```
* Greater Than or Equals
```
a(attribute >= 30)
```

### Data Types

* String 'abc'
* Integer 30

## Quantifiers

* Zero or More
 ```
 a*
 ```
* One or More
```
a+
```
* Zero or One
```
a?
```
* Exactly Three
```
 a{3}
```
* Three or More
```
 a{3,+}
```

### Greediness vs Optional

* Optional
```
a{3}(b = 3)?
 ```
* Greedy
```
a{3}?(b = 3)
```
 


## Patterns

* Next:

```
a b
```

* Followed By 

```
a -> b
```

* Followed By Any

```
a ->> b
```

## Where vs Until

Flink supports a where clause as well as an until clause to define 
a stop condition for a looping pattern.

* Where
```
Sensor(temperature > 30)
```

* Until
```
Sensor[temperature <= 30]
```

The two operators can also be combined.

```
Sensor(temperature > 30)[resolved=false]
```

## Examples

* Simple Condition

```
Sensor(temperature > 30)
```

* Correlation

```
Sensor1(temperature > 30) -> Sensor2(temperature > 50 and id=Sensor1.id)
 ```
 
## Known Issues
 
Currently the greedy operator does not work when applied to the first event
in the pattern. 

Works
```
TransportStarted(destination = 'Vienna') LocationUpdate{1,+}?(destination=TransportStarted.destination) TransportEnded(destination=TransportStarted.destination)
```

Does not Work
```
LocationUpdate{1,+}?(destination=TransportStarted.destination) TransportEnded(destination=TransportStarted.destination)
```

See https://issues.apache.org/jira/browse/FLINK-8914 for details.