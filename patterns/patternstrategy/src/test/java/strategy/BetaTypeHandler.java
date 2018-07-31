package strategy;

public class BetaTypeHandler implements Handler {

  public boolean doesHandle(HandlableType handlableType) {
    return HandlableType.ENTITY_BETA == handlableType;
  }

  public String handle(HandlableType handlableType) {
    return "I handled the BETA TYPE!";
  }
}
