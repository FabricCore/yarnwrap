package yarnwrap.screen;
public class CrafterScreenHandler { public net.minecraft.screen.CrafterScreenHandler wrapperContained; public CrafterScreenHandler(net.minecraft.screen.CrafterScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.CraftingResultInventory resultInventory() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.resultInventory); }
// public void resultInventory(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.resultInventory = value.wrapperContained; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.inventory.RecipeInputInventory inputInventory() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.inputInventory); }
// public void inputInventory(yarnwrap.inventory.RecipeInputInventory value) { wrapperContained.inputInventory = value.wrapperContained; }
public void setSlotEnabled(int slot,boolean enabled) { wrapperContained.setSlotEnabled(slot,enabled); }
// public void addSlots(yarnwrap.entity.player.PlayerInventory playerInventory) { wrapperContained.addSlots(playerInventory.wrapperContained); }
public boolean isSlotDisabled(int slot) { return wrapperContained.isSlotDisabled(slot); }
public boolean isTriggered() { return wrapperContained.isTriggered(); }
public yarnwrap.inventory.Inventory getInputInventory() { return new yarnwrap.inventory.Inventory(wrapperContained.getInputInventory()); }
// public void updateResult() { wrapperContained.updateResult(); }

}