package TestNG.Junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.message.Message;
public class TestJunit {

   String message = "Hello World";  
   Message messageUtil = (Message) new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message, ((MessageUtil) messageUtil).printMessage());
   }
}