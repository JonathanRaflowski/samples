package strategy;

public class AlphaTypeHandler implements Handler {

  public boolean doesHandle(HandlableType handlableType) {
    return HandlableType.ENTITY_ALPHA == handlableType;
  }

  public String handle(HandlableType handlableType) {
    return "I handled the ALPHA TYPE!";
  }
}
