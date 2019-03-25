package WaspberrySocketManagement.WaspberryWebsocket;

import WaspberrySocketManagement.WaspberryMessageHandler.MessageModel;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnsatisfiedWebsocketDependenciesModule_GetMessageModelsFactory
    implements Factory<List<MessageModel>> {
  private final UnsatisfiedWebsocketDependenciesModule module;

  public UnsatisfiedWebsocketDependenciesModule_GetMessageModelsFactory(
      UnsatisfiedWebsocketDependenciesModule module) {
    this.module = module;
  }

  @Override
  public List<MessageModel> get() {
    return proxyGetMessageModels(module);
  }

  public static UnsatisfiedWebsocketDependenciesModule_GetMessageModelsFactory create(
      UnsatisfiedWebsocketDependenciesModule module) {
    return new UnsatisfiedWebsocketDependenciesModule_GetMessageModelsFactory(module);
  }

  public static List<MessageModel> proxyGetMessageModels(
      UnsatisfiedWebsocketDependenciesModule instance) {
    return Preconditions.checkNotNull(
        instance.getMessageModels(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
