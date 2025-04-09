package yarnwrap.entity.mob;
public class ZoglinEntity { public net.minecraft.entity.mob.ZoglinEntity wrapperContained; public ZoglinEntity(net.minecraft.entity.mob.ZoglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList USED_SENSORS() { return wrapperContained.USED_SENSORS; }
// public int movementCooldownTicks() { return wrapperContained.movementCooldownTicks; }
// public com.google.common.collect.ImmutableList USED_MEMORY_MODULES() { return wrapperContained.USED_MEMORY_MODULES; }
// public yarnwrap.entity.data.TrackedData BABY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BABY); }
// public float DEFAULT_KNOCKBACK_RESISTANCE() { return wrapperContained.DEFAULT_KNOCKBACK_RESISTANCE; }
// public int DEFAULT_ATTACK_DAMAGE() { return wrapperContained.DEFAULT_ATTACK_DAMAGE; }
// public float BABY_ATTACK_DAMAGE() { return wrapperContained.BABY_ATTACK_DAMAGE; }
// public int ADULT_MELEE_ATTACK_COOLDOWN() { return wrapperContained.ADULT_MELEE_ATTACK_COOLDOWN; }
// public int BABY_MELEE_ATTACK_COOLDOWN() { return wrapperContained.BABY_MELEE_ATTACK_COOLDOWN; }
// public int ATTACK_TARGET_DURATION() { return wrapperContained.ATTACK_TARGET_DURATION; }
// public float DEFAULT_MOVEMENT_SPEED() { return wrapperContained.DEFAULT_MOVEMENT_SPEED; }
// public void addCoreTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreTasks(brain.wrapperContained); }
// public void addIdleTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleTasks(brain.wrapperContained); }
// public void addFightTasks(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addFightTasks(brain.wrapperContained); }
// public void tickBrain() { wrapperContained.tickBrain(); }
// public void playAngrySound() { wrapperContained.playAngrySound(); }
// public java.util.Optional getHoglinTarget() { return wrapperContained.getHoglinTarget(); }
// public boolean shouldAttack(yarnwrap.entity.LivingEntity entity) { return wrapperContained.shouldAttack(entity.wrapperContained); }
public Object createZoglinAttributes() { return wrapperContained.createZoglinAttributes(); }
// public void setAttackTarget(yarnwrap.entity.LivingEntity entity) { wrapperContained.setAttackTarget(entity.wrapperContained); }
public boolean isAdult() { return wrapperContained.isAdult(); }

}