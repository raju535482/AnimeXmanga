package com.rajuyadav.animexmanga.injection.modules;

import android.content.SharedPreferences;
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
public final class AppModule_ProvidesSharedPreferencesEditor$app_debugFactory implements Factory<SharedPreferences.Editor> {
  private final AppModule module;

  public AppModule_ProvidesSharedPreferencesEditor$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences.Editor get() {
    return providesSharedPreferencesEditor$app_debug(module);
  }

  public static AppModule_ProvidesSharedPreferencesEditor$app_debugFactory create(
      AppModule module) {
    return new AppModule_ProvidesSharedPreferencesEditor$app_debugFactory(module);
  }

  public static SharedPreferences.Editor providesSharedPreferencesEditor$app_debug(
      AppModule instance) {
    return Preconditions.checkNotNull(instance.providesSharedPreferencesEditor$app_debug(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
