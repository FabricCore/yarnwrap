package yarnwrap.advancement.criterion;
public class BrewedPotionCriterion { public net.minecraft.advancement.criterion.BrewedPotionCriterion wrapperContained; public BrewedPotionCriterion(net.minecraft.advancement.criterion.BrewedPotionCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.registry.entry.RegistryEntry potion) { wrapperContained.trigger(player.wrapperContained,potion.wrapperContained); }

}