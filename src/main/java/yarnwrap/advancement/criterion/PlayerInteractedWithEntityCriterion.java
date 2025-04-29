package yarnwrap.advancement.criterion;
public class PlayerInteractedWithEntityCriterion { public net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion wrapperContained; public PlayerInteractedWithEntityCriterion(net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_30095(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_30095(conditions.wrapperContained); }
// public static boolean method_30095(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion.method_30095(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.entity.Entity entity) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,entity.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.entity.Entity entity, ) { net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion.trigger(player.wrapperContained,stack.wrapperContained,entity.wrapperContained); }

}