package yarnwrap.screen;
public class StonecutterScreenHandler { public net.minecraft.screen.StonecutterScreenHandler wrapperContained; public StonecutterScreenHandler(net.minecraft.screen.StonecutterScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.slot.Slot inputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.inputSlot); }
// public void inputSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.inputSlot = value.wrapperContained; }
// public static yarnwrap.screen.slot.Slot inputSlot() { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.StonecutterScreenHandler.inputSlot); }
// public static void inputSlot(yarnwrap.screen.slot.Slot value, ) { net.minecraft.screen.StonecutterScreenHandler.inputSlot = value.wrapperContained; }

// public yarnwrap.screen.slot.Slot outputSlot() { return new yarnwrap.screen.slot.Slot(wrapperContained.outputSlot); }
// public void outputSlot(yarnwrap.screen.slot.Slot value) { wrapperContained.outputSlot = value.wrapperContained; }
// public static yarnwrap.screen.slot.Slot outputSlot() { return new yarnwrap.screen.slot.Slot(net.minecraft.screen.StonecutterScreenHandler.outputSlot); }
// public static void outputSlot(yarnwrap.screen.slot.Slot value, ) { net.minecraft.screen.StonecutterScreenHandler.outputSlot = value.wrapperContained; }

public yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(wrapperContained.input); }
// public void input(yarnwrap.inventory.Inventory value) { wrapperContained.input = value.wrapperContained; }
// public static yarnwrap.inventory.Inventory input() { return new yarnwrap.inventory.Inventory(net.minecraft.screen.StonecutterScreenHandler.input); }
// public static void input(yarnwrap.inventory.Inventory value, ) { net.minecraft.screen.StonecutterScreenHandler.input = value.wrapperContained; }

// public yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(wrapperContained.context); }
// public void context(yarnwrap.screen.ScreenHandlerContext value) { wrapperContained.context = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerContext context() { return new yarnwrap.screen.ScreenHandlerContext(net.minecraft.screen.StonecutterScreenHandler.context); }
// public static void context(yarnwrap.screen.ScreenHandlerContext value, ) { net.minecraft.screen.StonecutterScreenHandler.context = value.wrapperContained; }

// public yarnwrap.screen.Property selectedRecipe() { return new yarnwrap.screen.Property(wrapperContained.selectedRecipe); }
// public void selectedRecipe(yarnwrap.screen.Property value) { wrapperContained.selectedRecipe = value.wrapperContained; }
// public static yarnwrap.screen.Property selectedRecipe() { return new yarnwrap.screen.Property(net.minecraft.screen.StonecutterScreenHandler.selectedRecipe); }
// public static void selectedRecipe(yarnwrap.screen.Property value, ) { net.minecraft.screen.StonecutterScreenHandler.selectedRecipe = value.wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.screen.StonecutterScreenHandler.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.screen.StonecutterScreenHandler.world = value.wrapperContained; }

// public java.util.List availableRecipes() { return wrapperContained.availableRecipes; }
// public void availableRecipes(java.util.List value) { wrapperContained.availableRecipes = value; }
// public static java.util.List availableRecipes() { return net.minecraft.screen.StonecutterScreenHandler.availableRecipes; }
// public static void availableRecipes(java.util.List value, ) { net.minecraft.screen.StonecutterScreenHandler.availableRecipes = value; }

// public yarnwrap.item.ItemStack inputStack() { return new yarnwrap.item.ItemStack(wrapperContained.inputStack); }
// public void inputStack(yarnwrap.item.ItemStack value) { wrapperContained.inputStack = value.wrapperContained; }
// public static yarnwrap.item.ItemStack inputStack() { return new yarnwrap.item.ItemStack(net.minecraft.screen.StonecutterScreenHandler.inputStack); }
// public static void inputStack(yarnwrap.item.ItemStack value, ) { net.minecraft.screen.StonecutterScreenHandler.inputStack = value.wrapperContained; }

// public long lastTakeTime() { return wrapperContained.lastTakeTime; }
// public void lastTakeTime(long value) { wrapperContained.lastTakeTime = value; }
// public static long lastTakeTime() { return net.minecraft.screen.StonecutterScreenHandler.lastTakeTime; }
// public static void lastTakeTime(long value, ) { net.minecraft.screen.StonecutterScreenHandler.lastTakeTime = value; }

// public java.lang.Runnable contentsChangedListener() { return wrapperContained.contentsChangedListener; }
// public void contentsChangedListener(java.lang.Runnable value) { wrapperContained.contentsChangedListener = value; }
// public static java.lang.Runnable contentsChangedListener() { return net.minecraft.screen.StonecutterScreenHandler.contentsChangedListener; }
// public static void contentsChangedListener(java.lang.Runnable value, ) { net.minecraft.screen.StonecutterScreenHandler.contentsChangedListener = value; }

// public yarnwrap.inventory.CraftingResultInventory output() { return new yarnwrap.inventory.CraftingResultInventory(wrapperContained.output); }
// public void output(yarnwrap.inventory.CraftingResultInventory value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.inventory.CraftingResultInventory output() { return new yarnwrap.inventory.CraftingResultInventory(net.minecraft.screen.StonecutterScreenHandler.output); }
// public static void output(yarnwrap.inventory.CraftingResultInventory value, ) { net.minecraft.screen.StonecutterScreenHandler.output = value.wrapperContained; }

// public int INPUT_ID() { return wrapperContained.INPUT_ID; }
// public void INPUT_ID(int value) { wrapperContained.INPUT_ID = value; }
public static int INPUT_ID() { return net.minecraft.screen.StonecutterScreenHandler.INPUT_ID; }
// public static void INPUT_ID(int value, ) { net.minecraft.screen.StonecutterScreenHandler.INPUT_ID = value; }

// public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
public static int OUTPUT_ID() { return net.minecraft.screen.StonecutterScreenHandler.OUTPUT_ID; }
// public static void OUTPUT_ID(int value, ) { net.minecraft.screen.StonecutterScreenHandler.OUTPUT_ID = value; }

// public int INVENTORY_START() { return wrapperContained.INVENTORY_START; }
// public void INVENTORY_START(int value) { wrapperContained.INVENTORY_START = value; }
// public static int INVENTORY_START() { return net.minecraft.screen.StonecutterScreenHandler.INVENTORY_START; }
// public static void INVENTORY_START(int value, ) { net.minecraft.screen.StonecutterScreenHandler.INVENTORY_START = value; }

// public int INVENTORY_END() { return wrapperContained.INVENTORY_END; }
// public void INVENTORY_END(int value) { wrapperContained.INVENTORY_END = value; }
// public static int INVENTORY_END() { return net.minecraft.screen.StonecutterScreenHandler.INVENTORY_END; }
// public static void INVENTORY_END(int value, ) { net.minecraft.screen.StonecutterScreenHandler.INVENTORY_END = value; }

// public int OUTPUT_START() { return wrapperContained.OUTPUT_START; }
// public void OUTPUT_START(int value) { wrapperContained.OUTPUT_START = value; }
// public static int OUTPUT_START() { return net.minecraft.screen.StonecutterScreenHandler.OUTPUT_START; }
// public static void OUTPUT_START(int value, ) { net.minecraft.screen.StonecutterScreenHandler.OUTPUT_START = value; }

// public int OUTPUT_END() { return wrapperContained.OUTPUT_END; }
// public void OUTPUT_END(int value) { wrapperContained.OUTPUT_END = value; }
// public static int OUTPUT_END() { return net.minecraft.screen.StonecutterScreenHandler.OUTPUT_END; }
// public static void OUTPUT_END(int value, ) { net.minecraft.screen.StonecutterScreenHandler.OUTPUT_END = value; }

public StonecutterScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.StonecutterScreenHandler(syncId,playerInventory.wrapperContained); }
public StonecutterScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.StonecutterScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void updateInput(yarnwrap.inventory.Inventory input,yarnwrap.item.ItemStack stack) { wrapperContained.updateInput(input.wrapperContained,stack.wrapperContained); }
// public static void updateInput(yarnwrap.inventory.Inventory input,yarnwrap.item.ItemStack stack, ) { net.minecraft.screen.StonecutterScreenHandler.updateInput(input.wrapperContained,stack.wrapperContained); }
// public void method_17856(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos) { wrapperContained.method_17856(world.wrapperContained,pos.wrapperContained); }
// public static void method_17856(yarnwrap.entity.player.PlayerEntity world,yarnwrap.world.World pos, ) { net.minecraft.screen.StonecutterScreenHandler.method_17856(world.wrapperContained,pos.wrapperContained); }
public void setContentsChangedListener(java.lang.Runnable contentsChangedListener) { wrapperContained.setContentsChangedListener(contentsChangedListener); }
// public static void setContentsChangedListener(java.lang.Runnable contentsChangedListener, ) { net.minecraft.screen.StonecutterScreenHandler.setContentsChangedListener(contentsChangedListener); }
public int getSelectedRecipe() { return wrapperContained.getSelectedRecipe(); }
// public static int getSelectedRecipe() { return net.minecraft.screen.StonecutterScreenHandler.getSelectedRecipe(); }
public java.util.List getAvailableRecipes() { return wrapperContained.getAvailableRecipes(); }
// public static java.util.List getAvailableRecipes() { return net.minecraft.screen.StonecutterScreenHandler.getAvailableRecipes(); }
public int getAvailableRecipeCount() { return wrapperContained.getAvailableRecipeCount(); }
// public static int getAvailableRecipeCount() { return net.minecraft.screen.StonecutterScreenHandler.getAvailableRecipeCount(); }
public boolean canCraft() { return wrapperContained.canCraft(); }
// public static boolean canCraft() { return net.minecraft.screen.StonecutterScreenHandler.canCraft(); }
// public void populateResult() { wrapperContained.populateResult(); }
// public static void populateResult() { net.minecraft.screen.StonecutterScreenHandler.populateResult(); }
// public boolean isInBounds(int id) { return wrapperContained.isInBounds(id); }
// public static boolean isInBounds(int id, ) { return net.minecraft.screen.StonecutterScreenHandler.isInBounds(id); }
// public yarnwrap.recipe.input.SingleStackRecipeInput createRecipeInput(yarnwrap.inventory.Inventory inventory) { return new yarnwrap.recipe.input.SingleStackRecipeInput(wrapperContained.createRecipeInput(inventory.wrapperContained)); }
// public static yarnwrap.recipe.input.SingleStackRecipeInput createRecipeInput(yarnwrap.inventory.Inventory inventory, ) { return new yarnwrap.recipe.input.SingleStackRecipeInput(net.minecraft.screen.StonecutterScreenHandler.createRecipeInput(inventory.wrapperContained)); }

}