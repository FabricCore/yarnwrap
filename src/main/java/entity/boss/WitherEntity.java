package yarnwrap.entity.boss;
public class WitherEntity { public net.minecraft.entity.boss.WitherEntity wrapperContained; public WitherEntity(net.minecraft.entity.boss.WitherEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate HEAD_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.HEAD_TARGET_PREDICATE); }
// public int DEFAULT_INVUL_TIMER() { return wrapperContained.DEFAULT_INVUL_TIMER; }
// public int blockBreakingCooldown() { return wrapperContained.blockBreakingCooldown; }
// public float[] sideHeadYaws() { return wrapperContained.sideHeadYaws; }
// public float[] sideHeadPitches() { return wrapperContained.sideHeadPitches; }
// public yarnwrap.entity.data.TrackedData INVUL_TIMER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.INVUL_TIMER); }
// public java.util.function.Predicate CAN_ATTACK_PREDICATE() { return wrapperContained.CAN_ATTACK_PREDICATE; }
// public java.util.List TRACKED_ENTITY_IDS() { return wrapperContained.TRACKED_ENTITY_IDS; }
// public yarnwrap.entity.data.TrackedData TRACKED_ENTITY_ID_1() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKED_ENTITY_ID_1); }
// public yarnwrap.entity.data.TrackedData TRACKED_ENTITY_ID_3() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKED_ENTITY_ID_3); }
// public yarnwrap.entity.data.TrackedData TRACKED_ENTITY_ID_2() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKED_ENTITY_ID_2); }
// public int[] skullCooldowns() { return wrapperContained.skullCooldowns; }
// public int[] chargedSkullCooldowns() { return wrapperContained.chargedSkullCooldowns; }
// public yarnwrap.entity.boss.ServerBossBar bossBar() { return new yarnwrap.entity.boss.ServerBossBar(wrapperContained.bossBar); }
// public float[] prevSideHeadYaws() { return wrapperContained.prevSideHeadYaws; }
// public float[] prevSideHeadPitches() { return wrapperContained.prevSideHeadPitches; }
public Object createWitherAttributes() { return wrapperContained.createWitherAttributes(); }
// public double getHeadX(int headIndex) { return wrapperContained.getHeadX(headIndex); }
public void setInvulTimer(int ticks) { wrapperContained.setInvulTimer(ticks); }
public void setTrackedEntityId(int headIndex,int id) { wrapperContained.setTrackedEntityId(headIndex,id); }
// public void shootSkullAt(int headIndex,double targetX,double targetY,double targetZ,boolean charged) { wrapperContained.shootSkullAt(headIndex,targetX,targetY,targetZ,charged); }
// public void shootSkullAt(int headIndex,yarnwrap.entity.LivingEntity target) { wrapperContained.shootSkullAt(headIndex,target.wrapperContained); }
public float getHeadYaw(int headIndex) { return wrapperContained.getHeadYaw(headIndex); }
// public double getHeadY(int headIndex) { return wrapperContained.getHeadY(headIndex); }
// public double getHeadZ(int headIndex) { return wrapperContained.getHeadZ(headIndex); }
public int getTrackedEntityId(int headIndex) { return wrapperContained.getTrackedEntityId(headIndex); }
public boolean canDestroy(yarnwrap.block.BlockState block) { return wrapperContained.canDestroy(block.wrapperContained); }
public int getInvulnerableTimer() { return wrapperContained.getInvulnerableTimer(); }
public void onSummoned() { wrapperContained.onSummoned(); }
// public float getNextAngle(float prevAngle,float desiredAngle,float maxDifference) { return wrapperContained.getNextAngle(prevAngle,desiredAngle,maxDifference); }
public float getHeadPitch(int headIndex) { return wrapperContained.getHeadPitch(headIndex); }

}