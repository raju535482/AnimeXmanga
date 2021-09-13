package com.rajuyadav.animexmanga.injection.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProviderApplication$app_debugFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_ProviderApplication$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return providerApplication$app_debug(module);
  }

  public static AppModule_ProviderApplication$app_debugFactory create(AppModule module) {
    return new AppModule_ProviderApplication$app_debugFactory(module);
  }

  public static Application providerApplication$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providerApplication$app_debug());
  }
}
