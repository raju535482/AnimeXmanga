package com.rajuyadav.animexmanga.injection.modules;

import android.app.Application;
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
public final class AppModule_ProviderApplication$app_releaseFactory implements Factory<Application> {
  private final AppModule module;

  public AppModule_ProviderApplication$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Application get() {
    return providerApplication$app_release(module);
  }

  public static AppModule_ProviderApplication$app_releaseFactory create(AppModule module) {
    return new AppModule_ProviderApplication$app_releaseFactory(module);
  }

  public static Application providerApplication$app_release(AppModule instance) {
    return Preconditions.checkNotNull(instance.providerApplication$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
