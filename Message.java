/**
  *   This class is useful for managing Messages which will be stored.
      This will act as the metadata class for the actual content of the 
      messages. For the trial version, all the content in this metadata
      class will be of type String. Later a layer for serialization and
      deserialization based on the messageType will be added.
  **/

public class Message {
   public static int MessageID = 0;

   private String message;
   private int msgID;

   public Message(String message) {
      this.message = message;
      this.msgID = MessageID;
      MessageID++;
   }

   public void printMessage() {
      System.out.println("==============");
      System.out.println("ID : " + msgID);
      System.out.println(message);
      System.out.println("==============");
   }

   public int getID() {
      return this.msgID;
   }

   public String getMessage() {
      return this.message;
   }
}
