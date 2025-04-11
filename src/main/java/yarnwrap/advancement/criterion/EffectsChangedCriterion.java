package yarnwrap.advancement.criterion;
public class EffectsChangedCriterion { public net.minecraft.advancement.criterion.EffectsChangedCriterion wrapperContained; public EffectsChangedCriterion(net.minecraft.advancement.criterion.EffectsChangedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22462(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22462(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity source) { wrapperContained.trigger(player.wrapperContained,source.wrapperContained); }

}