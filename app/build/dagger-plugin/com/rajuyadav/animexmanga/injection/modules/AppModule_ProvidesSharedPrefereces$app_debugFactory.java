package com.rajuyadav.animexmanga.injection.modules;

import android.content.SharedPreferences;
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
public final class AppModule_ProvidesSharedPrefereces$app_debugFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  public AppModule_ProvidesSharedPrefereces$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return providesSharedPrefereces$app_debug(module);
  }

  public static AppModule_ProvidesSharedPrefereces$app_debugFactory create(AppModule module) {
    return new AppModule_ProvidesSharedPrefereces$app_debugFactory(module);
  }

  public static SharedPreferences providesSharedPrefereces$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesSharedPrefereces$app_debug());
  }
}
