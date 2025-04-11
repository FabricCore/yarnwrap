package yarnwrap.screen;
public class SmithingScreenHandler { public net.minecraft.screen.SmithingScreenHandler wrapperContained; public SmithingScreenHandler(net.minecraft.screen.SmithingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.recipe.RecipeEntry currentRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.currentRecipe); }
// public void currentRecipe(yarnwrap.recipe.RecipeEntry value) { wrapperContained.currentRecipe = value.wrapperContained; }
// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
public int TEMPLATE_ID() { return wrapperContained.TEMPLATE_ID; }
// public void TEMPLATE_ID(int value) { wrapperContained.TEMPLATE_ID = value; }
public int EQUIPMENT_ID() { return wrapperContained.EQUIPMENT_ID; }
// public void EQUIPMENT_ID(int value) { wrapperContained.EQUIPMENT_ID = value; }
public int MATERIAL_ID() { return wrapperContained.MATERIAL_ID; }
// public void MATERIAL_ID(int value) { wrapperContained.MATERIAL_ID = value; }
public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
// public void OUTPUT_ID(int value) { wrapperContained.OUTPUT_ID = value; }
public int TEMPLATE_X() { return wrapperContained.TEMPLATE_X; }
// public void TEMPLATE_X(int value) { wrapperContained.TEMPLATE_X = value; }
public int EQUIPMENT_X() { return wrapperContained.EQUIPMENT_X; }
// public void EQUIPMENT_X(int value) { wrapperContained.EQUIPMENT_X = value; }
public int MATERIAL_X() { return wrapperContained.MATERIAL_X; }
// public void MATERIAL_X(int value) { wrapperContained.MATERIAL_X = value; }
public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public void SLOT_Y(int value) { wrapperContained.SLOT_Y = value; }
// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public void OUTPUT_X(int value) { wrapperContained.OUTPUT_X = value; }
public SmithingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory) { this.wrapperContained = new net.minecraft.screen.SmithingScreenHandler(syncId,playerInventory.wrapperContained); }
public SmithingScreenHandler(int syncId,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.screen.ScreenHandlerContext context) { this.wrapperContained = new net.minecraft.screen.SmithingScreenHandler(syncId,playerInventory.wrapperContained,context.wrapperContained); }
// public void method_24929(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.method_24929(world.wrapperContained,pos.wrapperContained); }
// public void decrementStack(int slot) { wrapperContained.decrementStack(slot); }
// public java.util.OptionalInt getQuickMoveSlot(yarnwrap.recipe.SmithingRecipe recipe,yarnwrap.item.ItemStack stack) { return wrapperContained.getQuickMoveSlot(recipe.wrapperContained,stack.wrapperContained); }
// public boolean method_48393(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48393(stack.wrapperContained); }
// public boolean method_48394(yarnwrap.item.ItemStack recipe) { return wrapperContained.method_48394(recipe.wrapperContained); }
// public boolean method_48395(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48395(stack.wrapperContained); }
// public boolean method_48396(yarnwrap.item.ItemStack stack) { return wrapperContained.method_48396(stack.wrapperContained); }
// public java.util.List getInputStacks() { return wrapperContained.getInputStacks(); }
// public boolean method_51713(yarnwrap.item.ItemStack recipe) { return wrapperContained.method_51713(recipe.wrapperContained); }
// public boolean method_51714(yarnwrap.item.ItemStack recipe) { return wrapperContained.method_51714(recipe.wrapperContained); }
// public java.util.stream.IntStream method_52562(yarnwrap.item.ItemStack recipe) { return wrapperContained.method_52562(recipe.wrapperContained); }
// public java.util.OptionalInt getQuickMoveSlot(yarnwrap.item.ItemStack stack) { return wrapperContained.getQuickMoveSlot(stack.wrapperContained); }
// public boolean method_52564(int slot) { return wrapperContained.method_52564(slot); }
// public yarnwrap.recipe.input.SmithingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.SmithingRecipeInput(wrapperContained.createRecipeInput()); }

}