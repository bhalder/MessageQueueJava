import java.lang.Runnable;

public class MessageGroupMasterRunner {

   public static void main(String[] args) {
      Thread groupMasterThread  = new Thread(new Runnable() { 
         public void run() {
            MessageGroupMaster groupMaster = new MessageGroupMaster();
            groupMaster.cli();
         }
      });

      groupMasterThread.start();
   }
}
