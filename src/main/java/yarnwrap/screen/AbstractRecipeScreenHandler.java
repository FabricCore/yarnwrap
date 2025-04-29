package yarnwrap.screen;
public class AbstractRecipeScreenHandler { public net.minecraft.screen.AbstractRecipeScreenHandler wrapperContained; public AbstractRecipeScreenHandler(net.minecraft.screen.AbstractRecipeScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void fillInputSlots(boolean craftAll,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.fillInputSlots(craftAll,recipe.wrapperContained,player.wrapperContained); }
// public static void fillInputSlots(boolean craftAll,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.screen.AbstractRecipeScreenHandler.fillInputSlots(craftAll,recipe.wrapperContained,player.wrapperContained); }
public yarnwrap.recipe.book.RecipeBookCategory getCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(wrapperContained.getCategory()); }
// public static yarnwrap.recipe.book.RecipeBookCategory getCategory() { return new yarnwrap.recipe.book.RecipeBookCategory(net.minecraft.screen.AbstractRecipeScreenHandler.getCategory()); }
public boolean canInsertIntoSlot(int index) { return wrapperContained.canInsertIntoSlot(index); }
// public static boolean canInsertIntoSlot(int index, ) { return net.minecraft.screen.AbstractRecipeScreenHandler.canInsertIntoSlot(index); }
// public void onInputSlotFillStart() { wrapperContained.onInputSlotFillStart(); }
// public static void onInputSlotFillStart() { net.minecraft.screen.AbstractRecipeScreenHandler.onInputSlotFillStart(); }
// public void onInputSlotFillFinish(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.onInputSlotFillFinish(recipe.wrapperContained); }
// public static void onInputSlotFillFinish(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.screen.AbstractRecipeScreenHandler.onInputSlotFillFinish(recipe.wrapperContained); }
public boolean matches(yarnwrap.recipe.RecipeEntry recipe) { return wrapperContained.matches(recipe.wrapperContained); }
// public static boolean matches(yarnwrap.recipe.RecipeEntry recipe, ) { return net.minecraft.screen.AbstractRecipeScreenHandler.matches(recipe.wrapperContained); }
public int getCraftingWidth() { return wrapperContained.getCraftingWidth(); }
// public static int getCraftingWidth() { return net.minecraft.screen.AbstractRecipeScreenHandler.getCraftingWidth(); }
public void populateRecipeFinder(yarnwrap.recipe.RecipeMatcher finder) { wrapperContained.populateRecipeFinder(finder.wrapperContained); }
// public static void populateRecipeFinder(yarnwrap.recipe.RecipeMatcher finder, ) { net.minecraft.screen.AbstractRecipeScreenHandler.populateRecipeFinder(finder.wrapperContained); }
public int getCraftingResultSlotIndex() { return wrapperContained.getCraftingResultSlotIndex(); }
// public static int getCraftingResultSlotIndex() { return net.minecraft.screen.AbstractRecipeScreenHandler.getCraftingResultSlotIndex(); }
public int getCraftingHeight() { return wrapperContained.getCraftingHeight(); }
// public static int getCraftingHeight() { return net.minecraft.screen.AbstractRecipeScreenHandler.getCraftingHeight(); }
public void clearCraftingSlots() { wrapperContained.clearCraftingSlots(); }
// public static void clearCraftingSlots() { net.minecraft.screen.AbstractRecipeScreenHandler.clearCraftingSlots(); }
public int getCraftingSlotCount() { return wrapperContained.getCraftingSlotCount(); }
// public static int getCraftingSlotCount() { return net.minecraft.screen.AbstractRecipeScreenHandler.getCraftingSlotCount(); }

}