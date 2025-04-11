package yarnwrap.advancement.criterion;
public class ItemCriterion { public net.minecraft.advancement.criterion.ItemCriterion wrapperContained; public ItemCriterion(net.minecraft.advancement.criterion.ItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_23888(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_23888(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }

}