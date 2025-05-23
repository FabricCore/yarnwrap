package yarnwrap.entity.mob;
public class PatrolEntity { public net.minecraft.entity.mob.PatrolEntity wrapperContained; public PatrolEntity(net.minecraft.entity.mob.PatrolEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean patrolling() { return wrapperContained.patrolling; }
// public void patrolling(boolean value) { wrapperContained.patrolling = value; }
// public static boolean patrolling() { return net.minecraft.entity.mob.PatrolEntity.patrolling; }
// public static void patrolling(boolean value, ) { net.minecraft.entity.mob.PatrolEntity.patrolling = value; }

// public yarnwrap.util.math.BlockPos patrolTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.patrolTarget); }
// public void patrolTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.patrolTarget = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos patrolTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.PatrolEntity.patrolTarget); }
// public static void patrolTarget(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.mob.PatrolEntity.patrolTarget = value.wrapperContained; }

// public boolean patrolLeader() { return wrapperContained.patrolLeader; }
// public void patrolLeader(boolean value) { wrapperContained.patrolLeader = value; }
// public static boolean patrolLeader() { return net.minecraft.entity.mob.PatrolEntity.patrolLeader; }
// public static void patrolLeader(boolean value, ) { net.minecraft.entity.mob.PatrolEntity.patrolLeader = value; }

// public boolean DEFAULT_PATROL_LEADER() { return wrapperContained.DEFAULT_PATROL_LEADER; }
// public void DEFAULT_PATROL_LEADER(boolean value) { wrapperContained.DEFAULT_PATROL_LEADER = value; }
// public static boolean DEFAULT_PATROL_LEADER() { return net.minecraft.entity.mob.PatrolEntity.DEFAULT_PATROL_LEADER; }
// public static void DEFAULT_PATROL_LEADER(boolean value, ) { net.minecraft.entity.mob.PatrolEntity.DEFAULT_PATROL_LEADER = value; }

// public boolean DEFAULT_PATROLLING() { return wrapperContained.DEFAULT_PATROLLING; }
// public void DEFAULT_PATROLLING(boolean value) { wrapperContained.DEFAULT_PATROLLING = value; }
// public static boolean DEFAULT_PATROLLING() { return net.minecraft.entity.mob.PatrolEntity.DEFAULT_PATROLLING; }
// public static void DEFAULT_PATROLLING(boolean value, ) { net.minecraft.entity.mob.PatrolEntity.DEFAULT_PATROLLING = value; }

public yarnwrap.util.math.BlockPos getPatrolTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPatrolTarget()); }
// public static yarnwrap.util.math.BlockPos getPatrolTarget() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.mob.PatrolEntity.getPatrolTarget()); }
public void setPatrolTarget(yarnwrap.util.math.BlockPos targetPos) { wrapperContained.setPatrolTarget(targetPos.wrapperContained); }
// public static void setPatrolTarget(yarnwrap.util.math.BlockPos targetPos, ) { net.minecraft.entity.mob.PatrolEntity.setPatrolTarget(targetPos.wrapperContained); }
public void setPatrolLeader(boolean patrolLeader) { wrapperContained.setPatrolLeader(patrolLeader); }
// public static void setPatrolLeader(boolean patrolLeader, ) { net.minecraft.entity.mob.PatrolEntity.setPatrolLeader(patrolLeader); }
public void setRandomPatrolTarget() { wrapperContained.setRandomPatrolTarget(); }
// public static void setRandomPatrolTarget() { net.minecraft.entity.mob.PatrolEntity.setRandomPatrolTarget(); }
public boolean isPatrolLeader() { return wrapperContained.isPatrolLeader(); }
// public static boolean isPatrolLeader() { return net.minecraft.entity.mob.PatrolEntity.isPatrolLeader(); }
public boolean hasPatrolTarget() { return wrapperContained.hasPatrolTarget(); }
// public static boolean hasPatrolTarget() { return net.minecraft.entity.mob.PatrolEntity.hasPatrolTarget(); }
public boolean hasNoRaid() { return wrapperContained.hasNoRaid(); }
// public static boolean hasNoRaid() { return net.minecraft.entity.mob.PatrolEntity.hasNoRaid(); }
public boolean canLead() { return wrapperContained.canLead(); }
// public static boolean canLead() { return net.minecraft.entity.mob.PatrolEntity.canLead(); }
// public boolean isRaidCenterSet() { return wrapperContained.isRaidCenterSet(); }
// public static boolean isRaidCenterSet() { return net.minecraft.entity.mob.PatrolEntity.isRaidCenterSet(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.PatrolEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void setPatrolling(boolean patrolling) { wrapperContained.setPatrolling(patrolling); }
// public static void setPatrolling(boolean patrolling, ) { net.minecraft.entity.mob.PatrolEntity.setPatrolling(patrolling); }

}