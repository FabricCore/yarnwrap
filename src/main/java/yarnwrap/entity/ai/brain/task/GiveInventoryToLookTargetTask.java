package yarnwrap.entity.ai.brain.task;
public class GiveInventoryToLookTargetTask { public net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask wrapperContained; public GiveInventoryToLookTargetTask(net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int COMPLETION_RANGE() { return wrapperContained.COMPLETION_RANGE; }
// public void COMPLETION_RANGE(int value) { wrapperContained.COMPLETION_RANGE = value; }
// public static int COMPLETION_RANGE() { return net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.COMPLETION_RANGE; }
// public static void COMPLETION_RANGE(int value, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.COMPLETION_RANGE = value; }

// public int ITEM_PICKUP_COOLDOWN_TICKS() { return wrapperContained.ITEM_PICKUP_COOLDOWN_TICKS; }
// public void ITEM_PICKUP_COOLDOWN_TICKS(int value) { wrapperContained.ITEM_PICKUP_COOLDOWN_TICKS = value; }
// public static int ITEM_PICKUP_COOLDOWN_TICKS() { return net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.ITEM_PICKUP_COOLDOWN_TICKS; }
// public static void ITEM_PICKUP_COOLDOWN_TICKS(int value, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.ITEM_PICKUP_COOLDOWN_TICKS = value; }

// public java.util.function.Function lookTargetFunction() { return wrapperContained.lookTargetFunction; }
// public void lookTargetFunction(java.util.function.Function value) { wrapperContained.lookTargetFunction = value; }
// public static java.util.function.Function lookTargetFunction() { return net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.lookTargetFunction; }
// public static void lookTargetFunction(java.util.function.Function value, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.lookTargetFunction = value; }

// public float speed() { return wrapperContained.speed; }
// public void speed(float value) { wrapperContained.speed = value; }
// public static float speed() { return net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.speed; }
// public static void speed(float value, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.speed = value; }

public GiveInventoryToLookTargetTask(java.util.function.Function lookTargetFunction,float speed,int runTime) { this.wrapperContained = new net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask(lookTargetFunction,speed,runTime); }
// public boolean hasItemAndTarget(yarnwrap.entity.LivingEntity entity) { return wrapperContained.hasItemAndTarget(entity.wrapperContained); }
// public static boolean hasItemAndTarget(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.hasItemAndTarget(entity.wrapperContained); }
// public void method_42650(yarnwrap.entity.LivingEntity target) { wrapperContained.method_42650(target.wrapperContained); }
// public static void method_42650(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.method_42650(target.wrapperContained); }
// public yarnwrap.util.math.Vec3d offsetTarget(yarnwrap.entity.ai.brain.LookTarget target) { return new yarnwrap.util.math.Vec3d(wrapperContained.offsetTarget(target.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d offsetTarget(yarnwrap.entity.ai.brain.LookTarget target, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.offsetTarget(target.wrapperContained)); }
// public void triggerCriterion(yarnwrap.entity.ai.brain.LookTarget target,yarnwrap.item.ItemStack stack,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.triggerCriterion(target.wrapperContained,stack.wrapperContained,player.wrapperContained); }
// public static void triggerCriterion(yarnwrap.entity.ai.brain.LookTarget target,yarnwrap.item.ItemStack stack,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.triggerCriterion(target.wrapperContained,stack.wrapperContained,player.wrapperContained); }
// public void method_43080(yarnwrap.entity.ai.brain.LookTarget player) { wrapperContained.method_43080(player.wrapperContained); }
// public static void method_43080(yarnwrap.entity.ai.brain.LookTarget player, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.method_43080(player.wrapperContained); }
// public void playThrowSound(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Vec3d target) { wrapperContained.playThrowSound(entity.wrapperContained,stack.wrapperContained,target.wrapperContained); }
// public static void playThrowSound(yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Vec3d target, ) { net.minecraft.entity.ai.brain.task.GiveInventoryToLookTargetTask.playThrowSound(entity.wrapperContained,stack.wrapperContained,target.wrapperContained); }

}