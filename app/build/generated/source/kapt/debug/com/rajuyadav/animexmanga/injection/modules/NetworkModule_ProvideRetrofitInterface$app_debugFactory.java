package com.rajuyadav.animexmanga.injection.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitInterface$app_debugFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofitInterface$app_debug();
  }

  public static NetworkModule_ProvideRetrofitInterface$app_debugFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofitInterface$app_debug() {
    return Preconditions.checkNotNull(NetworkModule.provideRetrofitInterface$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideRetrofitInterface$app_debugFactory INSTANCE = new NetworkModule_ProvideRetrofitInterface$app_debugFactory();
  }
}
