package yarnwrap.recipe;
public class InputSlotFiller { public net.minecraft.recipe.InputSlotFiller wrapperContained; public InputSlotFiller(net.minecraft.recipe.InputSlotFiller wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeMatcher matcher() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.matcher); }
// public void matcher(yarnwrap.recipe.RecipeMatcher value) { wrapperContained.matcher = value.wrapperContained; }
// public yarnwrap.screen.AbstractRecipeScreenHandler handler() { return new yarnwrap.screen.AbstractRecipeScreenHandler(wrapperContained.handler); }
// public void handler(yarnwrap.screen.AbstractRecipeScreenHandler value) { wrapperContained.handler = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerInventory inventory() { return new yarnwrap.entity.player.PlayerInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.entity.player.PlayerInventory value) { wrapperContained.inventory = value.wrapperContained; }
public InputSlotFiller(yarnwrap.screen.AbstractRecipeScreenHandler handler) { this.wrapperContained = new net.minecraft.recipe.InputSlotFiller(handler.wrapperContained); }
// public int getAmountToFill(boolean craftAll,int limit,boolean recipeInCraftingSlots) { return wrapperContained.getAmountToFill(craftAll,limit,recipeInCraftingSlots); }
// public void fillInputSlots(yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { wrapperContained.fillInputSlots(recipe.wrapperContained,craftAll); }
// public void returnInputs() { wrapperContained.returnInputs(); }
// public int getFreeInventorySlots() { return wrapperContained.getFreeInventorySlots(); }
// public int fillInputSlot(yarnwrap.screen.slot.Slot slot,yarnwrap.item.ItemStack stack) { return wrapperContained.fillInputSlot(slot.wrapperContained,stack.wrapperContained); }
// public boolean canReturnInputs() { return wrapperContained.canReturnInputs(); }
public void fillInputSlots(yarnwrap.server.network.ServerPlayerEntity entity,yarnwrap.recipe.RecipeEntry recipe,boolean craftAll) { wrapperContained.fillInputSlots(entity.wrapperContained,recipe.wrapperContained,craftAll); }

}