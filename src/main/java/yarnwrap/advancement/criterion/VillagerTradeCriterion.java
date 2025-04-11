package yarnwrap.advancement.criterion;
public class VillagerTradeCriterion { public net.minecraft.advancement.criterion.VillagerTradeCriterion wrapperContained; public VillagerTradeCriterion(net.minecraft.advancement.criterion.VillagerTradeCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22539(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_22539(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.MerchantEntity merchant,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,merchant.wrapperContained,stack.wrapperContained); }

}