package com.rajuyadav.animexmanga.injection.component;

import com.rajuyadav.animexmanga.APIService;
import com.rajuyadav.animexmanga.App;
import com.rajuyadav.animexmanga.BaseActivity;
import com.rajuyadav.animexmanga.database.MangaRoomDatabase;
import com.rajuyadav.animexmanga.injection.modules.AppModule;
import com.rajuyadav.animexmanga.injection.modules.AppModule_ProvideCoroutineScope$app_debugFactory;
import com.rajuyadav.animexmanga.injection.modules.AppModule_ProviderMangaDatabase$app_debugFactory;
import com.rajuyadav.animexmanga.injection.modules.NetworkModule;
import com.rajuyadav.animexmanga.injection.modules.NetworkModule_ProvidePostApi$app_debugFactory;
import com.rajuyadav.animexmanga.injection.modules.NetworkModule_ProvideRetrofitInterface$app_debugFactory;
import com.rajuyadav.animexmanga.ui.MangaListActivity;
import com.rajuyadav.animexmanga.viewmodel.MainViewModel;
import com.rajuyadav.animexmanga.viewmodel.MainViewModel_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.SingleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<CoroutineScope> provideCoroutineScope$app_debugProvider;

  private Provider<Retrofit> provideRetrofitInterface$app_debugProvider;

  private Provider<APIService> providePostApi$app_debugProvider;

  private Provider<MangaRoomDatabase> providerMangaDatabase$app_debugProvider;

  private DaggerAppComponent(AppModule appModuleParam) {

    initialize(appModuleParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam) {
    this.provideCoroutineScope$app_debugProvider = DoubleCheck.provider(AppModule_ProvideCoroutineScope$app_debugFactory.create(appModuleParam));
    this.provideRetrofitInterface$app_debugProvider = SingleCheck.provider(NetworkModule_ProvideRetrofitInterface$app_debugFactory.create());
    this.providePostApi$app_debugProvider = SingleCheck.provider(NetworkModule_ProvidePostApi$app_debugFactory.create(provideRetrofitInterface$app_debugProvider));
    this.providerMangaDatabase$app_debugProvider = DoubleCheck.provider(AppModule_ProviderMangaDatabase$app_debugFactory.create(appModuleParam));
  }

  @Override
  public void inject(App arg0) {
  }

  @Override
  public void inject(BaseActivity arg0) {
  }

  @Override
  public void inject(MangaListActivity arg0) {
  }

  @Override
  public void inject(MangaRoomDatabase arg0) {
  }

  @Override
  public void inject(MainViewModel arg0) {
    injectMainViewModel(arg0);
  }

  private MainViewModel injectMainViewModel(MainViewModel instance) {
    MainViewModel_MembersInjector.injectApplicationScope(instance, provideCoroutineScope$app_debugProvider.get());
    MainViewModel_MembersInjector.injectApiService(instance, providePostApi$app_debugProvider.get());
    MainViewModel_MembersInjector.injectMangaRoomDatabase(instance, providerMangaDatabase$app_debugProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Override
    @Deprecated
    public Builder networkModule(NetworkModule arg0) {
      Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public Builder appModule(AppModule arg0) {
      this.appModule = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appModule, AppModule.class);
      return new DaggerAppComponent(appModule);
    }
  }
}
