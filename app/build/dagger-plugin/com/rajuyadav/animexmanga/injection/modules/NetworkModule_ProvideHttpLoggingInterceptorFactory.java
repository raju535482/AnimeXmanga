package com.rajuyadav.animexmanga.injection.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return provideHttpLoggingInterceptor();
  }

  public static NetworkModule_ProvideHttpLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideHttpLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideHttpLoggingInterceptorFactory INSTANCE = new NetworkModule_ProvideHttpLoggingInterceptorFactory();
  }
}
