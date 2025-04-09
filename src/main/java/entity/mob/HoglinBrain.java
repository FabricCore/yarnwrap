package yarnwrap.entity.mob;
public class HoglinBrain { public net.minecraft.entity.mob.HoglinBrain wrapperContained; public HoglinBrain(net.minecraft.entity.mob.HoglinBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.UniformIntProvider AVOID_MEMORY_DURATION() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.AVOID_MEMORY_DURATION); }
// public yarnwrap.util.math.intprovider.UniformIntProvider WALK_TOWARD_CLOSEST_ADULT_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.WALK_TOWARD_CLOSEST_ADULT_RANGE); }
// public int ADULT_MELEE_ATTACK_COOLDOWN() { return wrapperContained.ADULT_MELEE_ATTACK_COOLDOWN; }
// public int BABY_MELEE_ATTACK_COOLDOWN() { return wrapperContained.BABY_MELEE_ATTACK_COOLDOWN; }
// public float AVOID_TARGET_SPEED() { return wrapperContained.AVOID_TARGET_SPEED; }
// public yarnwrap.entity.ai.brain.task.RandomTask makeRandomWalkTask() { return new yarnwrap.entity.ai.brain.task.RandomTask(wrapperContained.makeRandomWalkTask()); }
// public void refreshActivities(yarnwrap.entity.mob.HoglinEntity hoglin) { wrapperContained.refreshActivities(hoglin.wrapperContained); }
// public void onAttacking(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.onAttacking(hoglin.wrapperContained,target.wrapperContained); }
// public void addCoreTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreTasks(brain.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.ai.brain.Brain brain) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(brain.wrapperContained)); }
// public boolean isWarpedFungusAround(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isWarpedFungusAround(hoglin.wrapperContained,pos.wrapperContained); }
// public void onAttacked(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity attacker) { wrapperContained.onAttacked(hoglin.wrapperContained,attacker.wrapperContained); }
// public void addIdleTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleTasks(brain.wrapperContained); }
// public void askAdultsToAvoid(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.askAdultsToAvoid(hoglin.wrapperContained,target.wrapperContained); }
// public void addFightTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addFightTasks(brain.wrapperContained); }
// public boolean isNearPlayer(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.isNearPlayer(hoglin.wrapperContained); }
// public void avoidEnemy(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.avoidEnemy(hoglin.wrapperContained,target.wrapperContained); }
// public void addAvoidTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addAvoidTasks(brain.wrapperContained); }
// public void avoid(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.avoid(hoglin.wrapperContained,target.wrapperContained); }
// public void targetEnemy(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.targetEnemy(hoglin.wrapperContained,target.wrapperContained); }
// public java.util.Optional getNearestVisibleTargetablePlayer(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.getNearestVisibleTargetablePlayer(hoglin.wrapperContained); }
// public void setAttackTarget(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.setAttackTarget(hoglin.wrapperContained,target.wrapperContained); }
// public boolean hasMoreHoglinsAround(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.hasMoreHoglinsAround(hoglin.wrapperContained); }
// public void askAdultsForHelp(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity target) { wrapperContained.askAdultsForHelp(hoglin.wrapperContained,target.wrapperContained); }
// public void setAttackTargetIfCloser(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.LivingEntity targetCandidate) { wrapperContained.setAttackTargetIfCloser(hoglin.wrapperContained,targetCandidate.wrapperContained); }
// public java.util.List getAdultHoglinsAround(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.getAdultHoglinsAround(hoglin.wrapperContained); }
// public boolean hasBreedTarget(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.hasBreedTarget(hoglin.wrapperContained); }
// public boolean isLoneAdult(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.isLoneAdult(hoglin.wrapperContained); }
// public yarnwrap.sound.SoundEvent getSoundEvent(yarnwrap.entity.mob.HoglinEntity hoglin,yarnwrap.entity.ai.brain.Activity activity) { return new yarnwrap.sound.SoundEvent(wrapperContained.getSoundEvent(hoglin.wrapperContained,activity.wrapperContained)); }
public java.util.Optional getSoundEvent(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.getSoundEvent(hoglin.wrapperContained); }
// public boolean hasNearestRepellent(yarnwrap.entity.mob.HoglinEntity hoglin) { return wrapperContained.hasNearestRepellent(hoglin.wrapperContained); }

}