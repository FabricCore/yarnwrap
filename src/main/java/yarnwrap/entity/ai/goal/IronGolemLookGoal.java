package yarnwrap.entity.ai.goal;
public class IronGolemLookGoal { public net.minecraft.entity.ai.goal.IronGolemLookGoal wrapperContained; public IronGolemLookGoal(net.minecraft.entity.ai.goal.IronGolemLookGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_VILLAGER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_VILLAGER_PREDICATE); }
// public void CLOSE_VILLAGER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.CLOSE_VILLAGER_PREDICATE = value.wrapperContained; }
public int MAX_LOOK_COOLDOWN() { return wrapperContained.MAX_LOOK_COOLDOWN; }
// public void MAX_LOOK_COOLDOWN(int value) { wrapperContained.MAX_LOOK_COOLDOWN = value; }
// public yarnwrap.entity.passive.IronGolemEntity golem() { return new yarnwrap.entity.passive.IronGolemEntity(wrapperContained.golem); }
// public void golem(yarnwrap.entity.passive.IronGolemEntity value) { wrapperContained.golem = value.wrapperContained; }
// public int lookCountdown() { return wrapperContained.lookCountdown; }
// public void lookCountdown(int value) { wrapperContained.lookCountdown = value; }
// public yarnwrap.entity.passive.VillagerEntity targetVillager() { return new yarnwrap.entity.passive.VillagerEntity(wrapperContained.targetVillager); }
// public void targetVillager(yarnwrap.entity.passive.VillagerEntity value) { wrapperContained.targetVillager = value.wrapperContained; }

}