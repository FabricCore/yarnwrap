package yarnwrap.entity.ai.brain.task;
public class BreezeSlideTowardsTargetTask { public net.minecraft.entity.ai.brain.task.BreezeSlideTowardsTargetTask wrapperContained; public BreezeSlideTowardsTargetTask(net.minecraft.entity.ai.brain.task.BreezeSlideTowardsTargetTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d getRandomPosInMediumRange(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRandomPosInMediumRange(breeze.wrapperContained,target.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getRandomPosInMediumRange(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.brain.task.BreezeSlideTowardsTargetTask.getRandomPosInMediumRange(breeze.wrapperContained,target.wrapperContained)); }

}