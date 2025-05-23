package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookProvider { public net.minecraft.client.gui.screen.recipebook.RecipeBookProvider wrapperContained; public RecipeBookProvider(net.minecraft.client.gui.screen.recipebook.RecipeBookProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public void refreshRecipeBook() { wrapperContained.refreshRecipeBook(); }
// public static void refreshRecipeBook() { net.minecraft.client.gui.screen.recipebook.RecipeBookProvider.refreshRecipeBook(); }
public void onCraftFailed(yarnwrap.recipe.display.RecipeDisplay display) { wrapperContained.onCraftFailed(display.wrapperContained); }
// public static void onCraftFailed(yarnwrap.recipe.display.RecipeDisplay display, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookProvider.onCraftFailed(display.wrapperContained); }

}