package com.example.todolist.ui.tasks;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.todolist.data.TaskDao;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class TasksViewModel_AssistedFactory implements ViewModelAssistedFactory<TasksViewModel> {
  private final Provider<TaskDao> taskDao;

  @Inject
  TasksViewModel_AssistedFactory(Provider<TaskDao> taskDao) {
    this.taskDao = taskDao;
  }

  @Override
  @NonNull
  public TasksViewModel create(SavedStateHandle arg0) {
    return new TasksViewModel(taskDao.get());
  }
}
