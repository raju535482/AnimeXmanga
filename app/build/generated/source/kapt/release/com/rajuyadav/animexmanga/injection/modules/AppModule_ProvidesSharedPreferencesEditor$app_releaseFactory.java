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
public final class AppModule_ProvidesSharedPreferencesEditor$app_releaseFactory implements Factory<SharedPreferences.Editor> {
  private final AppModule module;

  public AppModule_ProvidesSharedPreferencesEditor$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences.Editor get() {
    return providesSharedPreferencesEditor$app_release(module);
  }

  public static AppModule_ProvidesSharedPreferencesEditor$app_releaseFactory create(
      AppModule module) {
    return new AppModule_ProvidesSharedPreferencesEditor$app_releaseFactory(module);
  }

  public static SharedPreferences.Editor providesSharedPreferencesEditor$app_release(
      AppModule instance) {
    return Preconditions.checkNotNull(instance.providesSharedPreferencesEditor$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
