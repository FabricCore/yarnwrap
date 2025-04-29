package yarnwrap.entity.ai.goal;
public class SkeletonHorseTrapTriggerGoal { public net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal wrapperContained; public SkeletonHorseTrapTriggerGoal(net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.SkeletonHorseEntity skeletonHorse() { return new yarnwrap.entity.mob.SkeletonHorseEntity(wrapperContained.skeletonHorse); }
// public void skeletonHorse(yarnwrap.entity.mob.SkeletonHorseEntity value) { wrapperContained.skeletonHorse = value.wrapperContained; }
// public static yarnwrap.entity.mob.SkeletonHorseEntity skeletonHorse() { return new yarnwrap.entity.mob.SkeletonHorseEntity(net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal.skeletonHorse); }
// public static void skeletonHorse(yarnwrap.entity.mob.SkeletonHorseEntity value, ) { net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal.skeletonHorse = value.wrapperContained; }

public SkeletonHorseTrapTriggerGoal(yarnwrap.entity.mob.SkeletonHorseEntity skeletonHorse) { this.wrapperContained = new net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal(skeletonHorse.wrapperContained); }
// public void enchantEquipment(yarnwrap.entity.mob.SkeletonEntity rider,yarnwrap.entity.EquipmentSlot slot,yarnwrap.world.LocalDifficulty localDifficulty) { wrapperContained.enchantEquipment(rider.wrapperContained,slot.wrapperContained,localDifficulty.wrapperContained); }
// public static void enchantEquipment(yarnwrap.entity.mob.SkeletonEntity rider,yarnwrap.entity.EquipmentSlot slot,yarnwrap.world.LocalDifficulty localDifficulty, ) { net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal.enchantEquipment(rider.wrapperContained,slot.wrapperContained,localDifficulty.wrapperContained); }
// public yarnwrap.entity.passive.AbstractHorseEntity getHorse(yarnwrap.world.LocalDifficulty localDifficulty) { return new yarnwrap.entity.passive.AbstractHorseEntity(wrapperContained.getHorse(localDifficulty.wrapperContained)); }
// public static yarnwrap.entity.passive.AbstractHorseEntity getHorse(yarnwrap.world.LocalDifficulty localDifficulty, ) { return new yarnwrap.entity.passive.AbstractHorseEntity(net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal.getHorse(localDifficulty.wrapperContained)); }
// public yarnwrap.entity.mob.SkeletonEntity getSkeleton(yarnwrap.world.LocalDifficulty localDifficulty,yarnwrap.entity.passive.AbstractHorseEntity vehicle) { return new yarnwrap.entity.mob.SkeletonEntity(wrapperContained.getSkeleton(localDifficulty.wrapperContained,vehicle.wrapperContained)); }
// public static yarnwrap.entity.mob.SkeletonEntity getSkeleton(yarnwrap.world.LocalDifficulty localDifficulty,yarnwrap.entity.passive.AbstractHorseEntity vehicle, ) { return new yarnwrap.entity.mob.SkeletonEntity(net.minecraft.entity.ai.goal.SkeletonHorseTrapTriggerGoal.getSkeleton(localDifficulty.wrapperContained,vehicle.wrapperContained)); }

}