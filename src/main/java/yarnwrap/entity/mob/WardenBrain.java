package yarnwrap.entity.mob;
public class WardenBrain { public net.minecraft.entity.mob.WardenBrain wrapperContained; public WardenBrain(net.minecraft.entity.mob.WardenBrain wrapperContained) { this.wrapperContained = wrapperContained; }

public int EMERGE_DURATION() { return wrapperContained.EMERGE_DURATION; }
// public void EMERGE_DURATION(int value) { wrapperContained.EMERGE_DURATION = value; }
public int ROAR_DURATION() { return wrapperContained.ROAR_DURATION; }
// public void ROAR_DURATION(int value) { wrapperContained.ROAR_DURATION = value; }
public int DIG_COOLDOWN() { return wrapperContained.DIG_COOLDOWN; }
// public void DIG_COOLDOWN(int value) { wrapperContained.DIG_COOLDOWN = value; }
// public float STROLL_SPEED() { return wrapperContained.STROLL_SPEED; }
// public void STROLL_SPEED(float value) { wrapperContained.STROLL_SPEED = value; }
// public float CELEBRATE_TIME() { return wrapperContained.CELEBRATE_TIME; }
// public void CELEBRATE_TIME(float value) { wrapperContained.CELEBRATE_TIME = value; }
// public float RANGED_APPROACH_SPEED() { return wrapperContained.RANGED_APPROACH_SPEED; }
// public void RANGED_APPROACH_SPEED(float value) { wrapperContained.RANGED_APPROACH_SPEED = value; }
// public int MELEE_ATTACK_INTERVAL() { return wrapperContained.MELEE_ATTACK_INTERVAL; }
// public void MELEE_ATTACK_INTERVAL(int value) { wrapperContained.MELEE_ATTACK_INTERVAL = value; }
// public int DIG_DURATION() { return wrapperContained.DIG_DURATION; }
// public void DIG_DURATION(int value) { wrapperContained.DIG_DURATION = value; }
// public int SNIFF_DURATION() { return wrapperContained.SNIFF_DURATION; }
// public void SNIFF_DURATION(int value) { wrapperContained.SNIFF_DURATION = value; }
// public yarnwrap.entity.ai.brain.task.Task RESET_DIG_COOLDOWN_TASK() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.RESET_DIG_COOLDOWN_TASK); }
// public void RESET_DIG_COOLDOWN_TASK(yarnwrap.entity.ai.brain.task.Task value) { wrapperContained.RESET_DIG_COOLDOWN_TASK = value.wrapperContained; }
// public java.util.List SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(java.util.List value) { wrapperContained.SENSORS = value; }
// public java.util.List MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(java.util.List value) { wrapperContained.MEMORY_MODULES = value; }
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