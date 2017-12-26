import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MessageGroupMaster {

   private HashMap<Integer, MessageGroup> managedGroups;
   
   public MessageGroupMaster() {
      managedGroups = new HashMap<Integer, MessageGroup>();

   }

   public void joinGroup(int groupId, Consumer consumer) {

   }

   public void leaveGroup(int groupId, Consumer consumer) {

   }

   public void startGroup(Producer producer) {

   }

   public void deleteGroup(Producer producer) {

   }

   public void addMessage(int groupId, Producer producer, Message message) {

   }

   public class Operation {
      public int operation;
      public int groupId;
      public String message;
      public Producer producer;
      public Consumer consumer;

      public Operation(int operation, int groupId, String message, Producer producer, Consumer consumer) {
         this.operation = operation;
         this.groupId = groupId;
         this.message = message;
         this.producer = producer;
         this.consumer = consumer;
      }
   }

   public void cli() {
      InputStreamReader cin = new InputStreamReader(System.in);   
      BufferedReader in = new BufferedReader(cin);
      Operation operation = null;

      while(true) {
         // Read input
         try {
         System.out.print("$> ");
         String input = in.readLine();   

         // Parse
         operation = parseInput(input);

         // Perform operation
         } catch (IOException exception) {
            System.out.println("IOException ");
         }
      }

   }
   
   // operation groupId <producer|consumer> [message] 

   public Operation parseInput(String input) {
      int operation = 0;
      int groupId = 0;
      Producer producer = null;
      Consumer consumer = null;
      String message = null;

      return new Operation(operation, groupId, message, producer, consumer); 
   } 
}
