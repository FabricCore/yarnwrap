package yarnwrap.entity.ai.brain.task;
public class LayFrogSpawnTask { public net.minecraft.entity.ai.brain.task.LayFrogSpawnTask wrapperContained; public LayFrogSpawnTask(net.minecraft.entity.ai.brain.task.LayFrogSpawnTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.block.Block frogSpawn) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(frogSpawn.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_47181(yarnwrap.block.Block context) { return wrapperContained.method_47181(context.wrapperContained); }
// public boolean method_47182(yarnwrap.block.Block world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_47182(world.wrapperContained,entity.wrapperContained,time.wrapperContained); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47183(yarnwrap.block.Block attackTarget,yarnwrap.entity.ai.brain.MemoryQueryResult walkTarget,yarnwrap.entity.ai.brain.MemoryQueryResult isPregnant) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47183(attackTarget.wrapperContained,walkTarget.wrapperContained,isPregnant.wrapperContained)); }

}