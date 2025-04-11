package yarnwrap.advancement.criterion;
public class InventoryChangedCriterion { public net.minecraft.advancement.criterion.InventoryChangedCriterion wrapperContained; public InventoryChangedCriterion(net.minecraft.advancement.criterion.InventoryChangedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.item.ItemStack stack,int full,int empty,int occupied) { wrapperContained.trigger(player.wrapperContained,inventory.wrapperContained,stack.wrapperContained,full,empty,occupied); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,inventory.wrapperContained,stack.wrapperContained); }

}