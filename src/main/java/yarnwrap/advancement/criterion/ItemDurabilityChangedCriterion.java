package yarnwrap.advancement.criterion;
public class ItemDurabilityChangedCriterion { public net.minecraft.advancement.criterion.ItemDurabilityChangedCriterion wrapperContained; public ItemDurabilityChangedCriterion(net.minecraft.advancement.criterion.ItemDurabilityChangedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22477(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22477(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,int durability) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,durability); }

}