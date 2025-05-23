package yarnwrap.advancement.criterion;
public class VillagerTradeCriterion { public net.minecraft.advancement.criterion.VillagerTradeCriterion wrapperContained; public VillagerTradeCriterion(net.minecraft.advancement.criterion.VillagerTradeCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.MerchantEntity merchant,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,merchant.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.MerchantEntity merchant,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.VillagerTradeCriterion.trigger(player.wrapperContained,merchant.wrapperContained,stack.wrapperContained); }
// public boolean method_22539(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_22539(conditions.wrapperContained); }
// public static boolean method_22539(yarnwrap.loot.context.LootContext conditions, ) { return net.minecraft.advancement.criterion.VillagerTradeCriterion.method_22539(conditions.wrapperContained); }

}