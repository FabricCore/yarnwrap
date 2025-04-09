package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookResults { public net.minecraft.client.gui.screen.recipebook.RecipeBookResults wrapperContained; public RecipeBookResults(net.minecraft.client.gui.screen.recipebook.RecipeBookResults wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pageCount() { return wrapperContained.pageCount; }
// public yarnwrap.recipe.RecipeEntry lastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.lastClickedRecipe); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.List resultCollections() { return wrapperContained.resultCollections; }
// public yarnwrap.client.gui.widget.ToggleButtonWidget nextPageButton() { return new yarnwrap.client.gui.widget.ToggleButtonWidget(wrapperContained.nextPageButton); }
// public yarnwrap.client.gui.screen.recipebook.AnimatedResultButton hoveredResultButton() { return new yarnwrap.client.gui.screen.recipebook.AnimatedResultButton(wrapperContained.hoveredResultButton); }
// public yarnwrap.client.gui.widget.ToggleButtonWidget prevPageButton() { return new yarnwrap.client.gui.widget.ToggleButtonWidget(wrapperContained.prevPageButton); }
// public java.util.List resultButtons() { return wrapperContained.resultButtons; }
// public yarnwrap.client.gui.screen.recipebook.RecipeAlternativesWidget alternatesWidget() { return new yarnwrap.client.gui.screen.recipebook.RecipeAlternativesWidget(wrapperContained.alternatesWidget); }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.resultCollection); }
// public java.util.List recipeDisplayListeners() { return wrapperContained.recipeDisplayListeners; }
// public int currentPage() { return wrapperContained.currentPage; }
// public yarnwrap.recipe.book.RecipeBook recipeBook() { return new yarnwrap.recipe.book.RecipeBook(wrapperContained.recipeBook); }
// public yarnwrap.client.gui.screen.ButtonTextures PAGE_FORWARD_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.PAGE_FORWARD_TEXTURES); }
// public yarnwrap.client.gui.screen.ButtonTextures PAGE_BACKWARD_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.PAGE_BACKWARD_TEXTURES); }
// public void refreshResultButtons() { wrapperContained.refreshResultButtons(); }
// public void hideShowPageButtons() { wrapperContained.hideShowPageButtons(); }
public void setResults(java.util.List resultCollections,boolean resetCurrentPage) { wrapperContained.setResults(resultCollections,resetCurrentPage); }
public void drawTooltip(yarnwrap.client.gui.DrawContext context,int x,int y) { wrapperContained.drawTooltip(context.wrapperContained,x,y); }
public void onRecipesDisplayed(java.util.List recipes) { wrapperContained.onRecipesDisplayed(recipes); }
public void setGui(yarnwrap.client.gui.screen.recipebook.RecipeBookWidget widget) { wrapperContained.setGui(widget.wrapperContained); }
public yarnwrap.recipe.RecipeEntry getLastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getLastClickedRecipe()); }
public boolean mouseClicked(double mouseX,double mouseY,int button,int areaLeft,int areaTop,int areaWidth,int areaHeight) { return wrapperContained.mouseClicked(mouseX,mouseY,button,areaLeft,areaTop,areaWidth,areaHeight); }
public yarnwrap.recipe.book.RecipeBook getRecipeBook() { return new yarnwrap.recipe.book.RecipeBook(wrapperContained.getRecipeBook()); }
public void draw(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY,float delta) { wrapperContained.draw(context.wrapperContained,x,y,mouseX,mouseY,delta); }
public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection getLastClickedResults() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.getLastClickedResults()); }
public void initialize(yarnwrap.client.MinecraftClient client,int parentLeft,int parentTop) { wrapperContained.initialize(client.wrapperContained,parentLeft,parentTop); }
public yarnwrap.client.MinecraftClient getClient() { return new yarnwrap.client.MinecraftClient(wrapperContained.getClient()); }
public void hideAlternates() { wrapperContained.hideAlternates(); }
// public void forEachButton(java.util.function.Consumer consumer) { wrapperContained.forEachButton(consumer); }

}