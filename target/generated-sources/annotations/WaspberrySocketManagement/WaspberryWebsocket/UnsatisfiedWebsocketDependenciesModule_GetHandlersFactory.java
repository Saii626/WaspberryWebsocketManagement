package WaspberrySocketManagement.WaspberryWebsocket;

import WaspberrySocketManagement.WaspberryMessageHandler.MessageHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnsatisfiedWebsocketDependenciesModule_GetHandlersFactory
    implements Factory<List<MessageHandler>> {
  private final UnsatisfiedWebsocketDependenciesModule module;

  public UnsatisfiedWebsocketDependenciesModule_GetHandlersFactory(
      UnsatisfiedWebsocketDependenciesModule module) {
    this.module = module;
  }

  @Override
  public List<MessageHandler> get() {
    return proxyGetHandlers(module);
  }

  public static UnsatisfiedWebsocketDependenciesModule_GetHandlersFactory create(
      UnsatisfiedWebsocketDependenciesModule module) {
    return new UnsatisfiedWebsocketDependenciesModule_GetHandlersFactory(module);
  }

  public static List<MessageHandler> proxyGetHandlers(
      UnsatisfiedWebsocketDependenciesModule instance) {
    return Preconditions.checkNotNull(
        instance.getHandlers(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
