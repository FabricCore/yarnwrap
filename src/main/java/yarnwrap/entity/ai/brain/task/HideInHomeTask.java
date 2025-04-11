package yarnwrap.entity.ai.brain.task;
public class HideInHomeTask { public net.minecraft.entity.ai.brain.task.HideInHomeTask wrapperContained; public HideInHomeTask(net.minecraft.entity.ai.brain.task.HideInHomeTask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.ai.brain.task.SingleTickTask create(int maxDistance,float walkSpeed,int preferredDistance) { return new yarnwrap.entity.ai.brain.task.SingleTickTask(wrapperContained.create(maxDistance,walkSpeed,preferredDistance)); }
// public com.mojang.datafixers.kinds.App method_46976(int context) { return wrapperContained.method_46976(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_46977(int walkTarget,int home,Object hidingPlace,float path,yarnwrap.entity.ai.brain.MemoryQueryResult lookTarget,yarnwrap.entity.ai.brain.MemoryQueryResult breedTarget,yarnwrap.entity.ai.brain.MemoryQueryResult interactionTarget) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_46977(walkTarget,home,hidingPlace,path,lookTarget.wrapperContained,breedTarget.wrapperContained,interactionTarget.wrapperContained)); }
// public boolean method_46978(int world,int entity,Object time) { return wrapperContained.method_46978(world,entity,time); }
// public boolean method_46980(yarnwrap.entity.LivingEntity pos) { return wrapperContained.method_46980(pos.wrapperContained); }
// public void method_46982(yarnwrap.entity.ai.brain.MemoryQueryResult pos) { wrapperContained.method_46982(pos.wrapperContained); }
// public boolean method_46983(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_46983(pos.wrapperContained); }
// public boolean method_46984(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_46984(poiType.wrapperContained); }
// public boolean method_46985(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_46985(pos.wrapperContained); }
// public boolean method_46986(yarnwrap.registry.entry.RegistryEntry poiType) { return wrapperContained.method_46986(poiType.wrapperContained); }

}