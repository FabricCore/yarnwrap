package yarnwrap.advancement.criterion;
public class ItemDurabilityChangedCriterion { public net.minecraft.advancement.criterion.ItemDurabilityChangedCriterion wrapperContained; public ItemDurabilityChangedCriterion(net.minecraft.advancement.criterion.ItemDurabilityChangedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,int durability) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,durability); }

}