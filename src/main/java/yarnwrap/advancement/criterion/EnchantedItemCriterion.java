package yarnwrap.advancement.criterion;
public class EnchantedItemCriterion { public net.minecraft.advancement.criterion.EnchantedItemCriterion wrapperContained; public EnchantedItemCriterion(net.minecraft.advancement.criterion.EnchantedItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,int levels) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,levels); }

}