package com.rajuyadav.animexmanga.injection.modules;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProviderContext$app_releaseFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProviderContext$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return providerContext$app_release(module);
  }

  public static AppModule_ProviderContext$app_releaseFactory create(AppModule module) {
    return new AppModule_ProviderContext$app_releaseFactory(module);
  }

  public static Context providerContext$app_release(AppModule instance) {
    return Preconditions.checkNotNull(instance.providerContext$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
