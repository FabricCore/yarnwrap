package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookProvider { public net.minecraft.client.gui.screen.recipebook.RecipeBookProvider wrapperContained; public RecipeBookProvider(net.minecraft.client.gui.screen.recipebook.RecipeBookProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public void refreshRecipeBook() { wrapperContained.refreshRecipeBook(); }
public yarnwrap.client.gui.screen.recipebook.RecipeBookWidget getRecipeBookWidget() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(wrapperContained.getRecipeBookWidget()); }

}