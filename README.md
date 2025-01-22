# Kafka Demo  

## About Kafka Architecture: 
+ **Consumer**: Listens to topics sent by the Producer and processes the received data.  
+ **Producer**: Responsible for sending messages to topics for Consumers to process.  
+ **Bootstrap Server**: Acts as a bridge, facilitating communication between Producers and Consumers. It helps manage the connection to the Kafka cluster.  

### Additional Points:
- **Topic**: A category to which records are sent by Producers. Consumers subscribe to topics to receive relevant data.
- **Partition**: Each topic can be divided into multiple partitions, allowing for parallel processing and scalability.
- **Broker**: A Kafka server responsible for storing and serving data to Producers and Consumers. Multiple brokers form a Kafka cluster.
- **Zookeeper**: Used for managing and coordinating Kafka brokers (Note: Kafka has been transitioning to using its own internal metadata quorum instead of Zookeeper in recent versions).

## Running Apache Kafka Using Docker:  
You can quickly set up Kafka with the following Docker command:  

```bash
docker run -d --name=kafka -p 9092:9092 apache/kafka
