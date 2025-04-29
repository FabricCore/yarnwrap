package yarnwrap.advancement.criterion;
public class ConsumeItemCriterion { public net.minecraft.advancement.criterion.ConsumeItemCriterion wrapperContained; public ConsumeItemCriterion(net.minecraft.advancement.criterion.ConsumeItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22460(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22460(conditions.wrapperContained); }
// public static boolean method_22460(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.ConsumeItemCriterion.method_22460(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.ConsumeItemCriterion.trigger(player.wrapperContained,stack.wrapperContained); }

}