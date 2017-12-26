import java.util.HashMap;
import java.util.ArrayList;

/* 
   There is only one MessageQueue per topic. 
   This class provides APIs for safe creation and 
   access of all the messages associate with the 
   queue operations.

   Currently we do not have the concept of partition implemented
   In future versions there will be addition of the partition feature.
   Each partition will be identified by a Partition ID. Each 
   Partition ID will be present on either the same system or outside 
   of it. 

   Also, the current system only perform on in-memory messages. Persistence
   will be built in later.
*/

public class MessageQueue {

   public static int QUEUEID = 0;
   public static ArrayList<Integer> groupList = new ArrayList<Integer>();

   /* Hashmap <PartitionID, Messages> */
   /* Initially all the PartitionIDs will be 0 */
   private HashMap<Integer, ArrayList<Message>> queue;
   private int groupId;
   private int queueId;

   public void addMessage(Message message) {
      queue.get(0).add(message);
   }

   public Message getNextMessage() {
      return null;
   }

   public void clearAll() {

   }

   MessageQueue(int groupId) {
      this.groupId = groupId;

      groupList.add(groupId);
      this.queueId = QUEUEID++;
      this.queue = new HashMap<Integer, ArrayList<Message>>();
      this.queue.put(0, new ArrayList<Message>());
   }

} 
