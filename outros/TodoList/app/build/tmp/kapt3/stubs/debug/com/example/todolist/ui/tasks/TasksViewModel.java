package com.example.todolist.ui.tasks;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.ViewModel;
import com.example.todolist.data.TaskDao;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/todolist/ui/tasks/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskDao", "Lcom/example/todolist/data/TaskDao;", "(Lcom/example/todolist/data/TaskDao;)V", "searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getSearchQuery", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "taskFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/todolist/data/Task;", "tasks", "Landroidx/lifecycle/LiveData;", "getTasks", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.todolist.data.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchQuery = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.todolist.data.Task>> taskFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.Task>> tasks = null;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public TasksViewModel(@org.jetbrains.annotations.NotNull()
    com.example.todolist.data.TaskDao taskDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todolist.data.Task>> getTasks() {
        return null;
    }
}