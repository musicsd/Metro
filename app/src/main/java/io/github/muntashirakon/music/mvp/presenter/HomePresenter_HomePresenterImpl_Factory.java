// Generated by Dagger (https://dagger.dev).
package io.github.muntashirakon.music.mvp.presenter;

import io.github.muntashirakon.music.providers.interfaces.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomePresenter_HomePresenterImpl_Factory implements Factory<HomePresenter.HomePresenterImpl> {
  private final Provider<Repository> repositoryProvider;

  public HomePresenter_HomePresenterImpl_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomePresenter.HomePresenterImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static HomePresenter_HomePresenterImpl_Factory create(
      Provider<Repository> repositoryProvider) {
    return new HomePresenter_HomePresenterImpl_Factory(repositoryProvider);
  }

  public static HomePresenter.HomePresenterImpl newInstance(Repository repository) {
    return new HomePresenter.HomePresenterImpl(repository);
  }
}
