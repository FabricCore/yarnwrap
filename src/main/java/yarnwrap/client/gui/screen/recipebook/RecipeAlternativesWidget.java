package yarnwrap.client.gui.screen.recipebook;
public class RecipeAlternativesWidget { public net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget wrapperContained; public RecipeAlternativesWidget(net.minecraft.client.gui.screen.recipebook.RecipeAlternativesWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int buttonY() { return wrapperContained.buttonY; }
// public void buttonY(int value) { wrapperContained.buttonY = value; }
// public yarnwrap.recipe.RecipeEntry lastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.lastClickedRecipe); }
// public void lastClickedRecipe(yarnwrap.recipe.RecipeEntry value) { wrapperContained.lastClickedRecipe = value.wrapperContained; }
// public int buttonX() { return wrapperContained.buttonX; }
// public void buttonX(int value) { wrapperContained.buttonX = value; }
// public java.util.List alternativeButtons() { return wrapperContained.alternativeButtons; }
// public void alternativeButtons(java.util.List value) { wrapperContained.alternativeButtons = value; }
// public boolean visible() { return wrapperContained.visible; }
// public void visible(boolean value) { wrapperContained.visible = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public float time() { return wrapperContained.time; }
// public void time(float value) { wrapperContained.time = value; }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.resultCollection); }
// public void resultCollection(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value) { wrapperContained.resultCollection = value.wrapperContained; }
// public boolean furnace() { return wrapperContained.furnace; }
// public void furnace(boolean value) { wrapperContained.furnace = value; }
// public yarnwrap.util.Identifier OVERLAY_RECIPE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OVERLAY_RECIPE_TEXTURE); }
// public void OVERLAY_RECIPE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.OVERLAY_RECIPE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_HIGHLIGHTED_TEXTURE); }
// public void FURNACE_OVERLAY_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FURNACE_OVERLAY_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_TEXTURE); }
// public void FURNACE_OVERLAY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FURNACE_OVERLAY_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_HIGHLIGHTED_TEXTURE); }
// public void CRAFTING_OVERLAY_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CRAFTING_OVERLAY_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_TEXTURE); }
// public void CRAFTING_OVERLAY_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CRAFTING_OVERLAY_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE); }
// public void FURNACE_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FURNACE_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier FURNACE_OVERLAY_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.FURNACE_OVERLAY_DISABLED_TEXTURE); }
// public void FURNACE_OVERLAY_DISABLED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.FURNACE_OVERLAY_DISABLED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE); }
// public void CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CRAFTING_OVERLAY_DISABLED_HIGHLIGHTED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier CRAFTING_OVERLAY_DISABLED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CRAFTING_OVERLAY_DISABLED_TEXTURE); }
// public void CRAFTING_OVERLAY_DISABLED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CRAFTING_OVERLAY_DISABLED_TEXTURE = value.wrapperContained; }
public void setVisible(boolean visible) { wrapperContained.setVisible(visible); }
public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection getResults() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.getResults()); }
public yarnwrap.recipe.RecipeEntry getLastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getLastClickedRecipe()); }
public boolean isVisible() { return wrapperContained.isVisible(); }
public void showAlternativesForResult(yarnwrap.client.MinecraftClient client,yarnwrap.client.gui.screen.recipebook.RecipeResultCollection results,int buttonX,int buttonY,int areaCenterX,int areaCenterY,float delta) { wrapperContained.showAlternativesForResult(client.wrapperContained,results.wrapperContained,buttonX,buttonY,areaCenterX,areaCenterY,delta); }

}