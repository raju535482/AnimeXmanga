package com.rajuyadav.animexmanga.viewmodel;

import com.rajuyadav.animexmanga.APIService;
import com.rajuyadav.animexmanga.database.MangaRoomDatabase;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_MembersInjector implements MembersInjector<MainViewModel> {
  private final Provider<CoroutineScope> applicationScopeProvider;

  private final Provider<APIService> apiServiceProvider;

  private final Provider<MangaRoomDatabase> mangaRoomDatabaseProvider;

  public MainViewModel_MembersInjector(Provider<CoroutineScope> applicationScopeProvider,
      Provider<APIService> apiServiceProvider,
      Provider<MangaRoomDatabase> mangaRoomDatabaseProvider) {
    this.applicationScopeProvider = applicationScopeProvider;
    this.apiServiceProvider = apiServiceProvider;
    this.mangaRoomDatabaseProvider = mangaRoomDatabaseProvider;
  }

  public static MembersInjector<MainViewModel> create(
      Provider<CoroutineScope> applicationScopeProvider, Provider<APIService> apiServiceProvider,
      Provider<MangaRoomDatabase> mangaRoomDatabaseProvider) {
    return new MainViewModel_MembersInjector(applicationScopeProvider, apiServiceProvider, mangaRoomDatabaseProvider);
  }

  @Override
  public void injectMembers(MainViewModel instance) {
    injectApplicationScope(instance, applicationScopeProvider.get());
    injectApiService(instance, apiServiceProvider.get());
    injectMangaRoomDatabase(instance, mangaRoomDatabaseProvider.get());
  }

  @InjectedFieldSignature("com.rajuyadav.animexmanga.viewmodel.MainViewModel.applicationScope")
  public static void injectApplicationScope(MainViewModel instance,
      CoroutineScope applicationScope) {
    instance.applicationScope = applicationScope;
  }

  @InjectedFieldSignature("com.rajuyadav.animexmanga.viewmodel.MainViewModel.apiService")
  public static void injectApiService(MainViewModel instance, APIService apiService) {
    instance.apiService = apiService;
  }

  @InjectedFieldSignature("com.rajuyadav.animexmanga.viewmodel.MainViewModel.mangaRoomDatabase")
  public static void injectMangaRoomDatabase(MainViewModel instance,
      MangaRoomDatabase mangaRoomDatabase) {
    instance.mangaRoomDatabase = mangaRoomDatabase;
  }
}
