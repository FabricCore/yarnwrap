package yarnwrap.client.gui.screen.recipebook;
public class RecipeDisplayListener { public net.minecraft.client.gui.screen.recipebook.RecipeDisplayListener wrapperContained; public RecipeDisplayListener(net.minecraft.client.gui.screen.recipebook.RecipeDisplayListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onRecipesDisplayed(java.util.List recipes) { wrapperContained.onRecipesDisplayed(recipes); }
// public static void onRecipesDisplayed(java.util.List recipes, ) { net.minecraft.client.gui.screen.recipebook.RecipeDisplayListener.onRecipesDisplayed(recipes); }

}