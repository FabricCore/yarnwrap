package yarnwrap.screen;
public class AbstractCraftingScreenHandler { public net.minecraft.screen.AbstractCraftingScreenHandler wrapperContained; public AbstractCraftingScreenHandler(net.minecraft.screen.AbstractCraftingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.RecipeInputInventory craftingInventory() { return new yarnwrap.inventory.RecipeInputInventory(wrapperContained.craftingInventory); }
// public void craftingInventory(yarnwrap.inventory.RecipeInputInventory value) { wrapperContained.craftingInventory = value.wrapperContained; }
// public static yarnwrap.inventory.RecipeInputInventory craftingInventory() { return new yarnwrap.inventory.RecipeInputInventory(net.minecraft.screen.AbstractCraftingScreenHandler.craftingInventory); }
// public static void craftingInventory(yarnwrap.inventory.RecipeInputInventory value, ) { net.minecraft.screen.AbstractCraftingScreenHandler.craftingInventory = value.wrapperContained; }

// public yarnwrap.inventory.CraftingResultInventory craftingResultInventory() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.craftingResultInventory); }
// public void craftingResultInventory(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.craftingResultInventory = value.wrapperContained; }
// public static yarnwrap.inventory.CraftingResultInventory craftingResultInventory() { return new yarnwrap.inventory.CraftingResultInventory(net.minecraft.screen.AbstractCraftingScreenHandler.craftingResultInventory); }
// public static void craftingResultInventory(yarnwrap.inventory.CraftingResultInventory value, ) { net.minecraft.screen.AbstractCraftingScreenHandler.craftingResultInventory = value.wrapperContained; }

// public int width() { return wrapperContained.width; }
// public void width(int value) { wrapperContained.width = value; }
// public static int width() { return net.minecraft.screen.AbstractCraftingScreenHandler.width; }
// public static void width(int value, ) { net.minecraft.screen.AbstractCraftingScreenHandler.width = value; }

// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public static int height() { return net.minecraft.screen.AbstractCraftingScreenHandler.height; }
// public static void height(int value, ) { net.minecraft.screen.AbstractCraftingScreenHandler.height = value; }

// public AbstractCraftingScreenHandler(yarnwrap.screen.ScreenHandlerType type,int syncId,int width,int height) { this.wrapperContained = new net.minecraft.screen.AbstractCraftingScreenHandler(type.wrapperContained,syncId,width,height); }
// public void onInputSlotFillStart() { wrapperContained.onInputSlotFillStart(); }
// public static void onInputSlotFillStart() { net.minecraft.screen.AbstractCraftingScreenHandler.onInputSlotFillStart(); }
// public void onInputSlotFillFinish(yarnwrap.server.world.ServerWorld world,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onInputSlotFillFinish(world.wrapperContained,recipe.wrapperContained); }
// public static void onInputSlotFillFinish(yarnwrap.server.world.ServerWorld world,yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.screen.AbstractCraftingScreenHandler.onInputSlotFillFinish(world.wrapperContained,recipe.wrapperContained); }
// public yarnwrap.screen.slot.Slot addResultSlot(yarnwrap.entity.player.PlayerEntity player,int x,int y) { return new yarnwrap.screen.slot.Slot(wrapperContained.addResultSlot(player.wrapperContained,x,y)); }
// public static yarnwrap.screen.slot.Slot addResultSlot(yarnwrap.entity.player.PlayerEntity player,int x,int y, ) { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.AbstractCraftingScreenHandler.addResultSlot(player.wrapperContained,x,y)); }
// public void addInputSlots(int x,int y) { wrapperContained.addInputSlots(x,y); }
// public static void addInputSlots(int x,int y, ) { net.minecraft.screen.AbstractCraftingScreenHandler.addInputSlots(x,y); }
public yarnwrap.screen.slot.Slot getOutputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.getOutputSlot()); }
// public static yarnwrap.screen.slot.Slot getOutputSlot() { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.AbstractCraftingScreenHandler.getOutputSlot()); }
public java.util.List getInputSlots() { return wrapperContained.getInputSlots(); }
// public static java.util.List getInputSlots() { return net.minecraft.screen.AbstractCraftingScreenHandler.getInputSlots(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.screen.AbstractCraftingScreenHandler.getWidth(); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.screen.AbstractCraftingScreenHandler.getHeight(); }
// public yarnwrap.entity.player.PlayerEntity getPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getPlayer()); }
// public static yarnwrap.entity.player.PlayerEntity getPlayer() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.AbstractCraftingScreenHandler.getPlayer()); }

}