package yarnwrap.client.gui.screen.recipebook;
public class RecipeAlternativesWidget { public net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget wrapperContained; public RecipeAlternativesWidget(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int buttonY() { return wrapperContained.buttonY; }
// public yarnwrap.recipe.RecipeEntry lastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.lastClickedRecipe); }
// public int buttonX() { return wrapperContained.buttonX; }
// public java.util.List alternativeButtons() { return wrapperContained.alternativeButtons; }
// public boolean visible() { return wrapperContained.visible; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public float time() { return wrapperContained.time; }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.resultCollection); }
// public boolean furnace() { return wrapperContained.furnace; }
// public yarnwrap.util.Identifier OVERLAY_RECIPE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_RECIPE_TEXTURE); }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_TEXTURE); }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_TEXTURE); }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_DISABLED_TEXTURE); }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE); }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_DISABLED_TEXTURE); }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection getResults() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.getResults()); }
public yarnwrap.recipe.RecipeEntry getLastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getLastClickedRecipe()); }
public boolean isVisible() { return wrapperContained.isVisible(); }
public void showAlternativesForResult(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.recipebook.RecipeResultCollection results,int buttonX,int buttonY,int areaCenterX,int areaCenterY,float delta) { wrapperContained.showAlternativesForResult(client.wrapperContained,results.wrapperContained,buttonX,buttonY,areaCenterX,areaCenterY,delta); }

}