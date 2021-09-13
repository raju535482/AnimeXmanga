package com.rajuyadav.animexmanga.injection.modules;

import com.rajuyadav.animexmanga.utilities.AppUtils;
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
public final class AppModule_ProviderUtils$app_releaseFactory implements Factory<AppUtils> {
  private final AppModule module;

  public AppModule_ProviderUtils$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AppUtils get() {
    return providerUtils$app_release(module);
  }

  public static AppModule_ProviderUtils$app_releaseFactory create(AppModule module) {
    return new AppModule_ProviderUtils$app_releaseFactory(module);
  }

  public static AppUtils providerUtils$app_release(AppModule instance) {
    return Preconditions.checkNotNull(instance.providerUtils$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
