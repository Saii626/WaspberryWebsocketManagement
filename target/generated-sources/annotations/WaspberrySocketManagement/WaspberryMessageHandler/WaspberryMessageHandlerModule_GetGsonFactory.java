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
public final class WaspberryMessageHandlerModule_GetGsonFactory implements Factory<Gson> {
  private final Provider<List<MessageModel>> modelsProvider;

  public WaspberryMessageHandlerModule_GetGsonFactory(Provider<List<MessageModel>> modelsProvider) {
    this.modelsProvider = modelsProvider;
  }

  @Override
  public Gson get() {
    return proxyGetGson(modelsProvider.get());
  }

  public static WaspberryMessageHandlerModule_GetGsonFactory create(
      Provider<List<MessageModel>> modelsProvider) {
    return new WaspberryMessageHandlerModule_GetGsonFactory(modelsProvider);
  }

  public static Gson proxyGetGson(List<MessageModel> models) {
    return Preconditions.checkNotNull(
        WaspberryMessageHandlerModule.getGson(models),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
