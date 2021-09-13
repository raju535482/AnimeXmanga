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
public final class AppModule_ProviderContext$app_debugFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProviderContext$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return providerContext$app_debug(module);
  }

  public static AppModule_ProviderContext$app_debugFactory create(AppModule module) {
    return new AppModule_ProviderContext$app_debugFactory(module);
  }

  public static Context providerContext$app_debug(AppModule instance) {
    return Preconditions.checkNotNull(instance.providerContext$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
