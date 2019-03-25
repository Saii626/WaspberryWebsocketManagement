package WaspberrySocketManagement.WaspberryWebsocket;

import WaspberrySocketManagement.WaspberryMessageHandler.MessageHandler;
import WaspberrySocketManagement.WaspberryMessageHandler.MessageModel;
import WaspberrySocketManagement.WaspberryMessageHandler.WaspberryMessageHandler;
import WaspberrySocketManagement.WaspberryMessageHandler.WaspberryMessageHandlerModule;
import WaspberrySocketManagement.WaspberryMessageHandler.WaspberryMessageHandlerModule_GetGsonFactory;
import WaspberrySocketManagement.WaspberryMessageHandler.WaspberryMessageHandlerModule_GetHandlerFactory;
import WaspberrySocketManagement.Websocket.WebSocketConnector;
import WaspberrySocketManagement.Websocket.WebSocketConnector_Factory;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.net.URI;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerWaspberryWebsocketComponent implements WaspberryWebsocketComponent {
  private Provider<URI> getUriProvider;

  private Provider<WebSocketConnector> webSocketConnectorProvider;

  private Provider<List<MessageModel>> getMessageModelsProvider;

  private Provider<Gson> getGsonProvider;

  private Provider<List<MessageHandler>> getHandlersProvider;

  private Provider<WaspberryMessageHandler> getHandlerProvider;

  private Provider<Duration> getRetryTimeoutProvider;

  private Provider<WaspberrySocketManager> getSocketManagerProvider;

  private DaggerWaspberryWebsocketComponent(
      UnsatisfiedWebsocketDependenciesModule unsatisfiedWebsocketDependenciesModuleParam) {

    initialize(unsatisfiedWebsocketDependenciesModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(
      final UnsatisfiedWebsocketDependenciesModule unsatisfiedWebsocketDependenciesModuleParam) {
    this.getUriProvider =
        DoubleCheck.provider(
            UnsatisfiedWebsocketDependenciesModule_GetUriFactory.create(
                unsatisfiedWebsocketDependenciesModuleParam));
    this.webSocketConnectorProvider = WebSocketConnector_Factory.create(getUriProvider);
    this.getMessageModelsProvider =
        DoubleCheck.provider(
            UnsatisfiedWebsocketDependenciesModule_GetMessageModelsFactory.create(
                unsatisfiedWebsocketDependenciesModuleParam));
    this.getGsonProvider =
        DoubleCheck.provider(
            WaspberryMessageHandlerModule_GetGsonFactory.create(getMessageModelsProvider));
    this.getHandlersProvider =
        DoubleCheck.provider(
            UnsatisfiedWebsocketDependenciesModule_GetHandlersFactory.create(
                unsatisfiedWebsocketDependenciesModuleParam));
    this.getHandlerProvider =
        DoubleCheck.provider(
            WaspberryMessageHandlerModule_GetHandlerFactory.create(
                getGsonProvider, getHandlersProvider));
    this.getRetryTimeoutProvider =
        DoubleCheck.provider(
            UnsatisfiedWebsocketDependenciesModule_GetRetryTimeoutFactory.create(
                unsatisfiedWebsocketDependenciesModuleParam));
    this.getSocketManagerProvider =
        DoubleCheck.provider(
            WaspberryWebsocketModule_GetSocketManagerFactory.create(
                webSocketConnectorProvider, getHandlerProvider, getRetryTimeoutProvider));
  }

  @Override
  public WaspberrySocketManager getWaspberrySocketManager() {
    return getSocketManagerProvider.get();
  }

  @Override
  public WaspberryMessageHandler getWaspberryMessageHandler() {
    return getHandlerProvider.get();
  }

  public static final class Builder {
    private UnsatisfiedWebsocketDependenciesModule unsatisfiedWebsocketDependenciesModule;

    private Builder() {}

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder waspberryWebsocketModule(WaspberryWebsocketModule waspberryWebsocketModule) {
      Preconditions.checkNotNull(waspberryWebsocketModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder waspberryMessageHandlerModule(
        WaspberryMessageHandlerModule waspberryMessageHandlerModule) {
      Preconditions.checkNotNull(waspberryMessageHandlerModule);
      return this;
    }

    public Builder unsatisfiedWebsocketDependenciesModule(
        UnsatisfiedWebsocketDependenciesModule unsatisfiedWebsocketDependenciesModule) {
      this.unsatisfiedWebsocketDependenciesModule =
          Preconditions.checkNotNull(unsatisfiedWebsocketDependenciesModule);
      return this;
    }

    public WaspberryWebsocketComponent build() {
      Preconditions.checkBuilderRequirement(
          unsatisfiedWebsocketDependenciesModule, UnsatisfiedWebsocketDependenciesModule.class);
      return new DaggerWaspberryWebsocketComponent(unsatisfiedWebsocketDependenciesModule);
    }
  }
}
