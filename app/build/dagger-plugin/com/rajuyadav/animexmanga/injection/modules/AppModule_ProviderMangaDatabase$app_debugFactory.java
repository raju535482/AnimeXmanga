package com.rajuyadav.animexmanga.injection.modules;

import com.rajuyadav.animexmanga.database.MangaRoomDatabase;
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
public final class AppModule_ProviderMangaDatabase$app_debugFactory implements Factory<MangaRoomDatabase> {
  private final AppModule module;

  public AppModule_ProviderMangaDatabase$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public MangaRoomDatabase get() {
    return providerMangaDatabase$app_debug(module);
  }

  public static AppModule_ProviderMangaDatabase$app_debugFactory create(AppModule module) {
    return new AppModule_ProviderMangaDatabase$app_debugFactory(module);
  }

  public static MangaRoomDatabase providerMangaDatabase$app_debug(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providerMangaDatabase$app_debug());
  }
}
