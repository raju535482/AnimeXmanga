package com.rajuyadav.animexmanga.injection.modules;

import com.rajuyadav.animexmanga.APIService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidePostApi$app_releaseFactory implements Factory<APIService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidePostApi$app_releaseFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public APIService get() {
    return providePostApi$app_release(retrofitProvider.get());
  }

  public static NetworkModule_ProvidePostApi$app_releaseFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidePostApi$app_releaseFactory(retrofitProvider);
  }

  public static APIService providePostApi$app_release(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.providePostApi$app_release(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
