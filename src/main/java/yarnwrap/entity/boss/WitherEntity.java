package yarnwrap.entity.boss;
public class WitherEntity { public net.minecraft.entity.boss.WitherEntity wrapperContained; public WitherEntity(net.minecraft.entity.boss.WitherEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate HEAD_TARGET_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.HEAD_TARGET_PREDICATE); }
// public void HEAD_TARGET_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.HEAD_TARGET_PREDICATE = value.wrapperContained; }
// public int DEFAULT_INVUL_TIMER() { return wrapperContained.DEFAULT_INVUL_TIMER; }
// public void DEFAULT_INVUL_TIMER(int value) { wrapperContained.DEFAULT_INVUL_TIMER = value; }
// public int blockBreakingCooldown() { return wrapperContained.blockBreakingCooldown; }
// public void blockBreakingCooldown(int value) { wrapperContained.blockBreakingCooldown = value; }
// public float[] sideHeadYaws() { return wrapperContained.sideHeadYaws; }
// public void sideHeadYaws(float[] value) { wrapperContained.sideHeadYaws = value; }
// public float[] sideHeadPitches() { return wrapperContained.sideHeadPitches; }
// public void sideHeadPitches(float[] value) { wrapperContained.sideHeadPitches = value; }
// public yarnwrap.entity.data.TrackedData INVUL_TIMER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.INVUL_TIMER); }
// public void INVUL_TIMER(yarnwrap.entity.data.TrackedData value) { wrapperContained.INVUL_TIMER = value.wrapperContained; }
// public java.util.function.Predicate CAN_ATTACK_PREDICATE() { return wrapperContained.CAN_ATTACK_PREDICATE; }
// public void CAN_ATTACK_PREDICATE(java.util.function.Predicate value) { wrapperContained.CAN_ATTACK_PREDICATE = value; }
// public java.util.List TRACKED_ENTITY_IDS() { return wrapperContained.TRACKED_ENTITY_IDS; }
// public void TRACKED_ENTITY_IDS(java.util.List value) { wrapperContained.TRACKED_ENTITY_IDS = value; }
// public yarnwrap.entity.data.TrackedData TRACKED_ENTITY_ID_1() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKED_ENTITY_ID_1); }
// public void TRACKED_ENTITY_ID_1(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKED_ENTITY_ID_1 = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData TRACKED_ENTITY_ID_3() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKED_ENTITY_ID_3); }
// public void TRACKED_ENTITY_ID_3(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKED_ENTITY_ID_3 = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData TRACKED_ENTITY_ID_2() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKED_ENTITY_ID_2); }
// public void TRACKED_ENTITY_ID_2(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKED_ENTITY_ID_2 = value.wrapperContained; }
// public int[] skullCooldowns() { return wrapperContained.skullCooldowns; }
// public void skullCooldowns(int[] value) { wrapperContained.skullCooldowns = value; }
// public int[] chargedSkullCooldowns() { return wrapperContained.chargedSkullCooldowns; }
// public void chargedSkullCooldowns(int[] value) { wrapperContained.chargedSkullCooldowns = value; }
// public yarnwrap.entity.boss.ServerBossBar bossBar() { return new yarnwrap.entity.boss.ServerBossBar(wrapperContained.bossBar); }
// public void bossBar(yarnwrap.entity.boss.ServerBossBar value) { wrapperContained.bossBar = value.wrapperContained; }
// public float[] prevSideHeadYaws() { return wrapperContained.prevSideHeadYaws; }
// public void prevSideHeadYaws(float[] value) { wrapperContained.prevSideHeadYaws = value; }
// public float[] prevSideHeadPitches() { return wrapperContained.prevSideHeadPitches; }
// public void prevSideHeadPitches(float[] value) { wrapperContained.prevSideHeadPitches = value; }
public Object createWitherAttributes() { return wrapperContained.createWitherAttributes(); }
// public boolean method_6873(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_6873(entity.wrapperContained); }
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