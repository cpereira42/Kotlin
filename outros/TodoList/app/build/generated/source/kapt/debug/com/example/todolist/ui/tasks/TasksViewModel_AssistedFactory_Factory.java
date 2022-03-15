package com.example.todolist.ui.tasks;

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

  public TasksViewModel_AssistedFactory_Factory(Provider<TaskDao> taskDaoProvider) {
    this.taskDaoProvider = taskDaoProvider;
  }

  @Override
  public TasksViewModel_AssistedFactory get() {
    return newInstance(taskDaoProvider);
  }

  public static TasksViewModel_AssistedFactory_Factory create(Provider<TaskDao> taskDaoProvider) {
    return new TasksViewModel_AssistedFactory_Factory(taskDaoProvider);
  }

  public static TasksViewModel_AssistedFactory newInstance(Provider<TaskDao> taskDao) {
    return new TasksViewModel_AssistedFactory(taskDao);
  }
}
