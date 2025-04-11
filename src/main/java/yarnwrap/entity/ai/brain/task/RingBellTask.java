package yarnwrap.entity.ai.brain.task;
public class RingBellTask { public net.minecraft.entity.ai.brain.task.RingBellTask wrapperContained; public RingBellTask(net.minecraft.entity.ai.brain.task.RingBellTask wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_DISTANCE() { return wrapperContained.MAX_DISTANCE; }
// public void MAX_DISTANCE(int value) { wrapperContained.MAX_DISTANCE = value; }
// public float RUN_CHANCE() { return wrapperContained.RUN_CHANCE; }
// public void RUN_CHANCE(float value) { wrapperContained.RUN_CHANCE = value; }
public yarnwrap.entity.ai.brain.task.Task create() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create()); }
// public com.mojang.datafixers.kinds.App method_47045(Object context) { return wrapperContained.method_47045(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47046(Object meetingPoint) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47046(meetingPoint)); }
// public boolean method_47047(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_47047(world,entity.wrapperContained,time.wrapperContained); }

}