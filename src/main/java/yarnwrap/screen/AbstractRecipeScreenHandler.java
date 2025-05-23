package yarnwrap.screen;
public class AbstractRecipeScreenHandler { public net.minecraft.screen.AbstractRecipeScreenHandler wrapperContained; public AbstractRecipeScreenHandler(net.minecraft.screen.AbstractRecipeScreenHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void populateRecipeFinder(yarnwrap.recipe.RecipeFinder finder) { wrapperContained.populateRecipeFinder(finder.wrapperContained); }
// public static void populateRecipeFinder(yarnwrap.recipe.RecipeFinder finder, ) { net.minecraft.screen.AbstractRecipeScreenHandler.populateRecipeFinder(finder.wrapperContained); }
public Object fillInputSlots(boolean craftAll,boolean creative,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.player.PlayerInventory inventory) { return wrapperContained.fillInputSlots(craftAll,creative,recipe.wrapperContained,world.wrapperContained,inventory.wrapperContained); }
// public static Object fillInputSlots(boolean craftAll,boolean creative,yarnwrap.recipe.RecipeEntry recipe,yarnwrap.server.world.ServerWorld world,yarnwrap.entity.player.PlayerInventory inventory, ) { return net.minecraft.screen.AbstractRecipeScreenHandler.fillInputSlots(craftAll,creative,recipe.wrapperContained,world.wrapperContained,inventory.wrapperContained); }
public yarnwrap.recipe.book.RecipeBookType getCategory() { return new yarnwrap.recipe.book.RecipeBookType(wrapperContained.getCategory()); }
// public static yarnwrap.recipe.book.RecipeBookType getCategory() { return new yarnwrap.recipe.book.RecipeBookType(net.minecraft.screen.AbstractRecipeScreenHandler.getCategory()); }

}