package com.example.todolist.ui.tasks;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.ViewModel;
import com.example.todolist.data.PreferencesManager;
import com.example.todolist.data.SortOrder;
import com.example.todolist.data.Task;
import com.example.todolist.data.TaskDao;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020 J\u000e\u0010\'\u001a\u00020(2\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/todolist/ui/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskDao", "Lcom/example/todolist/data/TaskDao;", "preferencesManager", "Lcom/example/todolist/data/PreferencesManager;", "(Lcom/example/todolist/data/TaskDao;Lcom/example/todolist/data/PreferencesManager;)V", "preferencesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/todolist/data/FilterPreferences;", "getPreferencesFlow", "()Lkotlinx/coroutines/flow/Flow;", "searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getSearchQuery", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "taskEvent", "Lcom/example/todolist/ui/tasks/TasksViewModel$TaskEvent;", "getTaskEvent", "taskFlow", "", "Lcom/example/todolist/data/Task;", "tasks", "Landroidx/lifecycle/LiveData;", "getTasks", "()Landroidx/lifecycle/LiveData;", "tasksEventChannel", "Lkotlinx/coroutines/channels/Channel;", "onHideCompletedClick", "Lkotlinx/coroutines/Job;", "hideCompleted", "", "onSortOrderSelecter", "sortOrder", "Lcom/example/todolist/data/SortOrder;", "onTaskCheckedChanged", "task", "isChecked", "onTaskSelected", "", "onTaskSwiped", "onUndoDeleteClick", "TaskEvent", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todolist.data.TaskDao taskDao = null;
    private final com.example.todolist.data.PreferencesManager preferencesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.todolist.data.FilterPreferences> preferencesFlow = null;
    private final kotlinx.coroutines.channels.Channel<com.example.todolist.ui.tasks.TasksViewModel.TaskEvent> tasksEventChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.todolist.ui.tasks.TasksViewModel.TaskEvent> taskEvent = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.Task>> taskFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.Task>> tasks = null;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.TaskDao taskDao, @org.jetbrains.annotations.NotNull()
    com.example.todolist.data.PreferencesManager preferencesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.todolist.data.FilterPreferences> getPreferencesFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.todolist.ui.tasks.TasksViewModel.TaskEvent> getTaskEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onSortOrderSelecter(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.SortOrder sortOrder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onHideCompletedClick(boolean hideCompleted) {
        return null;
    }
    
    public final void onTaskSelected(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.Task task) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onTaskCheckedChanged(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.Task task, boolean isChecked) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onTaskSwiped(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.Task task) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job onUndoDeleteClick(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.Task task) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todolist/ui/tasks/TasksViewModel$TaskEvent;", "", "()V", "ShowUndoDeleteTaskMessage", "Lcom/example/todolist/ui/tasks/TasksViewModel$TaskEvent$ShowUndoDeleteTaskMessage;", "app_debug"})
    public static abstract class TaskEvent {
        
        private TaskEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/todolist/ui/tasks/TasksViewModel$TaskEvent$ShowUndoDeleteTaskMessage;", "Lcom/example/todolist/ui/tasks/TasksViewModel$TaskEvent;", "task", "Lcom/example/todolist/data/Task;", "(Lcom/example/todolist/data/Task;)V", "getTask", "()Lcom/example/todolist/data/Task;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class ShowUndoDeleteTaskMessage extends com.example.todolist.ui.tasks.TasksViewModel.TaskEvent {
            @org.jetbrains.annotations.NotNull()
            private final com.example.todolist.data.Task task = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.todolist.ui.tasks.TasksViewModel.TaskEvent.ShowUndoDeleteTaskMessage copy(@org.jetbrains.annotations.NotNull()
            com.example.todolist.data.Task task) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ShowUndoDeleteTaskMessage(@org.jetbrains.annotations.NotNull()
            com.example.todolist.data.Task task) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.todolist.data.Task component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.todolist.data.Task getTask() {
                return null;
            }
        }
    }
}