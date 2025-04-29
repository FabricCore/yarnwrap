package yarnwrap.entity.ai.brain.task;
public class PlayDeadTimerTask { public net.minecraft.entity.ai.brain.task.PlayDeadTimerTask wrapperContained; public PlayDeadTimerTask(net.minecraft.entity.ai.brain.task.PlayDeadTimerTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
public static yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.ai.brain.task.PlayDeadTimerTask.create()); }
// public com.mojang.datafixers.kinds.App method_47269(Object context) { return wrapperContained.method_47269(context); }
// public static com.mojang.datafixers.kinds.App method_47269(Object context, ) { return net.minecraft.entity.ai.brain.task.PlayDeadTimerTask.method_47269(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47270(Object playDeadTicks,yarnwrap.entity.ai.brain.MemoryQueryResult hurtByEntity) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47270(playDeadTicks,hurtByEntity.wrapperContained)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47270(Object playDeadTicks,yarnwrap.entity.ai.brain.MemoryQueryResult hurtByEntity, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.ai.brain.task.PlayDeadTimerTask.method_47270(playDeadTicks,hurtByEntity.wrapperContained)); }
// public boolean method_47271(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time) { return wrapperContained.method_47271(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47271(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.entity.ai.brain.MemoryQueryResult time, ) { return net.minecraft.entity.ai.brain.task.PlayDeadTimerTask.method_47271(world,entity.wrapperContained,time.wrapperContained); }

}