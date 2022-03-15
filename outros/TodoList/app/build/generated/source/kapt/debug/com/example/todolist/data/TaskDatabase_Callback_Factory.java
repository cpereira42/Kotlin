package com.example.todolist.data;

import dagger.internal.Factory;
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
public final class TaskDatabase_Callback_Factory implements Factory<TaskDatabase.Callback> {
  private final Provider<TaskDatabase> databaseProvider;

  private final Provider<CoroutineScope> applicationScopeProvider;

  public TaskDatabase_Callback_Factory(Provider<TaskDatabase> databaseProvider,
      Provider<CoroutineScope> applicationScopeProvider) {
    this.databaseProvider = databaseProvider;
    this.applicationScopeProvider = applicationScopeProvider;
  }

  @Override
  public TaskDatabase.Callback get() {
    return newInstance(databaseProvider, applicationScopeProvider.get());
  }

  public static TaskDatabase_Callback_Factory create(Provider<TaskDatabase> databaseProvider,
      Provider<CoroutineScope> applicationScopeProvider) {
    return new TaskDatabase_Callback_Factory(databaseProvider, applicationScopeProvider);
  }

  public static TaskDatabase.Callback newInstance(Provider<TaskDatabase> database,
      CoroutineScope applicationScope) {
    return new TaskDatabase.Callback(database, applicationScope);
  }
}
