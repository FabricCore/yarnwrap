package yarnwrap.entity.mob;
public class WardenBrain { public net.minecraft.entity.mob.WardenBrain wrapperContained; public WardenBrain(net.minecraft.entity.mob.WardenBrain wrapperContained) { this.wrapperContained = wrapperContained; }

// public int EMERGE_DURATION() { return wrapperContained.EMERGE_DURATION; }
// public void EMERGE_DURATION(int value) { wrapperContained.EMERGE_DURATION = value; }
public static int EMERGE_DURATION() { return net.minecraft.entity.mob.WardenBrain.EMERGE_DURATION; }
// public static void EMERGE_DURATION(int value, ) { net.minecraft.entity.mob.WardenBrain.EMERGE_DURATION = value; }

// public int ROAR_DURATION() { return wrapperContained.ROAR_DURATION; }
// public void ROAR_DURATION(int value) { wrapperContained.ROAR_DURATION = value; }
public static int ROAR_DURATION() { return net.minecraft.entity.mob.WardenBrain.ROAR_DURATION; }
// public static void ROAR_DURATION(int value, ) { net.minecraft.entity.mob.WardenBrain.ROAR_DURATION = value; }

// public int DIG_COOLDOWN() { return wrapperContained.DIG_COOLDOWN; }
// public void DIG_COOLDOWN(int value) { wrapperContained.DIG_COOLDOWN = value; }
public static int DIG_COOLDOWN() { return net.minecraft.entity.mob.WardenBrain.DIG_COOLDOWN; }
// public static void DIG_COOLDOWN(int value, ) { net.minecraft.entity.mob.WardenBrain.DIG_COOLDOWN = value; }

// public float STROLL_SPEED() { return wrapperContained.STROLL_SPEED; }
// public void STROLL_SPEED(float value) { wrapperContained.STROLL_SPEED = value; }
// public static float STROLL_SPEED() { return net.minecraft.entity.mob.WardenBrain.STROLL_SPEED; }
// public static void STROLL_SPEED(float value, ) { net.minecraft.entity.mob.WardenBrain.STROLL_SPEED = value; }

// public float CELEBRATE_TIME() { return wrapperContained.CELEBRATE_TIME; }
// public void CELEBRATE_TIME(float value) { wrapperContained.CELEBRATE_TIME = value; }
// public static float CELEBRATE_TIME() { return net.minecraft.entity.mob.WardenBrain.CELEBRATE_TIME; }
// public static void CELEBRATE_TIME(float value, ) { net.minecraft.entity.mob.WardenBrain.CELEBRATE_TIME = value; }

// public float RANGED_APPROACH_SPEED() { return wrapperContained.RANGED_APPROACH_SPEED; }
// public void RANGED_APPROACH_SPEED(float value) { wrapperContained.RANGED_APPROACH_SPEED = value; }
// public static float RANGED_APPROACH_SPEED() { return net.minecraft.entity.mob.WardenBrain.RANGED_APPROACH_SPEED; }
// public static void RANGED_APPROACH_SPEED(float value, ) { net.minecraft.entity.mob.WardenBrain.RANGED_APPROACH_SPEED = value; }

// public int MELEE_ATTACK_INTERVAL() { return wrapperContained.MELEE_ATTACK_INTERVAL; }
// public void MELEE_ATTACK_INTERVAL(int value) { wrapperContained.MELEE_ATTACK_INTERVAL = value; }
// public static int MELEE_ATTACK_INTERVAL() { return net.minecraft.entity.mob.WardenBrain.MELEE_ATTACK_INTERVAL; }
// public static void MELEE_ATTACK_INTERVAL(int value, ) { net.minecraft.entity.mob.WardenBrain.MELEE_ATTACK_INTERVAL = value; }

// public int DIG_DURATION() { return wrapperContained.DIG_DURATION; }
// public void DIG_DURATION(int value) { wrapperContained.DIG_DURATION = value; }
// public static int DIG_DURATION() { return net.minecraft.entity.mob.WardenBrain.DIG_DURATION; }
// public static void DIG_DURATION(int value, ) { net.minecraft.entity.mob.WardenBrain.DIG_DURATION = value; }

// public int SNIFF_DURATION() { return wrapperContained.SNIFF_DURATION; }
// public void SNIFF_DURATION(int value) { wrapperContained.SNIFF_DURATION = value; }
// public static int SNIFF_DURATION() { return net.minecraft.entity.mob.WardenBrain.SNIFF_DURATION; }
// public static void SNIFF_DURATION(int value, ) { net.minecraft.entity.mob.WardenBrain.SNIFF_DURATION = value; }

// public yarnwrap.entity.ai.brain.task.Task RESET_DIG_COOLDOWN_TASK() { return new yarnwrap.entity.ai.brain.task.Task(wrapperContained.RESET_DIG_COOLDOWN_TASK); }
// public void RESET_DIG_COOLDOWN_TASK(yarnwrap.entity.ai.brain.task.Task value) { wrapperContained.RESET_DIG_COOLDOWN_TASK = value.wrapperContained; }
// public static yarnwrap.entity.ai.brain.task.Task RESET_DIG_COOLDOWN_TASK() { return new yarnwrap.entity.ai.brain.task.Task(net.minecraft.entity.mob.WardenBrain.RESET_DIG_COOLDOWN_TASK); }
// public static void RESET_DIG_COOLDOWN_TASK(yarnwrap.entity.ai.brain.task.Task value, ) { net.minecraft.entity.mob.WardenBrain.RESET_DIG_COOLDOWN_TASK = value.wrapperContained; }

// public java.util.List SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(java.util.List value) { wrapperContained.SENSORS = value; }
// public static java.util.List SENSORS() { return net.minecraft.entity.mob.WardenBrain.SENSORS; }
// public static void SENSORS(java.util.List value, ) { net.minecraft.entity.mob.WardenBrain.SENSORS = value; }

// public java.util.List MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(java.util.List value) { wrapperContained.MEMORY_MODULES = value; }
// public static java.util.List MEMORY_MODULES() { return net.minecraft.entity.mob.WardenBrain.MEMORY_MODULES; }
// public static void MEMORY_MODULES(java.util.List value, ) { net.minecraft.entity.mob.WardenBrain.MEMORY_MODULES = value; }

// public void resetDigCooldown(yarnwrap.entity.LivingEntity warden) { wrapperContained.resetDigCooldown(warden.wrapperContained); }
// public static void resetDigCooldown(yarnwrap.entity.LivingEntity warden, ) { net.minecraft.entity.mob.WardenBrain.resetDigCooldown(warden.wrapperContained); }
// public void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addCoreActivities(brain.wrapperContained); }
// public static void addCoreActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addCoreActivities(brain.wrapperContained); }
// public void updateActivities(yarnwrap.entity.mob.WardenEntity warden) { wrapperContained.updateActivities(warden.wrapperContained); }
// public static void updateActivities(yarnwrap.entity.mob.WardenEntity warden, ) { net.minecraft.entity.mob.WardenBrain.updateActivities(warden.wrapperContained); }
// public boolean isTargeting(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.LivingEntity entity) { return wrapperContained.isTargeting(warden.wrapperContained,entity.wrapperContained); }
// public static boolean isTargeting(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.mob.WardenBrain.isTargeting(warden.wrapperContained,entity.wrapperContained); }
// public yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.mob.WardenEntity warden,com.mojang.serialization.Dynamic dynamic) { return new yarnwrap.entity.ai.brain.Brain(wrapperContained.create(warden.wrapperContained,dynamic)); }
// public static yarnwrap.entity.ai.brain.Brain create(yarnwrap.entity.mob.WardenEntity warden,com.mojang.serialization.Dynamic dynamic, ) { return new yarnwrap.entity.ai.brain.Brain(net.minecraft.entity.mob.WardenBrain.create(warden.wrapperContained,dynamic)); }
// public void lookAtDisturbance(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.util.math.BlockPos pos) { wrapperContained.lookAtDisturbance(warden.wrapperContained,pos.wrapperContained); }
// public static void lookAtDisturbance(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.mob.WardenBrain.lookAtDisturbance(warden.wrapperContained,pos.wrapperContained); }
// public boolean method_42232(yarnwrap.entity.LivingEntity entityx) { return wrapperContained.method_42232(entityx.wrapperContained); }
// public static boolean method_42232(yarnwrap.entity.LivingEntity entityx, ) { return net.minecraft.entity.mob.WardenBrain.method_42232(entityx.wrapperContained); }
// public void addEmergeActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addEmergeActivities(brain.wrapperContained); }
// public static void addEmergeActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addEmergeActivities(brain.wrapperContained); }
// public void removeDeadSuspect(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.LivingEntity target) { wrapperContained.removeDeadSuspect(world.wrapperContained,warden.wrapperContained,target.wrapperContained); }
// public static void removeDeadSuspect(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.WardenBrain.removeDeadSuspect(world.wrapperContained,warden.wrapperContained,target.wrapperContained); }
// public void addFightActivities(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addFightActivities(warden.wrapperContained,brain.wrapperContained); }
// public static void addFightActivities(yarnwrap.entity.mob.WardenEntity warden,yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addFightActivities(warden.wrapperContained,brain.wrapperContained); }
// public void addDigActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addDigActivities(brain.wrapperContained); }
// public static void addDigActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addDigActivities(brain.wrapperContained); }
// public void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addIdleActivities(brain.wrapperContained); }
// public static void addIdleActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addIdleActivities(brain.wrapperContained); }
// public boolean method_42241(yarnwrap.entity.mob.WardenEntity entity) { return wrapperContained.method_42241(entity.wrapperContained); }
// public static boolean method_42241(yarnwrap.entity.mob.WardenEntity entity, ) { return net.minecraft.entity.mob.WardenBrain.method_42241(entity.wrapperContained); }
// public void addInvestigateActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addInvestigateActivities(brain.wrapperContained); }
// public static void addInvestigateActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addInvestigateActivities(brain.wrapperContained); }
// public boolean method_42243(yarnwrap.entity.mob.WardenEntity world,yarnwrap.server.world.ServerWorld target) { return wrapperContained.method_42243(world.wrapperContained,target.wrapperContained); }
// public static boolean method_42243(yarnwrap.entity.mob.WardenEntity world,yarnwrap.server.world.ServerWorld target, ) { return net.minecraft.entity.mob.WardenBrain.method_42243(world.wrapperContained,target.wrapperContained); }
// public void addSniffActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addSniffActivities(brain.wrapperContained); }
// public static void addSniffActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addSniffActivities(brain.wrapperContained); }
// public void addRoarActivities(yarnwrap.entity.ai.brain.Brain brain) { wrapperContained.addRoarActivities(brain.wrapperContained); }
// public static void addRoarActivities(yarnwrap.entity.ai.brain.Brain brain, ) { net.minecraft.entity.mob.WardenBrain.addRoarActivities(brain.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_47302(Object context) { return wrapperContained.method_47302(context); }
// public static com.mojang.datafixers.kinds.App method_47302(Object context, ) { return net.minecraft.entity.mob.WardenBrain.method_47302(context); }
// public yarnwrap.entity.ai.brain.task.TaskRunnable method_47303(Object digCooldown) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(wrapperContained.method_47303(digCooldown)); }
// public static yarnwrap.entity.ai.brain.task.TaskRunnable method_47303(Object digCooldown, ) { return new yarnwrap.entity.ai.brain.task.TaskRunnable(net.minecraft.entity.mob.WardenBrain.method_47303(digCooldown)); }
// public boolean method_47304(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time) { return wrapperContained.method_47304(world,entity.wrapperContained,time.wrapperContained); }
// public static boolean method_47304(Object world,yarnwrap.entity.ai.brain.MemoryQueryResult entity,yarnwrap.server.world.ServerWorld time, ) { return net.minecraft.entity.mob.WardenBrain.method_47304(world,entity.wrapperContained,time.wrapperContained); }

}