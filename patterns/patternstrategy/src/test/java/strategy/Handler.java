package strategy;

public interface Handler {
  boolean doesHandle(HandlableType t);
  String handle(HandlableType t);
}
