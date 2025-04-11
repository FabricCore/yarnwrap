package yarnwrap.entity.ai.pathing;
public class EntityNavigation { public net.minecraft.entity.ai.pathing.EntityNavigation wrapperContained; public EntityNavigation(net.minecraft.entity.ai.pathing.EntityNavigation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos currentTarget() { return new yarnwrap.util.math.BlockPos(wrapperContained.currentTarget); }
// public void currentTarget(yarnwrap.util.math.BlockPos value) { wrapperContained.currentTarget = value.wrapperContained; }
// public int currentDistance() { return wrapperContained.currentDistance; }
// public void currentDistance(int value) { wrapperContained.currentDistance = value; }
// public float rangeMultiplier() { return wrapperContained.rangeMultiplier; }
// public void rangeMultiplier(float value) { wrapperContained.rangeMultiplier = value; }
// public boolean nearPathStartPos() { return wrapperContained.nearPathStartPos; }
// public void nearPathStartPos(boolean value) { wrapperContained.nearPathStartPos = value; }
// public int RECALCULATE_COOLDOWN() { return wrapperContained.RECALCULATE_COOLDOWN; }
// public void RECALCULATE_COOLDOWN(int value) { wrapperContained.RECALCULATE_COOLDOWN = value; }
// public double speed() { return wrapperContained.speed; }
// public void speed(double value) { wrapperContained.speed = value; }
// public long lastActiveTickMs() { return wrapperContained.lastActiveTickMs; }
// public void lastActiveTickMs(long value) { wrapperContained.lastActiveTickMs = value; }
// public long currentNodeMs() { return wrapperContained.currentNodeMs; }
// public void currentNodeMs(long value) { wrapperContained.currentNodeMs = value; }
// public yarnwrap.util.math.Vec3d pathStartPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pathStartPos); }
// public void pathStartPos(yarnwrap.util.math.Vec3d value) { wrapperContained.pathStartPos = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.PathNodeNavigator pathNodeNavigator() { return new yarnwrap.entity.ai.pathing.PathNodeNavigator(wrapperContained.pathNodeNavigator); }
// public void pathNodeNavigator(yarnwrap.entity.ai.pathing.PathNodeNavigator value) { wrapperContained.pathNodeNavigator = value.wrapperContained; }
// public int pathStartTime() { return wrapperContained.pathStartTime; }
// public void pathStartTime(int value) { wrapperContained.pathStartTime = value; }
// public int tickCount() { return wrapperContained.tickCount; }
// public void tickCount(int value) { wrapperContained.tickCount = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.PathNodeMaker nodeMaker() { return new yarnwrap.entity.ai.pathing.PathNodeMaker(wrapperContained.nodeMaker); }
// public void nodeMaker(yarnwrap.entity.ai.pathing.PathNodeMaker value) { wrapperContained.nodeMaker = value.wrapperContained; }
// public boolean inRecalculationCooldown() { return wrapperContained.inRecalculationCooldown; }
// public void inRecalculationCooldown(boolean value) { wrapperContained.inRecalculationCooldown = value; }
// public yarnwrap.util.math.Vec3i lastNodePosition() { return new yarnwrap.util.math.Vec3i(wrapperContained.lastNodePosition); }
// public void lastNodePosition(yarnwrap.util.math.Vec3i value) { wrapperContained.lastNodePosition = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.Path currentPath() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.currentPath); }
// public void currentPath(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.currentPath = value.wrapperContained; }
// public double currentNodeTimeout() { return wrapperContained.currentNodeTimeout; }
// public void currentNodeTimeout(double value) { wrapperContained.currentNodeTimeout = value; }
// public float nodeReachProximity() { return wrapperContained.nodeReachProximity; }
// public void nodeReachProximity(float value) { wrapperContained.nodeReachProximity = value; }
// public yarnwrap.entity.mob.MobEntity entity() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.mob.MobEntity value) { wrapperContained.entity = value.wrapperContained; }
// public long lastRecalculateTime() { return wrapperContained.lastRecalculateTime; }
// public void lastRecalculateTime(long value) { wrapperContained.lastRecalculateTime = value; }
public boolean shouldRecalculatePath(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldRecalculatePath(pos.wrapperContained); }
// public yarnwrap.entity.ai.pathing.Path findPathToAny(java.util.Set positions,int range,boolean useHeadPos,int distance,float followRange) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathToAny(positions,range,useHeadPos,distance,followRange)); }
public yarnwrap.entity.ai.pathing.Path findPathToAny(java.util.stream.Stream positions,int distance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathToAny(positions,distance)); }
public void setRangeMultiplier(float rangeMultiplier) { wrapperContained.setRangeMultiplier(rangeMultiplier); }
public void resetRangeMultiplier() { wrapperContained.resetRangeMultiplier(); }
public boolean isFollowingPath() { return wrapperContained.isFollowingPath(); }
// public void resetNode() { wrapperContained.resetNode(); }
// public boolean shouldJumpToNextNode(yarnwrap.util.math.Vec3d currentPos) { return wrapperContained.shouldJumpToNextNode(currentPos.wrapperContained); }
public yarnwrap.entity.ai.pathing.Path findPathTo(java.util.Set positions,int distance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathTo(positions,distance)); }
// public void resetNodeAndStop() { wrapperContained.resetNodeAndStop(); }
public boolean isNearPathStartPos() { return wrapperContained.isNearPathStartPos(); }
public yarnwrap.entity.ai.pathing.Path findPathTo(yarnwrap.util.math.BlockPos target,int minDistance,int maxDistance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathTo(target.wrapperContained,minDistance,maxDistance)); }
// public yarnwrap.entity.ai.pathing.Path findPathTo(java.util.Set positions,int range,boolean useHeadPos,int distance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathTo(positions,range,useHeadPos,distance)); }
public float getNodeReachProximity() { return wrapperContained.getNodeReachProximity(); }
// public double adjustTargetY(yarnwrap.util.math.Vec3d pos) { return wrapperContained.adjustTargetY(pos.wrapperContained); }
// public boolean doesNotCollide(yarnwrap.entity.mob.MobEntity entity,yarnwrap.util.math.Vec3d startPos,yarnwrap.util.math.Vec3d entityPos,boolean includeFluids) { return wrapperContained.doesNotCollide(entity.wrapperContained,startPos.wrapperContained,entityPos.wrapperContained,includeFluids); }
public boolean canJumpToNext(yarnwrap.entity.ai.pathing.PathNodeType nodeType) { return wrapperContained.canJumpToNext(nodeType.wrapperContained); }
public boolean startMovingTo(double x,double y,double z,int distance,double speed) { return wrapperContained.startMovingTo(x,y,z,distance,speed); }
public boolean isValidPosition(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isValidPosition(pos.wrapperContained); }
public boolean startMovingAlong(yarnwrap.entity.ai.pathing.Path path,double speed) { return wrapperContained.startMovingAlong(path.wrapperContained,speed); }
public boolean startMovingTo(yarnwrap.entity.Entity entity,double speed) { return wrapperContained.startMovingTo(entity.wrapperContained,speed); }
// public yarnwrap.entity.ai.pathing.PathNodeNavigator createPathNodeNavigator(int range) { return new yarnwrap.entity.ai.pathing.PathNodeNavigator(wrapperContained.createPathNodeNavigator(range)); }
public boolean startMovingTo(double x,double y,double z,double speed) { return wrapperContained.startMovingTo(x,y,z,speed); }
// public void continueFollowingPath() { wrapperContained.continueFollowingPath(); }
public void stop() { wrapperContained.stop(); }
// public boolean canPathDirectlyThrough(yarnwrap.util.math.Vec3d origin,yarnwrap.util.math.Vec3d target) { return wrapperContained.canPathDirectlyThrough(origin.wrapperContained,target.wrapperContained); }
public yarnwrap.entity.ai.pathing.PathNodeMaker getNodeMaker() { return new yarnwrap.entity.ai.pathing.PathNodeMaker(wrapperContained.getNodeMaker()); }
public void setSpeed(double speed) { wrapperContained.setSpeed(speed); }
public yarnwrap.entity.ai.pathing.Path getCurrentPath() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.getCurrentPath()); }
// public void checkTimeouts(yarnwrap.util.math.Vec3d currentPos) { wrapperContained.checkTimeouts(currentPos.wrapperContained); }
// public yarnwrap.util.math.Vec3d getPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPos()); }
public yarnwrap.entity.ai.pathing.Path findPathTo(yarnwrap.util.math.BlockPos target,int distance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathTo(target.wrapperContained,distance)); }
public yarnwrap.entity.ai.pathing.Path findPathTo(yarnwrap.entity.Entity entity,int distance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathTo(entity.wrapperContained,distance)); }
public boolean canSwim() { return wrapperContained.canSwim(); }
public yarnwrap.entity.ai.pathing.Path findPathTo(double x,double y,double z,int distance) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPathTo(x,y,z,distance)); }
public void setCanSwim(boolean canSwim) { wrapperContained.setCanSwim(canSwim); }
public yarnwrap.util.math.BlockPos getTargetPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTargetPos()); }
public void recalculatePath() { wrapperContained.recalculatePath(); }
public boolean isIdle() { return wrapperContained.isIdle(); }
// public boolean isAtValidPosition() { return wrapperContained.isAtValidPosition(); }
// public void adjustPath() { wrapperContained.adjustPath(); }
public void tick() { wrapperContained.tick(); }

}