package yarnwrap.advancement.criterion;
public class UsedTotemCriterion { public net.minecraft.advancement.criterion.UsedTotemCriterion wrapperContained; public UsedTotemCriterion(net.minecraft.advancement.criterion.UsedTotemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22541(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22541(conditions.wrapperContained); }
// public static boolean method_22541(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.UsedTotemCriterion.method_22541(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.UsedTotemCriterion.trigger(player.wrapperContained,stack.wrapperContained); }

}