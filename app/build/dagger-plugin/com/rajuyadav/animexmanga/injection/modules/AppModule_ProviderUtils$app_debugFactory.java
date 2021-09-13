package com.rajuyadav.animexmanga.injection.modules;

import com.rajuyadav.animexmanga.utilities.AppUtils;
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
public final class AppModule_ProviderUtils$app_debugFactory implements Factory<AppUtils> {
  private final AppModule module;

  public AppModule_ProviderUtils$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AppUtils get() {
    return providerUtils$app_debug(module);
  }

  public static AppModule_ProviderUtils$app_debugFactory create(AppModule module) {
    return new AppModule_ProviderUtils$app_debugFactory(module);
  }

  public static AppUtils providerUtils$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providerUtils$app_debug());
  }
}
