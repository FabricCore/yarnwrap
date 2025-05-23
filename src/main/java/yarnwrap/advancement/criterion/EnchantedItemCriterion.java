package yarnwrap.advancement.criterion;
public class EnchantedItemCriterion { public net.minecraft.advancement.criterion.EnchantedItemCriterion wrapperContained; public EnchantedItemCriterion(net.minecraft.advancement.criterion.EnchantedItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,int levels) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,levels); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,int levels, ) { net.minecraft.advancement.criterion.EnchantedItemCriterion.trigger(player.wrapperContained,stack.wrapperContained,levels); }
// public boolean method_22463(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22463(conditions.wrapperContained); }
// public static boolean method_22463(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.EnchantedItemCriterion.method_22463(conditions.wrapperContained); }

}