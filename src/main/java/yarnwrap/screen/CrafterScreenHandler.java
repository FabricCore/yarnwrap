package yarnwrap.screen;
public class CrafterScreenHandler { public net.minecraft.screen.CrafterScreenHandler wrapperContained; public CrafterScreenHandler(net.minecraft.screen.CrafterScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.resultInventory); }
// public void resultInventory(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.resultInventory = value.wrapperContained; }
// public static yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(net.minecraft.screen.CrafterScreenHandler.resultInventory); }
// public static void resultInventory(yarnwrap.inventory.CraftingResultInventory value, ) { net.minecraft.screen.CrafterScreenHandler.resultInventory = value.wrapperContained; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public static yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(net.minecraft.screen.CrafterScreenHandler.propertyDelegate); }
// public static void propertyDelegate(yarnwrap.screen.PropertyDelegate value, ) { net.minecraft.screen.CrafterScreenHandler.propertyDelegate = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.CrafterScreenHandler.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.CrafterScreenHandler.player = value.wrapperContained; }

// public yarnwrap.inventory.RecipeInputInventory inputInventory() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.inputInventory); }
// public void inputInventory(yarnwrap.inventory.RecipeInputInventory value) { wrapperContained.inputInventory = value.wrapperContained; }
// public static yarnwrap.inventory.RecipeInputInventory inputInventory() { return new yarnwrap.inventory.RecipeInputInventory(net.minecraft.screen.CrafterScreenHandler.inputInventory); }
// public static void inputInventory(yarnwrap.inventory.RecipeInputInventory value, ) { net.minecraft.screen.CrafterScreenHandler.inputInventory = value.wrapperContained; }

public CrafterScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.CrafterScreenHandler(syncId,playerInventory.wrapperContained); }
public CrafterScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.inventory.RecipeInputInventory inputInventory,yarnwrap.screen.PropertyDelegate propertyDelegate) { this.wrapperContained = new net.minecraft.screen.CrafterScreenHandler(syncId,playerInventory.wrapperContained,inputInventory.wrapperContained,propertyDelegate.wrapperContained); }
public void setSlotEnabled(int slot,boolean enabled) { wrapperContained.setSlotEnabled(slot,enabled); }
// public static void setSlotEnabled(int slot,boolean enabled, ) { net.minecraft.screen.CrafterScreenHandler.setSlotEnabled(slot,enabled); }
// public void addSlots(yarnwrap.entity.player.PlayerInventory playerInventory) { wrapperContained.addSlots(playerInventory.wrapperContained); }
// public static void addSlots(yarnwrap.entity.player.PlayerInventory playerInventory, ) { net.minecraft.screen.CrafterScreenHandler.addSlots(playerInventory.wrapperContained); }
public boolean isSlotDisabled(int slot) { return wrapperContained.isSlotDisabled(slot); }
// public static boolean isSlotDisabled(int slot, ) { return net.minecraft.screen.CrafterScreenHandler.isSlotDisabled(slot); }
public boolean isTriggered() { return wrapperContained.isTriggered(); }
// public static boolean isTriggered() { return net.minecraft.screen.CrafterScreenHandler.isTriggered(); }
public yarnwrap.inventory.Inventory getInputInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.getInputInventory()); }
// public static yarnwrap.inventory.Inventory getInputInventory() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.CrafterScreenHandler.getInputInventory()); }
// public void updateResult() { wrapperContained.updateResult(); }
// public static void updateResult() { net.minecraft.screen.CrafterScreenHandler.updateResult(); }

}