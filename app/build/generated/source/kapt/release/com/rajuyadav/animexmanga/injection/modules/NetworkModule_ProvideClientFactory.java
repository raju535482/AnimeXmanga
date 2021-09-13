package com.rajuyadav.animexmanga.injection.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideClient();
  }

  public static NetworkModule_ProvideClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideClient() {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideClientFactory INSTANCE = new NetworkModule_ProvideClientFactory();
  }
}
