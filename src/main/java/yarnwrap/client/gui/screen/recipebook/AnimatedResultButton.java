package yarnwrap.client.gui.screen.recipebook;
public class AnimatedResultButton { public net.minecraft.client.gui.screen.recipebook.AnimatedResultButton wrapperContained; public AnimatedResultButton(net.minecraft.client.gui.screen.recipebook.AnimatedResultButton wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text MORE_RECIPES_TEXT() { return new yarnwrap.text.Text(wrapperContained.MORE_RECIPES_TEXT); }
// public void MORE_RECIPES_TEXT(yarnwrap.text.Text value) { wrapperContained.MORE_RECIPES_TEXT = value.wrapperContained; }
// public yarnwrap.screen.AbstractRecipeScreenHandler craftingScreenHandler() { return new yarnwrap.screen.AbstractRecipeScreenHandler(wrapperContained.craftingScreenHandler); }
// public void craftingScreenHandler(yarnwrap.screen.AbstractRecipeScreenHandler value) { wrapperContained.craftingScreenHandler = value.wrapperContained; }
// public yarnwrap.recipe.book.RecipeBook recipeBook() { return new yarnwrap.recipe.book.RecipeBook(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.recipe.book.RecipeBook value) { wrapperContained.recipeBook = value.wrapperContained; }
// public float bounce() { return wrapperContained.bounce; }
// public void bounce(float value) { wrapperContained.bounce = value; }
// public float time() { return wrapperContained.time; }
// public void time(float value) { wrapperContained.time = value; }
// public int currentResultIndex() { return wrapperContained.currentResultIndex; }
// public void currentResultIndex(int value) { wrapperContained.currentResultIndex = value; }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.resultCollection); }
// public void resultCollection(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value) { wrapperContained.resultCollection = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_MANY_CRAFTABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_MANY_CRAFTABLE_TEXTURE); }
// public void SLOT_MANY_CRAFTABLE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_MANY_CRAFTABLE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_CRAFTABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_CRAFTABLE_TEXTURE); }
// public void SLOT_CRAFTABLE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_CRAFTABLE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_MANY_UNCRAFTABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_MANY_UNCRAFTABLE_TEXTURE); }
// public void SLOT_MANY_UNCRAFTABLE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_MANY_UNCRAFTABLE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_UNCRAFTABLE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_UNCRAFTABLE_TEXTURE); }
// public void SLOT_UNCRAFTABLE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_UNCRAFTABLE_TEXTURE = value.wrapperContained; }
// public java.util.List getResults() { return wrapperContained.getResults(); }
public void showResultCollection(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection,yarnwrap.client.gui.screen.recipebook.RecipeBookResults results) { wrapperContained.showResultCollection(resultCollection.wrapperContained,results.wrapperContained); }
public boolean hasResults() { return wrapperContained.hasResults(); }
public yarnwrap.recipe.RecipeEntry currentRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.currentRecipe()); }
public java.util.List getTooltip() { return wrapperContained.getTooltip(); }
public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection getResultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.getResultCollection()); }

}