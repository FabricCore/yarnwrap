package yarnwrap.advancement.criterion;
public class InventoryChangedCriterion { public net.minecraft.advancement.criterion.InventoryChangedCriterion wrapperContained; public InventoryChangedCriterion(net.minecraft.advancement.criterion.InventoryChangedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22476(yarnwrap.entity.player.PlayerInventory conditions) { return wrapperContained.method_22476(conditions.wrapperContained); }
// public static boolean method_22476(yarnwrap.entity.player.PlayerInventory conditions, ) { return net.minecraft.advancement.criterion.InventoryChangedCriterion.method_22476(conditions.wrapperContained); }
// public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.item.ItemStack stack,int full,int empty,int occupied) { wrapperContained.trigger(player.wrapperContained,inventory.wrapperContained,stack.wrapperContained,full,empty,occupied); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.item.ItemStack stack,int full,int empty,int occupied, ) { net.minecraft.advancement.criterion.InventoryChangedCriterion.trigger(player.wrapperContained,inventory.wrapperContained,stack.wrapperContained,full,empty,occupied); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,inventory.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.InventoryChangedCriterion.trigger(player.wrapperContained,inventory.wrapperContained,stack.wrapperContained); }

}