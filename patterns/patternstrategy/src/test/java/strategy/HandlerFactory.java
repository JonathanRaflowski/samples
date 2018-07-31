package strategy;

import java.util.ArrayList;
import java.util.List;

public class HandlerFactory {

  private static List<Handler> myTypeHandlers = new ArrayList() {{
    add(new AlphaTypeHandler());
    add(new BetaTypeHandler());
  }};

  public static String handle(HandlableType type) {
    for (Handler h : myTypeHandlers) {
      if (h.doesHandle(type)) {
        return h.handle(type);
      }
    }
    throw new IllegalArgumentException("Unknown HandlableType: " + type);
  }
}
