package com.example.todolist;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.todolist.data.PreferencesManager;
import com.example.todolist.data.TaskDao;
import com.example.todolist.data.TaskDatabase;
import com.example.todolist.di.AppModule;
import com.example.todolist.di.AppModule_ProvideDatabaseFactory;
import com.example.todolist.di.AppModule_ProvideTaskDaoFactory;
import com.example.todolist.di.AppModule_ProvidesApplicationScopeFactory;
import com.example.todolist.ui.MainActivity;
import com.example.todolist.ui.tasks.TasksFragment;
import com.example.todolist.ui.tasks.TasksViewModel_AssistedFactory;
import com.example.todolist.ui.tasks.TasksViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerTodoApplication_HiltComponents_SingletonC extends TodoApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Provider<TaskDatabase> provideDatabaseProvider;

  private volatile Object applicationScopeCoroutineScope = new MemoizedSentinel();

  private volatile Object taskDatabase = new MemoizedSentinel();

  private volatile Provider<TaskDao> provideTaskDaoProvider;

  private volatile Object preferencesManager = new MemoizedSentinel();

  private volatile Provider<PreferencesManager> preferencesManagerProvider;

  private DaggerTodoApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Provider<TaskDatabase> getTaskDatabaseProvider() {
    Object local = provideDatabaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      provideDatabaseProvider = (Provider<TaskDatabase>) local;
    }
    return (Provider<TaskDatabase>) local;
  }

  private CoroutineScope getApplicationScopeCoroutineScope() {
    Object local = applicationScopeCoroutineScope;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = applicationScopeCoroutineScope;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidesApplicationScopeFactory.providesApplicationScope();
          applicationScopeCoroutineScope = DoubleCheck.reentrantCheck(applicationScopeCoroutineScope, local);
        }
      }
    }
    return (CoroutineScope) local;
  }

  private TaskDatabase.Callback getCallback() {
    return new TaskDatabase.Callback(getTaskDatabaseProvider(), getApplicationScopeCoroutineScope());
  }

  private TaskDatabase getTaskDatabase() {
    Object local = taskDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = taskDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule), getCallback());
          taskDatabase = DoubleCheck.reentrantCheck(taskDatabase, local);
        }
      }
    }
    return (TaskDatabase) local;
  }

  private TaskDao getTaskDao() {
    return AppModule_ProvideTaskDaoFactory.provideTaskDao(getTaskDatabase());
  }

  private Provider<TaskDao> getTaskDaoProvider() {
    Object local = provideTaskDaoProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideTaskDaoProvider = (Provider<TaskDao>) local;
    }
    return (Provider<TaskDao>) local;
  }

  private PreferencesManager getPreferencesManager() {
    Object local = preferencesManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = preferencesManager;
        if (local instanceof MemoizedSentinel) {
          local = new PreferencesManager(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          preferencesManager = DoubleCheck.reentrantCheck(preferencesManager, local);
        }
      }
    }
    return (PreferencesManager) local;
  }

  private Provider<PreferencesManager> getPreferencesManagerProvider() {
    Object local = preferencesManagerProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      preferencesManagerProvider = (Provider<PreferencesManager>) local;
    }
    return (Provider<PreferencesManager>) local;
  }

  @Override
  public void injectTodoApplication(TodoApplication todoApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public TodoApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerTodoApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements TodoApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public TodoApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends TodoApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements TodoApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public TodoApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends TodoApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<TasksViewModel_AssistedFactory> tasksViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private TasksViewModel_AssistedFactory getTasksViewModel_AssistedFactory() {
        return TasksViewModel_AssistedFactory_Factory.newInstance(DaggerTodoApplication_HiltComponents_SingletonC.this.getTaskDaoProvider(), DaggerTodoApplication_HiltComponents_SingletonC.this.getPreferencesManagerProvider());
      }

      private Provider<TasksViewModel_AssistedFactory> getTasksViewModel_AssistedFactoryProvider() {
        Object local = tasksViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          tasksViewModel_AssistedFactoryProvider = (Provider<TasksViewModel_AssistedFactory>) local;
        }
        return (Provider<TasksViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.example.todolist.ui.tasks.TasksViewModel", (Provider) getTasksViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerTodoApplication_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements TodoApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public TodoApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends TodoApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerTodoApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectTasksFragment(TasksFragment tasksFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements TodoApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public TodoApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends TodoApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements TodoApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public TodoApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends TodoApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.todolist.ui.tasks.TasksViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getTasksViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements TodoApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public TodoApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends TodoApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.example.todolist.data.TaskDao 
        return (T) DaggerTodoApplication_HiltComponents_SingletonC.this.getTaskDao();

        case 1: // com.example.todolist.data.TaskDatabase 
        return (T) DaggerTodoApplication_HiltComponents_SingletonC.this.getTaskDatabase();

        case 2: // com.example.todolist.data.PreferencesManager 
        return (T) DaggerTodoApplication_HiltComponents_SingletonC.this.getPreferencesManager();

        default: throw new AssertionError(id);
      }
    }
  }
}
