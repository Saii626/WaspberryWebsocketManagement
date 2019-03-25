package WaspberrySocketManagement.WaspberryWebsocket;

import WaspberrySocketManagement.WaspberryMessageHandler.WaspberryMessageHandler;
import WaspberrySocketManagement.Websocket.WebSocketConnector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.time.Duration;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WaspberryWebsocketModule_GetSocketManagerFactory
    implements Factory<WaspberrySocketManager> {
  private final Provider<WebSocketConnector> connectorProvider;

  private final Provider<WaspberryMessageHandler> messageHandlerProvider;

  private final Provider<Duration> retryTimeoutProvider;

  public WaspberryWebsocketModule_GetSocketManagerFactory(
      Provider<WebSocketConnector> connectorProvider,
      Provider<WaspberryMessageHandler> messageHandlerProvider,
      Provider<Duration> retryTimeoutProvider) {
    this.connectorProvider = connectorProvider;
    this.messageHandlerProvider = messageHandlerProvider;
    this.retryTimeoutProvider = retryTimeoutProvider;
  }

  @Override
  public WaspberrySocketManager get() {
    return proxyGetSocketManager(
        connectorProvider.get(), messageHandlerProvider.get(), retryTimeoutProvider.get());
  }

  public static WaspberryWebsocketModule_GetSocketManagerFactory create(
      Provider<WebSocketConnector> connectorProvider,
      Provider<WaspberryMessageHandler> messageHandlerProvider,
      Provider<Duration> retryTimeoutProvider) {
    return new WaspberryWebsocketModule_GetSocketManagerFactory(
        connectorProvider, messageHandlerProvider, retryTimeoutProvider);
  }

  public static WaspberrySocketManager proxyGetSocketManager(
      WebSocketConnector connector, WaspberryMessageHandler messageHandler, Duration retryTimeout) {
    return Preconditions.checkNotNull(
        WaspberryWebsocketModule.getSocketManager(connector, messageHandler, retryTimeout),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
