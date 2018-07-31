package strategy;

import org.junit.Assert;
import org.junit.Test;


public class HandlerFactoryTest {

  @Test
  public void shouldHandleAlpha() {
    Assert.assertEquals("I handled the ALPHA TYPE!", HandlerFactory.handle(HandlableType.ENTITY_ALPHA));
  }

  @Test
  public void shouldHandleBeta() {
    Assert.assertEquals("I handled the BETA TYPE!", HandlerFactory.handle(HandlableType.ENTITY_BETA));
  }

}
