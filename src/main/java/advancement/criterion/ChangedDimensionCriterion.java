package yarnwrap.advancement.criterion;
public class ChangedDimensionCriterion { public net.minecraft.advancement.criterion.ChangedDimensionCriterion wrapperContained; public ChangedDimensionCriterion(net.minecraft.advancement.criterion.ChangedDimensionCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.registry.RegistryKey from,yarnwrap.registry.RegistryKey to) { wrapperContained.trigger(player.wrapperContained,from.wrapperContained,to.wrapperContained); }

}