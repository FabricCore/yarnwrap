package yarnwrap.entity.mob;
public class PatrolEntity { public net.minecraft.entity.mob.PatrolEntity wrapperContained; public PatrolEntity(net.minecraft.entity.mob.PatrolEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean patrolling() { return wrapperContained.patrolling; }
// public void patrolling(boolean value) { wrapperContained.patrolling = value; }
// public yarnwrap.util.math.BlockPos patrolTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.patrolTarget); }
// public void patrolTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.patrolTarget = value.wrapperContained; }
// public boolean patrolLeader() { return wrapperContained.patrolLeader; }
// public void patrolLeader(boolean value) { wrapperContained.patrolLeader = value; }
public yarnwrap.util.math.BlockPos getPatrolTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPatrolTarget()); }
public void setPatrolTarget(yarnwrap.util.math.BlockPos targetPos) { wrapperContained.setPatrolTarget(targetPos.wrapperContained); }
public void setPatrolLeader(boolean patrolLeader) { wrapperContained.setPatrolLeader(patrolLeader); }
public void setRandomPatrolTarget() { wrapperContained.setRandomPatrolTarget(); }
public boolean isPatrolLeader() { return wrapperContained.isPatrolLeader(); }
public boolean hasPatrolTarget() { return wrapperContained.hasPatrolTarget(); }
public boolean hasNoRaid() { return wrapperContained.hasNoRaid(); }
public boolean canLead() { return wrapperContained.canLead(); }
// public boolean isRaidCenterSet() { return wrapperContained.isRaidCenterSet(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void setPatrolling(boolean patrolling) { wrapperContained.setPatrolling(patrolling); }
// public void method_57005(yarnwrap.util.math.BlockPos patrolTarget) { wrapperContained.method_57005(patrolTarget.wrapperContained); }

}