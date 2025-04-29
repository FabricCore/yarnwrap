package yarnwrap.advancement.criterion;
public class SummonedEntityCriterion { public net.minecraft.advancement.criterion.SummonedEntityCriterion wrapperContained; public SummonedEntityCriterion(net.minecraft.advancement.criterion.SummonedEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22537(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_22537(conditions.wrapperContained); }
// public static boolean method_22537(yarnwrap.loot.context.LootContext conditions, ) { return net.minecraft.advancement.criterion.SummonedEntityCriterion.method_22537(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity, ) { net.minecraft.advancement.criterion.SummonedEntityCriterion.trigger(player.wrapperContained,entity.wrapperContained); }

}