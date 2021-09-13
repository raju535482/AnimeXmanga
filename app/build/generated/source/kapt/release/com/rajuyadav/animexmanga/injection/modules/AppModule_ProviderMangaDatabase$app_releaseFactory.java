package com.rajuyadav.animexmanga.injection.modules;

import com.rajuyadav.animexmanga.database.MangaRoomDatabase;
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
public final class AppModule_ProviderMangaDatabase$app_releaseFactory implements Factory<MangaRoomDatabase> {
  private final AppModule module;

  public AppModule_ProviderMangaDatabase$app_releaseFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public MangaRoomDatabase get() {
    return providerMangaDatabase$app_release(module);
  }

  public static AppModule_ProviderMangaDatabase$app_releaseFactory create(AppModule module) {
    return new AppModule_ProviderMangaDatabase$app_releaseFactory(module);
  }

  public static MangaRoomDatabase providerMangaDatabase$app_release(AppModule instance) {
    return Preconditions.checkNotNull(instance.providerMangaDatabase$app_release(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
