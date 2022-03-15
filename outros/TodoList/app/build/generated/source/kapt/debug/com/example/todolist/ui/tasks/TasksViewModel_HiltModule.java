package com.example.todolist.ui.tasks;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = TasksViewModel.class
)
public interface TasksViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.todolist.ui.tasks.TasksViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(TasksViewModel_AssistedFactory factory);
}
