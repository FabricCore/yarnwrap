package yarnwrap.client.gui.screen.recipebook;
public class RecipeGroupButtonWidget { public net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget wrapperContained; public RecipeGroupButtonWidget(net.minecraft.client.gui.screen.recipebook.RecipeGroupButtonWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public float bounce() { return wrapperContained.bounce; }
// public void bounce(float value) { wrapperContained.bounce = value; }
// public yarnwrap.client.recipebook.RecipeBookGroup category() { return new yarnwrap.client.recipebook.RecipeBookGroup(wrapperContained.category); }
// public void category(yarnwrap.client.recipebook.RecipeBookGroup value) { wrapperContained.category = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
// public void renderIcons(yarnwrap.client.gui.DrawContext context,yarnwrap.client.render.item.ItemRenderer itemRenderer) { wrapperContained.renderIcons(context.wrapperContained,itemRenderer.wrapperContained); }
public void checkForNewRecipes(yarnwrap.client.MinecraftClient client) { wrapperContained.checkForNewRecipes(client.wrapperContained); }
public yarnwrap.client.recipebook.RecipeBookGroup getCategory() { return new yarnwrap.client.recipebook.RecipeBookGroup(wrapperContained.getCategory()); }
public boolean hasKnownRecipes(yarnwrap.client.recipebook.ClientRecipeBook recipeBook) { return wrapperContained.hasKnownRecipes(recipeBook.wrapperContained); }

}