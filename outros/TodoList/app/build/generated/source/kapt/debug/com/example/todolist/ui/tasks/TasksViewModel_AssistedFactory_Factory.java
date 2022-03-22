package com.example.todolist.ui.tasks;

import com.example.todolist.data.PreferencesManager;
import com.example.todolist.data.TaskDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TasksViewModel_AssistedFactory_Factory implements Factory<TasksViewModel_AssistedFactory> {
  private final Provider<TaskDao> taskDaoProvider;

  private final Provider<PreferencesManager> preferencesManagerProvider;

  public TasksViewModel_AssistedFactory_Factory(Provider<TaskDao> taskDaoProvider,
      Provider<PreferencesManager> preferencesManagerProvider) {
    this.taskDaoProvider = taskDaoProvider;
    this.preferencesManagerProvider = preferencesManagerProvider;
  }

  @Override
  public TasksViewModel_AssistedFactory get() {
    return newInstance(taskDaoProvider, preferencesManagerProvider);
  }

  public static TasksViewModel_AssistedFactory_Factory create(Provider<TaskDao> taskDaoProvider,
      Provider<PreferencesManager> preferencesManagerProvider) {
    return new TasksViewModel_AssistedFactory_Factory(taskDaoProvider, preferencesManagerProvider);
  }

  public static TasksViewModel_AssistedFactory newInstance(Provider<TaskDao> taskDao,
      Provider<PreferencesManager> preferencesManager) {
    return new TasksViewModel_AssistedFactory(taskDao, preferencesManager);
  }
}
