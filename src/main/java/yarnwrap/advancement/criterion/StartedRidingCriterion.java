package yarnwrap.advancement.criterion;
public class StartedRidingCriterion { public net.minecraft.advancement.criterion.StartedRidingCriterion wrapperContained; public StartedRidingCriterion(net.minecraft.advancement.criterion.StartedRidingCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.trigger(player.wrapperContained); }
// public boolean method_37259(Object conditions) { return wrapperContained.method_37259(conditions); }

}