package com.example.todolist.di;

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
public final class AppModule_ProvidesApplicationScopeFactory implements Factory<CoroutineScope> {
  @Override
  public CoroutineScope get() {
    return providesApplicationScope();
  }

  public static AppModule_ProvidesApplicationScopeFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineScope providesApplicationScope() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.providesApplicationScope(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidesApplicationScopeFactory INSTANCE = new AppModule_ProvidesApplicationScopeFactory();
  }
}
