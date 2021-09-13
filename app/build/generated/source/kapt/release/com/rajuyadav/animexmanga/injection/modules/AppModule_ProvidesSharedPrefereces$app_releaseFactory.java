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
public final class AppModule_ProvidesSharedPrefereces$app_releaseFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  public AppModule_ProvidesSharedPrefereces$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return providesSharedPrefereces$app_release(module);
  }

  public static AppModule_ProvidesSharedPrefereces$app_releaseFactory create(AppModule module) {
    return new AppModule_ProvidesSharedPrefereces$app_releaseFactory(module);
  }

  public static SharedPreferences providesSharedPrefereces$app_release(AppModule instance) {
    return Preconditions.checkNotNull(instance.providesSharedPrefereces$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
