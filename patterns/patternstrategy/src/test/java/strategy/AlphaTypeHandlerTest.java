package strategy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaTypeHandlerTest {

  private Handler unit = new AlphaTypeHandler();

  @Test
  public void doesHandle() {
    Assert.assertTrue(unit.doesHandle(HandlableType.ENTITY_ALPHA));
  }

  @Test
  public void handle() {
    Assert.assertEquals("I handled the ALPHA TYPE!", unit.handle(HandlableType.ENTITY_ALPHA));
  }
}