package yarnwrap.advancement.criterion;
public class BrewedPotionCriterion { public net.minecraft.advancement.criterion.BrewedPotionCriterion wrapperContained; public BrewedPotionCriterion(net.minecraft.advancement.criterion.BrewedPotionCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22456(yarnwrap.registry.entry.RegistryEntry conditions) { return wrapperContained.method_22456(conditions.wrapperContained); }
// public static boolean method_22456(yarnwrap.registry.entry.RegistryEntry conditions, ) { return net.minecraft.advancement.criterion.BrewedPotionCriterion.method_22456(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.registry.entry.RegistryEntry potion) { wrapperContained.trigger(player.wrapperContained,potion.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.registry.entry.RegistryEntry potion, ) { net.minecraft.advancement.criterion.BrewedPotionCriterion.trigger(player.wrapperContained,potion.wrapperContained); }

}