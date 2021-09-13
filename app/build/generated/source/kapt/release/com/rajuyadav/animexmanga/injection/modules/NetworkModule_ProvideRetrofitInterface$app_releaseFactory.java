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
public final class NetworkModule_ProvideRetrofitInterface$app_releaseFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return provideRetrofitInterface$app_release();
  }

  public static NetworkModule_ProvideRetrofitInterface$app_releaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit provideRetrofitInterface$app_release() {
    return Preconditions.checkNotNull(NetworkModule.provideRetrofitInterface$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideRetrofitInterface$app_releaseFactory INSTANCE = new NetworkModule_ProvideRetrofitInterface$app_releaseFactory();
  }
}
