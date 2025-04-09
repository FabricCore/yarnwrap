package yarnwrap.entity.boss.dragon;
public class EnderDragonEntity { public net.minecraft.entity.boss.dragon.EnderDragonEntity wrapperContained; public EnderDragonEntity(net.minecraft.entity.boss.dragon.EnderDragonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
public float yawAcceleration() { return wrapperContained.yawAcceleration; }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public float TAKEOFF_THRESHOLD() { return wrapperContained.TAKEOFF_THRESHOLD; }
// public java.lang.String DRAGON_DEATH_TIME_KEY() { return wrapperContained.DRAGON_DEATH_TIME_KEY; }
// public java.lang.String DRAGON_PHASE_KEY() { return wrapperContained.DRAGON_PHASE_KEY; }
// public yarnwrap.util.math.BlockPos fightOrigin() { return new yarnwrap.util.math.BlockPos(wrapperContained.fightOrigin); }
// public yarnwrap.entity.ai.pathing.PathMinHeap pathHeap() { return new yarnwrap.entity.ai.pathing.PathMinHeap(wrapperContained.pathHeap); }
// public yarnwrap.entity.boss.dragon.EnderDragonPart tail2() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.tail2); }
public int latestSegment() { return wrapperContained.latestSegment; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart neck() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.neck); }
// public net.minecraft.entity.ai.pathing.PathNode[] pathNodes() { return wrapperContained.pathNodes; }
public yarnwrap.entity.data.TrackedData PHASE_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PHASE_TYPE); }
// public yarnwrap.entity.boss.dragon.EnderDragonPart leftWing() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.leftWing); }
// public yarnwrap.entity.boss.dragon.EnderDragonPart rightWing() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.rightWing); }
// public yarnwrap.entity.boss.dragon.EnderDragonFight fight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.fight); }
public yarnwrap.entity.boss.dragon.EnderDragonPart head() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.head); }
// public int ticksUntilNextGrowl() { return wrapperContained.ticksUntilNextGrowl; }
public float prevWingPosition() { return wrapperContained.prevWingPosition; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart tail1() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.tail1); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart tail3() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.tail3); }
// public yarnwrap.entity.boss.dragon.EnderDragonPart body() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.body); }
public yarnwrap.entity.decoration.EndCrystalEntity connectedCrystal() { return new yarnwrap.entity.decoration.EndCrystalEntity(wrapperContained.connectedCrystal); }
// public int[] pathNodeConnections() { return wrapperContained.pathNodeConnections; }
public double[][] segmentCircularBuffer() { return wrapperContained.segmentCircularBuffer; }
public boolean slowedDownByBlock() { return wrapperContained.slowedDownByBlock; }
// public yarnwrap.entity.boss.dragon.phase.PhaseManager phaseManager() { return new yarnwrap.entity.boss.dragon.phase.PhaseManager(wrapperContained.phaseManager); }
// public float damageDuringSitting() { return wrapperContained.damageDuringSitting; }
public float wingPosition() { return wrapperContained.wingPosition; }
public int ticksSinceDeath() { return wrapperContained.ticksSinceDeath; }
// public net.minecraft.entity.boss.dragon.EnderDragonPart[] parts() { return wrapperContained.parts; }
// public void movePart(yarnwrap.entity.boss.dragon.EnderDragonPart enderDragonPart,double dx,double dy,double dz) { wrapperContained.movePart(enderDragonPart.wrapperContained,dx,dy,dz); }
public Object createEnderDragonAttributes() { return wrapperContained.createEnderDragonAttributes(); }
public void setFight(yarnwrap.entity.boss.dragon.EnderDragonFight fight) { wrapperContained.setFight(fight.wrapperContained); }
public void setFightOrigin(yarnwrap.util.math.BlockPos fightOrigin) { wrapperContained.setFightOrigin(fightOrigin.wrapperContained); }
public yarnwrap.util.math.BlockPos getFightOrigin() { return new yarnwrap.util.math.BlockPos(wrapperContained.getFightOrigin()); }
public net.minecraft.entity.boss.dragon.EnderDragonPart[] getBodyParts() { return wrapperContained.getBodyParts(); }
public boolean damagePart(yarnwrap.entity.boss.dragon.EnderDragonPart part,yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.damagePart(part.wrapperContained,source.wrapperContained,amount); }
public double[] getSegmentProperties(int segmentNumber,float tickDelta) { return wrapperContained.getSegmentProperties(segmentNumber,tickDelta); }
public int getNearestPathNodeIndex() { return wrapperContained.getNearestPathNodeIndex(); }
// public boolean parentDamage(yarnwrap.entity.damage.DamageSource source,float amount) { return wrapperContained.parentDamage(source.wrapperContained,amount); }
// public float getHeadVerticalMovement() { return wrapperContained.getHeadVerticalMovement(); }
// public boolean destroyBlocks(yarnwrap.util.math.Box box) { return wrapperContained.destroyBlocks(box.wrapperContained); }
public int getNearestPathNodeIndex(double x,double y,double z) { return wrapperContained.getNearestPathNodeIndex(x,y,z); }
// public float getChangeInNeckPitch(int segmentOffset,double segment1,double segment2) { return wrapperContained.getChangeInNeckPitch(segmentOffset,segment1,segment2); }
// public void launchLivingEntities(yarnwrap.server.world.ServerWorld world,java.util.List entities) { wrapperContained.launchLivingEntities(world.wrapperContained,entities); }
// public yarnwrap.entity.ai.pathing.Path getPathOfAllPredecessors(yarnwrap.entity.ai.pathing.PathNode unused,yarnwrap.entity.ai.pathing.PathNode node) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.getPathOfAllPredecessors(unused.wrapperContained,node.wrapperContained)); }
// public void damageLivingEntities(java.util.List entities) { wrapperContained.damageLivingEntities(entities); }
public void crystalDestroyed(yarnwrap.entity.decoration.EndCrystalEntity endCrystal,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.damage.DamageSource source) { wrapperContained.crystalDestroyed(endCrystal.wrapperContained,pos.wrapperContained,source.wrapperContained); }
public yarnwrap.entity.boss.dragon.EnderDragonFight getFight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.getFight()); }
// public void tickWithEndCrystals() { wrapperContained.tickWithEndCrystals(); }
public yarnwrap.entity.boss.dragon.phase.PhaseManager getPhaseManager() { return new yarnwrap.entity.boss.dragon.phase.PhaseManager(wrapperContained.getPhaseManager()); }
// public float wrapYawChange(double yawDegrees) { return wrapperContained.wrapYawChange(yawDegrees); }
public yarnwrap.entity.ai.pathing.Path findPath(int from,int to,yarnwrap.entity.ai.pathing.PathNode pathNode) { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.findPath(from,to,pathNode.wrapperContained)); }
public yarnwrap.util.math.Vec3d getRotationVectorFromPhase(float tickDelta) { return new yarnwrap.util.math.Vec3d(wrapperContained.getRotationVectorFromPhase(tickDelta)); }

}