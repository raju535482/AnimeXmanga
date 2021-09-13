package com.rajuyadav.animexmanga.injection.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCoroutineScope$app_debugFactory implements Factory<CoroutineScope> {
  private final AppModule module;

  public AppModule_ProvideCoroutineScope$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CoroutineScope get() {
    return provideCoroutineScope$app_debug(module);
  }

  public static AppModule_ProvideCoroutineScope$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideCoroutineScope$app_debugFactory(module);
  }

  public static CoroutineScope provideCoroutineScope$app_debug(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideCoroutineScope$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
