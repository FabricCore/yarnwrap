package yarnwrap.screen.slot;
public class CraftingResultSlot { public net.minecraft.screen.slot.CraftingResultSlot wrapperContained; public CraftingResultSlot(net.minecraft.screen.slot.CraftingResultSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.slot.CraftingResultSlot.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.slot.CraftingResultSlot.player = value.wrapperContained; }

// public int amount() { return wrapperContained.amount; }
// public void amount(int value) { wrapperContained.amount = value; }
// public static int amount() { return net.minecraft.screen.slot.CraftingResultSlot.amount; }
// public static void amount(int value, ) { net.minecraft.screen.slot.CraftingResultSlot.amount = value; }

// public yarnwrap.inventory.RecipeInputInventory input() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.RecipeInputInventory value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.inventory.RecipeInputInventory input() { return new yarnwrap.inventory.RecipeInputInventory(net.minecraft.screen.slot.CraftingResultSlot.input); }
// public static void input(yarnwrap.inventory.RecipeInputInventory value, ) { net.minecraft.screen.slot.CraftingResultSlot.input = value.wrapperContained; }

public CraftingResultSlot(yarnwrap.entity.player.PlayerEntity player,yarnwrap.inventory.RecipeInputInventory input,yarnwrap.inventory.Inventory inventory,int index,int x,int y) { this.wrapperContained = new net.minecraft.screen.slot.CraftingResultSlot(player.wrapperContained,input.wrapperContained,inventory.wrapperContained,index,x,y); }

}