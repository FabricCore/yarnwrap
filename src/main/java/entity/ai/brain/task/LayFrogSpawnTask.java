package yarnwrap.entity.ai.brain.task;
public class LayFrogSpawnTask { public net.minecraft.entity.ai.brain.task.LayFrogSpawnTask wrapperContained; public LayFrogSpawnTask(net.minecraft.entity.ai.brain.task.LayFrogSpawnTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.Task create(yarnwrap.block.Block frogSpawn) { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.create(frogSpawn.wrapperContained)); }

}