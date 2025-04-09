package yarnwrap.screen;
public class SmithingScreenHandler { public net.minecraft.screen.SmithingScreenHandler wrapperContained; public SmithingScreenHandler(net.minecraft.screen.SmithingScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public yarnwrap.recipe.RecipeEntry currentRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.currentRecipe); }
// public java.util.List recipes() { return wrapperContained.recipes; }
public int TEMPLATE_ID() { return wrapperContained.TEMPLATE_ID; }
public int EQUIPMENT_ID() { return wrapperContained.EQUIPMENT_ID; }
public int MATERIAL_ID() { return wrapperContained.MATERIAL_ID; }
public int OUTPUT_ID() { return wrapperContained.OUTPUT_ID; }
public int TEMPLATE_X() { return wrapperContained.TEMPLATE_X; }
public int EQUIPMENT_X() { return wrapperContained.EQUIPMENT_X; }
public int MATERIAL_X() { return wrapperContained.MATERIAL_X; }
public int SLOT_Y() { return wrapperContained.SLOT_Y; }
// public int OUTPUT_X() { return wrapperContained.OUTPUT_X; }
// public void decrementStack(int slot) { wrapperContained.decrementStack(slot); }
// public java.util.OptionalInt getQuickMoveSlot(yarnwrap.recipe.SmithingRecipe recipe,yarnwrap.item.ItemStack stack) { return wrapperContained.getQuickMoveSlot(recipe.wrapperContained,stack.wrapperContained); }
// public java.util.List getInputStacks() { return wrapperContained.getInputStacks(); }
// public java.util.OptionalInt getQuickMoveSlot(yarnwrap.item.ItemStack stack) { return wrapperContained.getQuickMoveSlot(stack.wrapperContained); }
// public yarnwrap.recipe.input.SmithingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.SmithingRecipeInput(wrapperContained.createRecipeInput()); }

}