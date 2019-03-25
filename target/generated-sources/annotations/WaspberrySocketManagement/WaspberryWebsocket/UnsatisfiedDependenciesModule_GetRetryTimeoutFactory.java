package WaspberrySocketManagement.WaspberryWebsocket;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.time.Duration;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnsatisfiedDependenciesModule_GetRetryTimeoutFactory
    implements Factory<Duration> {
  private final UnsatisfiedWebsocketDependenciesModule module;

  public UnsatisfiedDependenciesModule_GetRetryTimeoutFactory(
      UnsatisfiedWebsocketDependenciesModule module) {
    this.module = module;
  }

  @Override
  public Duration get() {
    return proxyGetRetryTimeout(module);
  }

  public static UnsatisfiedDependenciesModule_GetRetryTimeoutFactory create(
      UnsatisfiedWebsocketDependenciesModule module) {
    return new UnsatisfiedDependenciesModule_GetRetryTimeoutFactory(module);
  }

  public static Duration proxyGetRetryTimeout(UnsatisfiedWebsocketDependenciesModule instance) {
    return Preconditions.checkNotNull(
        instance.getRetryTimeout(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
