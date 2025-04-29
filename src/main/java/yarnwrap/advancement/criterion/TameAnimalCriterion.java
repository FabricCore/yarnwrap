package yarnwrap.advancement.criterion;
public class TameAnimalCriterion { public net.minecraft.advancement.criterion.TameAnimalCriterion wrapperContained; public TameAnimalCriterion(net.minecraft.advancement.criterion.TameAnimalCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22538(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_22538(conditions.wrapperContained); }
// public static boolean method_22538(yarnwrap.loot.context.LootContext conditions, ) { return net.minecraft.advancement.criterion.TameAnimalCriterion.method_22538(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.AnimalEntity entity) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.AnimalEntity entity, ) { net.minecraft.advancement.criterion.TameAnimalCriterion.trigger(player.wrapperContained,entity.wrapperContained); }

}