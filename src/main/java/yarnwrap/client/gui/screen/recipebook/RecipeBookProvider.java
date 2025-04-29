package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookProvider { public net.minecraft.client.gui.screen.recipebook.RecipeBookProvider wrapperContained; public RecipeBookProvider(net.minecraft.client.gui.screen.recipebook.RecipeBookProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public void refreshRecipeBook() { wrapperContained.refreshRecipeBook(); }
// public static void refreshRecipeBook() { net.minecraft.client.gui.screen.recipebook.RecipeBookProvider.refreshRecipeBook(); }
public yarnwrap.client.gui.screen.recipebook.RecipeBookWidget getRecipeBookWidget() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(wrapperContained.getRecipeBookWidget()); }
// public static yarnwrap.client.gui.screen.recipebook.RecipeBookWidget getRecipeBookWidget() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(net.minecraft.client.gui.screen.recipebook.RecipeBookProvider.getRecipeBookWidget()); }

}