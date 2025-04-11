package yarnwrap.entity.ai.brain.task;
public class GiveInventoryToLookTargetTask { public net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask wrapperContained; public GiveInventoryToLookTargetTask(net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int COMPLETION_RANGE() { return wrapperContained.COMPLETION_RANGE; }
// public void COMPLETION_RANGE(int value) { wrapperContained.COMPLETION_RANGE = value; }
// public int ITEM_PICKUP_COOLDOWN_TICKS() { return wrapperContained.ITEM_PICKUP_COOLDOWN_TICKS; }
// public void ITEM_PICKUP_COOLDOWN_TICKS(int value) { wrapperContained.ITEM_PICKUP_COOLDOWN_TICKS = value; }
// public java.util.function.Function lookTargetFunction() { return wrapperContained.lookTargetFunction; }
// public void lookTargetFunction(java.util.function.Function value) { wrapperContained.lookTargetFunction = value; }
// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public boolean hasItemAndTarget(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasItemAndTarget(entity.wrapperContained); }
// public yarnwrap.util.math.Vec3d offsetTarget(yarnwrap.entity.ai.brain.LookTarget target) { return new yarnwrap.util.math.Vec3d(wrapperContained.offsetTarget(target.wrapperContained)); }
// public void triggerCriterion(yarnwrap.entity.ai.brain.LookTarget target,yarnwrap.item.ItemStack stack,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.triggerCriterion(target.wrapperContained,stack.wrapperContained,player.wrapperContained); }
public void playThrowSound(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Vec3d target) { wrapperContained.playThrowSound(entity.wrapperContained,stack.wrapperContained,target.wrapperContained); }

}