package yarnwrap.advancement.criterion;
public class Criterion { public net.minecraft.advancement.criterion.Criterion wrapperContained; public Criterion(net.minecraft.advancement.criterion.Criterion wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.advancement.AdvancementCriterion create(yarnwrap.advancement.criterion.CriterionConditions conditions) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.create(conditions.wrapperContained)); }
public com.mojang.serialization.Codec getConditionsCodec() { return wrapperContained.getConditionsCodec(); }
public void endTracking(yarnwrap.advancement.PlayerAdvancementTracker tracker) { wrapperContained.endTracking(tracker.wrapperContained); }
// public void beginTrackingCondition(yarnwrap.advancement.PlayerAdvancementTracker manager,Object conditions) { wrapperContained.beginTrackingCondition(manager.wrapperContained,conditions); }
// public void endTrackingCondition(yarnwrap.advancement.PlayerAdvancementTracker manager,Object conditions) { wrapperContained.endTrackingCondition(manager.wrapperContained,conditions); }

}