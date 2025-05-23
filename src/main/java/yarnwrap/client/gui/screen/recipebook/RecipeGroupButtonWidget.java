package yarnwrap.client.gui.screen.recipebook;
public class RecipeGroupButtonWidget { public net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget wrapperContained; public RecipeGroupButtonWidget(net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public float bounce() { return wrapperContained.bounce; }
// public void bounce(float value) { wrapperContained.bounce = value; }
// public static float bounce() { return net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.bounce; }
// public static void bounce(float value, ) { net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.bounce = value; }

// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.TEXTURES); }
// public static void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value, ) { net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.TEXTURES = value.wrapperContained; }

// public Object tab() { return wrapperContained.tab; }
// // public void tab(Object value) { wrapperContained.tab = value; }
// // public static Object tab() { return net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.tab; }
// // public static void tab(Object value, ) { net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.tab = value; }

// public RecipeGroupButtonWidget(Object tab) { this.wrapperContained = new net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget(tab); }
// public void renderIcons(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderIcons(context.wrapperContained); }
// public static void renderIcons(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.renderIcons(context.wrapperContained); }
public void checkForNewRecipes(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,boolean filteringCraftable) { wrapperContained.checkForNewRecipes(recipeBook.wrapperContained,filteringCraftable); }
// public static void checkForNewRecipes(yarnwrap.client.recipebook.ClientRecipeBook recipeBook,boolean filteringCraftable, ) { net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.checkForNewRecipes(recipeBook.wrapperContained,filteringCraftable); }
public yarnwrap.recipe.book.RecipeBookGroup getCategory() { return new yarnwrap.recipe.book.RecipeBookGroup(wrapperContained.getCategory()); }
// public static yarnwrap.recipe.book.RecipeBookGroup getCategory() { return new yarnwrap.recipe.book.RecipeBookGroup(net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.getCategory()); }
public boolean hasKnownRecipes(yarnwrap.client.recipebook.ClientRecipeBook recipeBook) { return wrapperContained.hasKnownRecipes(recipeBook.wrapperContained); }
// public static boolean hasKnownRecipes(yarnwrap.client.recipebook.ClientRecipeBook recipeBook, ) { return net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget.hasKnownRecipes(recipeBook.wrapperContained); }

}