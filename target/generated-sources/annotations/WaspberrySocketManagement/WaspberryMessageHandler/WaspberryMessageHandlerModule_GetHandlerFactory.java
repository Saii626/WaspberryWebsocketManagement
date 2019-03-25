package WaspberrySocketManagement.WaspberryMessageHandler;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WaspberryMessageHandlerModule_GetHandlerFactory
    implements Factory<WaspberryMessageHandler> {
  private final Provider<Gson> gsonProvider;

  private final Provider<List<MessageHandler>> messageHandlersProvider;

  public WaspberryMessageHandlerModule_GetHandlerFactory(
      Provider<Gson> gsonProvider, Provider<List<MessageHandler>> messageHandlersProvider) {
    this.gsonProvider = gsonProvider;
    this.messageHandlersProvider = messageHandlersProvider;
  }

  @Override
  public WaspberryMessageHandler get() {
    return proxyGetHandler(gsonProvider.get(), messageHandlersProvider.get());
  }

  public static WaspberryMessageHandlerModule_GetHandlerFactory create(
      Provider<Gson> gsonProvider, Provider<List<MessageHandler>> messageHandlersProvider) {
    return new WaspberryMessageHandlerModule_GetHandlerFactory(
        gsonProvider, messageHandlersProvider);
  }

  public static WaspberryMessageHandler proxyGetHandler(
      Gson gson, List<MessageHandler> messageHandlers) {
    return Preconditions.checkNotNull(
        WaspberryMessageHandlerModule.getHandler(gson, messageHandlers),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
