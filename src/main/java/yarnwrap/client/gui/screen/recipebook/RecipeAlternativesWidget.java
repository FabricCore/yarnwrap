package yarnwrap.client.gui.screen.recipebook;
public class RecipeAlternativesWidget { public net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget wrapperContained; public RecipeAlternativesWidget(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int buttonY() { return wrapperContained.buttonY; }
// public void buttonY(int value) { wrapperContained.buttonY = value; }
// public static int buttonY() { return net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.buttonY; }
// public static void buttonY(int value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.buttonY = value; }

// public yarnwrap.recipe.NetworkRecipeId lastClickedRecipe() { return new yarnwrap.recipe.NetworkRecipeId(wrapperContained.lastClickedRecipe); }
// public void lastClickedRecipe(yarnwrap.recipe.NetworkRecipeId value) { wrapperContained.lastClickedRecipe = value.wrapperContained; }
// public static yarnwrap.recipe.NetworkRecipeId lastClickedRecipe() { return new yarnwrap.recipe.NetworkRecipeId(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.lastClickedRecipe); }
// public static void lastClickedRecipe(yarnwrap.recipe.NetworkRecipeId value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.lastClickedRecipe = value.wrapperContained; }

// public int buttonX() { return wrapperContained.buttonX; }
// public void buttonX(int value) { wrapperContained.buttonX = value; }
// public static int buttonX() { return net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.buttonX; }
// public static void buttonX(int value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.buttonX = value; }

// public java.util.List alternativeButtons() { return wrapperContained.alternativeButtons; }
// public void alternativeButtons(java.util.List value) { wrapperContained.alternativeButtons = value; }
// public static java.util.List alternativeButtons() { return net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.alternativeButtons; }
// public static void alternativeButtons(java.util.List value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.alternativeButtons = value; }

// public boolean visible() { return wrapperContained.visible; }
// public void visible(boolean value) { wrapperContained.visible = value; }
// public static boolean visible() { return net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.visible; }
// public static void visible(boolean value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.visible = value; }

// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.resultCollection); }
// public void resultCollection(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value) { wrapperContained.resultCollection = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.resultCollection); }
// public static void resultCollection(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.resultCollection = value.wrapperContained; }

// public boolean furnace() { return wrapperContained.furnace; }
// public void furnace(boolean value) { wrapperContained.furnace = value; }
// public static boolean furnace() { return net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.furnace; }
// public static void furnace(boolean value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.furnace = value; }

// public yarnwrap.util.Identifier OVERLAY_RECIPE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_RECIPE_TEXTURE); }
// public void OVERLAY_RECIPE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.OVERLAY_RECIPE_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier OVERLAY_RECIPE_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.OVERLAY_RECIPE_TEXTURE); }
// public static void OVERLAY_RECIPE_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.OVERLAY_RECIPE_TEXTURE = value.wrapperContained; }

// public yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider currentIndexProvider() { return new yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider(wrapperContained.currentIndexProvider); }
// public void currentIndexProvider(yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider value) { wrapperContained.currentIndexProvider = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider currentIndexProvider() { return new yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.currentIndexProvider); }
// public static void currentIndexProvider(yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider value, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.currentIndexProvider = value.wrapperContained; }

public RecipeAlternativesWidget(yarnwrap.client.gui.screen.recipebook.CurrentIndexProvider currentIndexProvider,boolean furnace) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget(currentIndexProvider.wrapperContained,furnace); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
// public static void setVisible(boolean visible, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.setVisible(visible); }
public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection getResults() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.getResults()); }
// public static yarnwrap.client.gui.screen.recipebook.RecipeResultCollection getResults() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.getResults()); }
public yarnwrap.recipe.NetworkRecipeId getLastClickedRecipe() { return new yarnwrap.recipe.NetworkRecipeId(wrapperContained.getLastClickedRecipe()); }
// public static yarnwrap.recipe.NetworkRecipeId getLastClickedRecipe() { return new yarnwrap.recipe.NetworkRecipeId(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.getLastClickedRecipe()); }
public boolean isVisible() { return wrapperContained.isVisible(); }
// public static boolean isVisible() { return net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.isVisible(); }
public void showAlternativesForResult(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection,yarnwrap.util.context.ContextParameterMap context,boolean filteringCraftable,int buttonX,int buttonY,int areaCenterX,int areaCenterY,float delta) { wrapperContained.showAlternativesForResult(resultCollection.wrapperContained,context.wrapperContained,filteringCraftable,buttonX,buttonY,areaCenterX,areaCenterY,delta); }
// public static void showAlternativesForResult(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection,yarnwrap.util.context.ContextParameterMap context,boolean filteringCraftable,int buttonX,int buttonY,int areaCenterX,int areaCenterY,float delta, ) { net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget.showAlternativesForResult(resultCollection.wrapperContained,context.wrapperContained,filteringCraftable,buttonX,buttonY,areaCenterX,areaCenterY,delta); }

}