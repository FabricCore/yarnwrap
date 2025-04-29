package yarnwrap.screen;
public class ForgingScreenHandler { public net.minecraft.screen.ForgingScreenHandler wrapperContained; public ForgingScreenHandler(net.minecraft.screen.ForgingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.CraftingResultInventory output() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.output); }
// public void output(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.inventory.CraftingResultInventory output() { return new yarnwrap.inventory.CraftingResultInventory(net.minecraft.screen.ForgingScreenHandler.output); }
// public static void output(yarnwrap.inventory.CraftingResultInventory value, ) { net.minecraft.screen.ForgingScreenHandler.output = value.wrapperContained; }

// public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.Inventory value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.ForgingScreenHandler.input); }
// public static void input(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.ForgingScreenHandler.input = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.ForgingScreenHandler.context); }
// public static void context(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.ForgingScreenHandler.context = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.ForgingScreenHandler.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.ForgingScreenHandler.player = value.wrapperContained; }

// public java.util.List inputSlotIndices() { return wrapperContained.inputSlotIndices; }
// public void inputSlotIndices(java.util.List value) { wrapperContained.inputSlotIndices = value; }
// public static java.util.List inputSlotIndices() { return net.minecraft.screen.ForgingScreenHandler.inputSlotIndices; }
// public static void inputSlotIndices(java.util.List value, ) { net.minecraft.screen.ForgingScreenHandler.inputSlotIndices = value; }

// public int resultSlotIndex() { return wrapperContained.resultSlotIndex; }
// public void resultSlotIndex(int value) { wrapperContained.resultSlotIndex = value; }
// public static int resultSlotIndex() { return net.minecraft.screen.ForgingScreenHandler.resultSlotIndex; }
// public static void resultSlotIndex(int value, ) { net.minecraft.screen.ForgingScreenHandler.resultSlotIndex = value; }

// public ForgingScreenHandler(yarnwrap.screen.ScreenHandlerType type,int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.ForgingScreenHandler(type.wrapperContained,syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void onTakeOutput(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.onTakeOutput(player.wrapperContained,stack.wrapperContained); }
// public static void onTakeOutput(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.ForgingScreenHandler.onTakeOutput(player.wrapperContained,stack.wrapperContained); }
// public java.lang.Boolean method_24924(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { return wrapperContained.method_24924(world.wrapperContained,pos.wrapperContained); }
// public static java.lang.Boolean method_24924(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { return net.minecraft.screen.ForgingScreenHandler.method_24924(world.wrapperContained,pos.wrapperContained); }
// public boolean canUse(yarnwrap.block.BlockState state) { return wrapperContained.canUse(state.wrapperContained); }
// public static boolean canUse(yarnwrap.block.BlockState state, ) { return net.minecraft.screen.ForgingScreenHandler.canUse(state.wrapperContained); }
// public void method_24926(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_24926(world.wrapperContained,pos.wrapperContained); }
// public static void method_24926(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.ForgingScreenHandler.method_24926(world.wrapperContained,pos.wrapperContained); }
// public boolean canTakeOutput(yarnwrap.entity.player.PlayerEntity player,boolean present) { return wrapperContained.canTakeOutput(player.wrapperContained,present); }
// public static boolean canTakeOutput(yarnwrap.entity.player.PlayerEntity player,boolean present, ) { return net.minecraft.screen.ForgingScreenHandler.canTakeOutput(player.wrapperContained,present); }
public void updateResult() { wrapperContained.updateResult(); }
// public static void updateResult() { net.minecraft.screen.ForgingScreenHandler.updateResult(); }
// public yarnwrap.screen.slot.ForgingSlotsManager getForgingSlotsManager() { return new yarnwrap.screen.slot.ForgingSlotsManager(wrapperContained.getForgingSlotsManager()); }
// public static yarnwrap.screen.slot.ForgingSlotsManager getForgingSlotsManager() { return new yarnwrap.screen.slot.ForgingSlotsManager(net.minecraft.screen.ForgingScreenHandler.getForgingSlotsManager()); }
// public void addPlayerInventorySlots(yarnwrap.entity.player.PlayerInventory playerInventory) { wrapperContained.addPlayerInventorySlots(playerInventory.wrapperContained); }
// public static void addPlayerInventorySlots(yarnwrap.entity.player.PlayerInventory playerInventory, ) { net.minecraft.screen.ForgingScreenHandler.addPlayerInventorySlots(playerInventory.wrapperContained); }
// public void addInputSlots(yarnwrap.screen.slot.ForgingSlotsManager forgingSlotsManager) { wrapperContained.addInputSlots(forgingSlotsManager.wrapperContained); }
// public static void addInputSlots(yarnwrap.screen.slot.ForgingSlotsManager forgingSlotsManager, ) { net.minecraft.screen.ForgingScreenHandler.addInputSlots(forgingSlotsManager.wrapperContained); }
// public void addResultSlot(yarnwrap.screen.slot.ForgingSlotsManager forgingSlotsManager) { wrapperContained.addResultSlot(forgingSlotsManager.wrapperContained); }
// public static void addResultSlot(yarnwrap.screen.slot.ForgingSlotsManager forgingSlotsManager, ) { net.minecraft.screen.ForgingScreenHandler.addResultSlot(forgingSlotsManager.wrapperContained); }
// public boolean isValidIngredient(yarnwrap.item.ItemStack stack) { return wrapperContained.isValidIngredient(stack.wrapperContained); }
// public static boolean isValidIngredient(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.ForgingScreenHandler.isValidIngredient(stack.wrapperContained); }
public int getSlotFor(yarnwrap.item.ItemStack stack) { return wrapperContained.getSlotFor(stack.wrapperContained); }
// public static int getSlotFor(yarnwrap.item.ItemStack stack, ) { return net.minecraft.screen.ForgingScreenHandler.getSlotFor(stack.wrapperContained); }
// public yarnwrap.inventory.SimpleInventory createInputInventory(int size) { return new yarnwrap.inventory.SimpleInventory(wrapperContained.createInputInventory(size)); }
// public static yarnwrap.inventory.SimpleInventory createInputInventory(int size, ) { return new yarnwrap.inventory.SimpleInventory(net.minecraft.screen.ForgingScreenHandler.createInputInventory(size)); }
// public int getPlayerInventoryStartIndex() { return wrapperContained.getPlayerInventoryStartIndex(); }
// public static int getPlayerInventoryStartIndex() { return net.minecraft.screen.ForgingScreenHandler.getPlayerInventoryStartIndex(); }
public int getResultSlotIndex() { return wrapperContained.getResultSlotIndex(); }
// public static int getResultSlotIndex() { return net.minecraft.screen.ForgingScreenHandler.getResultSlotIndex(); }
// public int getPlayerInventoryEndIndex() { return wrapperContained.getPlayerInventoryEndIndex(); }
// public static int getPlayerInventoryEndIndex() { return net.minecraft.screen.ForgingScreenHandler.getPlayerInventoryEndIndex(); }
// public int getPlayerHotbarStartIndex() { return wrapperContained.getPlayerHotbarStartIndex(); }
// public static int getPlayerHotbarStartIndex() { return net.minecraft.screen.ForgingScreenHandler.getPlayerHotbarStartIndex(); }
// public int getPlayerHotbarEndIndex() { return wrapperContained.getPlayerHotbarEndIndex(); }
// public static int getPlayerHotbarEndIndex() { return net.minecraft.screen.ForgingScreenHandler.getPlayerHotbarEndIndex(); }

}