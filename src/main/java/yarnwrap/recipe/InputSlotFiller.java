package yarnwrap.recipe;
public class InputSlotFiller { public net.minecraft.recipe.InputSlotFiller wrapperContained; public InputSlotFiller(net.minecraft.recipe.InputSlotFiller wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeMatcher matcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.matcher); }
// public void matcher(yarnwrap.recipe.RecipeMatcher value) { wrapperContained.matcher = value.wrapperContained; }
// public static yarnwrap.recipe.RecipeMatcher matcher() { return new yarnwrap.recipe.RecipeMatcher(net.minecraft.recipe.InputSlotFiller.matcher); }
// public static void matcher(yarnwrap.recipe.RecipeMatcher value, ) { net.minecraft.recipe.InputSlotFiller.matcher = value.wrapperContained; }

// public yarnwrap.screen.AbstractRecipeScreenHandler handler() { return new yarnwrap.screen.AbstractRecipeScreenHandler(wrapperContained.handler); }
// public void handler(yarnwrap.screen.AbstractRecipeScreenHandler value) { wrapperContained.handler = value.wrapperContained; }
// public static yarnwrap.screen.AbstractRecipeScreenHandler handler() { return new yarnwrap.screen.AbstractRecipeScreenHandler(net.minecraft.recipe.InputSlotFiller.handler); }
// public static void handler(yarnwrap.screen.AbstractRecipeScreenHandler value, ) { net.minecraft.recipe.InputSlotFiller.handler = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.entity.player.PlayerInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(net.minecraft.recipe.InputSlotFiller.inventory); }
// public static void inventory(yarnwrap.entity.player.PlayerInventory value, ) { net.minecraft.recipe.InputSlotFiller.inventory = value.wrapperContained; }

public InputSlotFiller(yarnwrap.screen.AbstractRecipeScreenHandler handler) { this.wrapperContained = new net.minecraft.recipe.InputSlotFiller(handler.wrapperContained); }
// public int getAmountToFill(boolean craftAll,int limit,boolean recipeInCraftingSlots) { return wrapperContained.getAmountToFill(craftAll,limit,recipeInCraftingSlots); }
// public static int getAmountToFill(boolean craftAll,int limit,boolean recipeInCraftingSlots, ) { return net.minecraft.recipe.InputSlotFiller.getAmountToFill(craftAll,limit,recipeInCraftingSlots); }
// public void fillInputSlots(yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { wrapperContained.fillInputSlots(recipe.wrapperContained,craftAll); }
// public static void fillInputSlots(yarnwrap.recipe.RecipeEntry recipe,boolean craftAll, ) { net.minecraft.recipe.InputSlotFiller.fillInputSlots(recipe.wrapperContained,craftAll); }
// public void returnInputs() { wrapperContained.returnInputs(); }
// public static void returnInputs() { net.minecraft.recipe.InputSlotFiller.returnInputs(); }
// public int getFreeInventorySlots() { return wrapperContained.getFreeInventorySlots(); }
// public static int getFreeInventorySlots() { return net.minecraft.recipe.InputSlotFiller.getFreeInventorySlots(); }
// public int fillInputSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack) { return wrapperContained.fillInputSlot(slot.wrapperContained,stack.wrapperContained); }
// public static int fillInputSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.InputSlotFiller.fillInputSlot(slot.wrapperContained,stack.wrapperContained); }
// public boolean canReturnInputs() { return wrapperContained.canReturnInputs(); }
// public static boolean canReturnInputs() { return net.minecraft.recipe.InputSlotFiller.canReturnInputs(); }
public void fillInputSlots(yarnwrap.server.network.ServerPlayerEntity entity,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { wrapperContained.fillInputSlots(entity.wrapperContained,recipe.wrapperContained,craftAll); }
// public static void fillInputSlots(yarnwrap.server.network.ServerPlayerEntity entity,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll, ) { net.minecraft.recipe.InputSlotFiller.fillInputSlots(entity.wrapperContained,recipe.wrapperContained,craftAll); }

}