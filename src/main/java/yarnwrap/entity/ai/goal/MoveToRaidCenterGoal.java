package yarnwrap.entity.ai.goal;
public class MoveToRaidCenterGoal { public net.minecraft.entity.ai.goal.MoveToRaidCenterGoal wrapperContained; public MoveToRaidCenterGoal(net.minecraft.entity.ai.goal.MoveToRaidCenterGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.raid.RaiderEntity actor() { return new yarnwrap.entity.raid.RaiderEntity(wrapperContained.actor); }
// public void actor(yarnwrap.entity.raid.RaiderEntity value) { wrapperContained.actor = value.wrapperContained; }
// public float WALK_SPEED() { return wrapperContained.WALK_SPEED; }
// public void WALK_SPEED(float value) { wrapperContained.WALK_SPEED = value; }
// public int FREE_RAIDER_CHECK_INTERVAL() { return wrapperContained.FREE_RAIDER_CHECK_INTERVAL; }
// public void FREE_RAIDER_CHECK_INTERVAL(int value) { wrapperContained.FREE_RAIDER_CHECK_INTERVAL = value; }
// public int nextFreeRaiderCheckAge() { return wrapperContained.nextFreeRaiderCheckAge; }
// public void nextFreeRaiderCheckAge(int value) { wrapperContained.nextFreeRaiderCheckAge = value; }
public MoveToRaidCenterGoal(yarnwrap.entity.raid.RaiderEntity actor) { this.wrapperContained = new net.minecraft.entity.ai.goal.MoveToRaidCenterGoal(actor.wrapperContained); }
// public void includeFreeRaiders(yarnwrap.village.raid.Raid raid) { wrapperContained.includeFreeRaiders(raid.wrapperContained); }
// public boolean method_16466(yarnwrap.village.raid.Raid raider) { return wrapperContained.method_16466(raider.wrapperContained); }

}