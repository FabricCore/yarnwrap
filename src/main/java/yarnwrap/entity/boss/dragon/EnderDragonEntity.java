package yarnwrap.entity.boss.dragon;
public class EnderDragonEntity { public net.minecraft.entity.boss.dragon.EnderDragonEntity wrapperContained; public EnderDragonEntity(net.minecraft.entity.boss.dragon.EnderDragonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
// public void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }
public float yawAcceleration() { return wrapperContained.yawAcceleration; }
public void yawAcceleration(float value) { wrapperContained.yawAcceleration = value; }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public void MAX_HEALTH(int value) { wrapperContained.MAX_HEALTH = value; }
// public float TAKEOFF_THRESHOLD() { return wrapperContained.TAKEOFF_THRESHOLD; }
// public void TAKEOFF_THRESHOLD(float value) { wrapperContained.TAKEOFF_THRESHOLD = value; }
// public java.lang.String DRAGON_DEATH_TIME_KEY() { return wrapperContained.DRAGON_DEATH_TIME_KEY; }
// public void DRAGON_DEATH_TIME_KEY(java.lang.String value) { wrapperContained.DRAGON_DEATH_TIME_KEY = value; }
// public java.lang.String DRAGON_PHASE_KEY() { return wrapperContained.DRAGON_PHASE_KEY; }
// public void DRAGON_PHASE_KEY(java.lang.String value) { wrapperContained.DRAGON_PHASE_KEY = value; }
// public yarnwrap.util.math.BlockPos fightOrigin() { return new yarnwrap.util.math.BlockPos(wrapperContained.fightOrigin); }
// public void fightOrigin(yarnwrap.util.math.BlockPos value) { wrapperContained.fightOrigin = value.wrapperContained; }
// public yarnwrap.entity.ai.pathing.PathMinHeap pathHeap() { return new yarnwrap.entity.ai.pathing.PathMinHeap(wrapperContained.pathHeap); }
// public void pathHeap(yarnwrap.entity.ai.pathing.PathMinHeap value) { wrapperContained.pathHeap = value.wrapperContained; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart tail2() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.tail2); }
// public void tail2(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.tail2 = value.wrapperContained; }
public int latestSegment() { return wrapperContained.latestSegment; }
public void latestSegment(int value) { wrapperContained.latestSegment = value; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart neck() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.neck); }
// public void neck(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.neck = value.wrapperContained; }
// public net.minecraft.entity.ai.pathing.PathNode[] pathNodes() { return wrapperContained.pathNodes; }
// public void pathNodes(net.minecraft.entity.ai.pathing.PathNode[] value) { wrapperContained.pathNodes = value; }
public yarnwrap.entity.data.TrackedData PHASE_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PHASE_TYPE); }
// public void PHASE_TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.PHASE_TYPE = value.wrapperContained; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart leftWing() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.leftWing); }
// public void leftWing(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.leftWing = value.wrapperContained; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart rightWing() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.rightWing); }
// public void rightWing(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.rightWing = value.wrapperContained; }
// public yarnwrap.entity.boss.dragon.EnderDragonFight fight() { return new yarnwrap.entity.boss.dragon.EnderDragonFight(wrapperContained.fight); }
// public void fight(yarnwrap.entity.boss.dragon.EnderDragonFight value) { wrapperContained.fight = value.wrapperContained; }
public yarnwrap.entity.boss.dragon.EnderDragonPart head() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.head); }
// public void head(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.head = value.wrapperContained; }
// public int ticksUntilNextGrowl() { return wrapperContained.ticksUntilNextGrowl; }
// public void ticksUntilNextGrowl(int value) { wrapperContained.ticksUntilNextGrowl = value; }
public float prevWingPosition() { return wrapperContained.prevWingPosition; }
public void prevWingPosition(float value) { wrapperContained.prevWingPosition = value; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart tail1() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.tail1); }
// public void tail1(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.tail1 = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart tail3() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.tail3); }
// public void tail3(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.tail3 = value.wrapperContained; }
// public yarnwrap.entity.boss.dragon.EnderDragonPart body() { return new yarnwrap.entity.boss.dragon.EnderDragonPart(wrapperContained.body); }
// public void body(yarnwrap.entity.boss.dragon.EnderDragonPart value) { wrapperContained.body = value.wrapperContained; }
public yarnwrap.entity.decoration.EndCrystalEntity connectedCrystal() { return new yarnwrap.entity.decoration.EndCrystalEntity(wrapperContained.connectedCrystal); }
public void connectedCrystal(yarnwrap.entity.decoration.EndCrystalEntity value) { wrapperContained.connectedCrystal = value.wrapperContained; }
// public int[] pathNodeConnections() { return wrapperContained.pathNodeConnections; }
// public void pathNodeConnections(int[] value) { wrapperContained.pathNodeConnections = value; }
public double[][] segmentCircularBuffer() { return wrapperContained.segmentCircularBuffer; }
// public void segmentCircularBuffer(double[][] value) { wrapperContained.segmentCircularBuffer = value; }
public boolean slowedDownByBlock() { return wrapperContained.slowedDownByBlock; }
public void slowedDownByBlock(boolean value) { wrapperContained.slowedDownByBlock = value; }
// public yarnwrap.entity.boss.dragon.phase.PhaseManager phaseManager() { return new yarnwrap.entity.boss.dragon.phase.PhaseManager(wrapperContained.phaseManager); }
// public void phaseManager(yarnwrap.entity.boss.dragon.phase.PhaseManager value) { wrapperContained.phaseManager = value.wrapperContained; }
// public float damageDuringSitting() { return wrapperContained.damageDuringSitting; }
// public void damageDuringSitting(float value) { wrapperContained.damageDuringSitting = value; }
public float wingPosition() { return wrapperContained.wingPosition; }
public void wingPosition(float value) { wrapperContained.wingPosition = value; }
public int ticksSinceDeath() { return wrapperContained.ticksSinceDeath; }
public void ticksSinceDeath(int value) { wrapperContained.ticksSinceDeath = value; }
// public net.minecraft.entity.boss.dragon.EnderDragonPart[] parts() { return wrapperContained.parts; }
// public void parts(net.minecraft.entity.boss.dragon.EnderDragonPart[] value) { wrapperContained.parts = value; }
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