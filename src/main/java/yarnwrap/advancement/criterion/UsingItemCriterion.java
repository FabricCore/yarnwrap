package yarnwrap.advancement.criterion;
public class UsingItemCriterion { public net.minecraft.advancement.criterion.UsingItemCriterion wrapperContained; public UsingItemCriterion(net.minecraft.advancement.criterion.UsingItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }
// public boolean method_37263(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_37263(conditions.wrapperContained); }

}