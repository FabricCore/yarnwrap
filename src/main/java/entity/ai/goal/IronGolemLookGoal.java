package yarnwrap.entity.ai.goal;
public class IronGolemLookGoal { public net.minecraft.entity.ai.goal.IronGolemLookGoal wrapperContained; public IronGolemLookGoal(net.minecraft.entity.ai.goal.IronGolemLookGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_VILLAGER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_VILLAGER_PREDICATE); }
public int MAX_LOOK_COOLDOWN() { return wrapperContained.MAX_LOOK_COOLDOWN; }
// public yarnwrap.entity.passive.IronGolemEntity golem() { return new yarnwrap.entity.passive.IronGolemEntity(wrapperContained.golem); }
// public int lookCountdown() { return wrapperContained.lookCountdown; }
// public yarnwrap.entity.passive.VillagerEntity targetVillager() { return new yarnwrap.entity.passive.VillagerEntity(wrapperContained.targetVillager); }

}