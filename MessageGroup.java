import java.util.ArrayList;

/**************************************************

This class is responsible for recieving and sending messages to the
consumers of a particular Topic. There is a single MessageGroup thread
initially to perform the task of delivering the messages to the consumers
interested in the MessageGroup.

**************************************************/

public class MessageGroup {

   public static int MESSAGEGROUPID = 0;

   // In the first version, we will only support one producer per message group.
   private Producer producer;
   private ArrayList<Consumer> consumers;
   private int groupId;
   private MessageQueue messageQueue;

   public MessageGroup(Producer producer) {
      this.producer = producer;
      this.consumers = new ArrayList<Consumer>();
      this.groupId = MESSAGEGROUPID++;
      this.messageQueue = new MessageQueue(this.groupId);
   }

   public boolean isEmpty() {
      return true;
   }

   public void addMessage(Message message) {
      messageQueue.addMessage(message);
   }

   public Message getNextMessage() {
      return messageQueue.getNextMessage();
   }
   
   public void deliverMessageToConsumer(Message message, Consumer consumer) {

   }

   public void deleteGroup() {

   }

   public void clearMessages() {
      messageQueue.clearAll(); 
   }

   public void deliverMessageToAllConsumers(Message message) {

   }

   public void addConsumer(Consumer consumer) {
      this.consumers.add(consumer);
   }

   public void removeConsumer(Consumer consumer) {
      this.consumers.remove(consumer);
   }


}
