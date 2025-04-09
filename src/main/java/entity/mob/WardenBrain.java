package yarnwrap.entity.mob;
public class WardenBrain { public net.minecraft.entity.mob.WardenBrain wrapperContained; public WardenBrain(net.minecraft.entity.mob.WardenBrain wrapperContained) { this.wrapperContained = wrapperContained; }

public int EMERGE_DURATION() { return wrapperContained.EMERGE_DURATION; }
public int ROAR_DURATION() { return wrapperContained.ROAR_DURATION; }
public int DIG_COOLDOWN() { return wrapperContained.DIG_COOLDOWN; }
// public float STROLL_SPEED() { return wrapperContained.STROLL_SPEED; }
// public float CELEBRATE_TIME() { return wrapperContained.CELEBRATE_TIME; }
// public float RANGED_APPROACH_SPEED() { return wrapperContained.RANGED_APPROACH_SPEED; }
// public int MELEE_ATTACK_INTERVAL() { return wrapperContained.MELEE_ATTACK_INTERVAL; }
// public int DIG_DURATION() { return wrapperContained.DIG_DURATION; }
// public int SNIFF_DURATION() { return wrapperContained.SNIFF_DURATION; }
// public yarnwrap.entity.ai.brain.task.Task RESET_DIG_COOLDOWN_TASK() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.RESET_DIG_COOLDOWN_TASK); }
// public java.util.List SENSORS() { return wrapperContained.SENSORS; }
// public java.util.List MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
public void resetDigCooldown(yarnwrap.entity.LivingEntity warden) { wrapperContained.resetDigCooldown(warden.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
public void updateActivities(yarnwrap.entity.mob.WardenEntity warden) { wrapperContained.updateActivities(warden.wrapperContained); }
// public boolean isTargeting(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isTargeting(warden.wrapperContained,entity.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.mob.WardenEntity warden,com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(warden.wrapperContained,dynamic)); }
public void lookAtDisturbance(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.util.math.BlockPos pos) { wrapperContained.lookAtDisturbance(warden.wrapperContained,pos.wrapperContained); }
// public void addEmergeActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addEmergeActivities(brain.wrapperContained); }
// public void removeDeadSuspect(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.LivingEntity suspect) { wrapperContained.removeDeadSuspect(warden.wrapperContained,suspect.wrapperContained); }
// public void addFightActivities(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addFightActivities(warden.wrapperContained,brain.wrapperContained); }
// public void addDigActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addDigActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public void addInvestigateActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addInvestigateActivities(brain.wrapperContained); }
// public void addSniffActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addSniffActivities(brain.wrapperContained); }
// public void addRoarActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addRoarActivities(brain.wrapperContained); }

}