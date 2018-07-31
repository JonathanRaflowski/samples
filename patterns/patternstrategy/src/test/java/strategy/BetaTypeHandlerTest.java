package strategy;

import org.junit.Assert;
import org.junit.Test;

public class BetaTypeHandlerTest {

  private Handler unit = new BetaTypeHandler();

  @Test
  public void doesHandle() {
    Assert.assertTrue(unit.doesHandle(HandlableType.ENTITY_BETA));
  }

  @Test
  public void handle() {
    Assert.assertEquals("I handled the BETA TYPE!", unit.handle(HandlableType.ENTITY_BETA));
  }
}