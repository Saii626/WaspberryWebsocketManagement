package WaspberrySocketManagement.WaspberryWebsocket;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.net.URI;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnsatisfiedWebsocketDependenciesModule_GetUriFactory implements Factory<URI> {
  private final UnsatisfiedWebsocketDependenciesModule module;

  public UnsatisfiedWebsocketDependenciesModule_GetUriFactory(
      UnsatisfiedWebsocketDependenciesModule module) {
    this.module = module;
  }

  @Override
  public URI get() {
    return proxyGetUri(module);
  }

  public static UnsatisfiedWebsocketDependenciesModule_GetUriFactory create(
      UnsatisfiedWebsocketDependenciesModule module) {
    return new UnsatisfiedWebsocketDependenciesModule_GetUriFactory(module);
  }

  public static URI proxyGetUri(UnsatisfiedWebsocketDependenciesModule instance) {
    return Preconditions.checkNotNull(
        instance.getUri(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
