package yarnwrap.client.gui.screen.recipebook;
public class AbstractFurnaceRecipeBookScreen { public net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen wrapperContained; public AbstractFurnaceRecipeBookScreen(net.minecraft.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient fuels() { return new yarnwrap.recipe.Ingredient(wrapperContained.fuels); }
// public void fuels(yarnwrap.recipe.Ingredient value) { wrapperContained.fuels = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ButtonTextures TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.TEXTURES); }
// public void TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.TEXTURES = value.wrapperContained; }
// public java.util.Set getAllowedFuels() { return wrapperContained.getAllowedFuels(); }
// public boolean method_49301(yarnwrap.item.Item item) { return wrapperContained.method_49301(item.wrapperContained); }

}