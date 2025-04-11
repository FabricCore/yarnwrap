package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookResults { public net.minecraft.client.gui.screen.recipebook.RecipeBookResults wrapperContained; public RecipeBookResults(net.minecraft.client.gui.screen.recipebook.RecipeBookResults wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pageCount() { return wrapperContained.pageCount; }
// public void pageCount(int value) { wrapperContained.pageCount = value; }
// public yarnwrap.recipe.RecipeEntry lastClickedRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.lastClickedRecipe); }
// public void lastClickedRecipe(yarnwrap.recipe.RecipeEntry value) { wrapperContained.lastClickedRecipe = value.wrapperContained; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.List resultCollections() { return wrapperContained.resultCollections; }
// public void resultCollections(java.util.List value) { wrapperContained.resultCollections = value; }
// public yarnwrap.client.gui.widget.ToggleButtonWidget nextPageButton() { return new yarnwrap.client.gui.widget.ToggleButtonWidget(wrapperContained.nextPageButton); }
// public void nextPageButton(yarnwrap.client.gui.widget.ToggleButtonWidget value) { wrapperContained.nextPageButton = value.wrapperContained; }
// public yarnwrap.client.gui.screen.recipebook.AnimatedResultButton hoveredResultButton() { return new yarnwrap.client.gui.screen.recipebook.AnimatedResultButton(wrapperContained.hoveredResultButton); }
// public void hoveredResultButton(yarnwrap.client.gui.screen.recipebook.AnimatedResultButton value) { wrapperContained.hoveredResultButton = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ToggleButtonWidget prevPageButton() { return new yarnwrap.client.gui.widget.ToggleButtonWidget(wrapperContained.prevPageButton); }
// public void prevPageButton(yarnwrap.client.gui.widget.ToggleButtonWidget value) { wrapperContained.prevPageButton = value.wrapperContained; }
// public java.util.List resultButtons() { return wrapperContained.resultButtons; }
// public void resultButtons(java.util.List value) { wrapperContained.resultButtons = value; }
// public yarnwrap.client.gui.screen.recipebook.RecipeAlternativesWidget alternatesWidget() { return new yarnwrap.client.gui.screen.recipebook.RecipeAlternativesWidget(wrapperContained.alternatesWidget); }
// public void alternatesWidget(yarnwrap.client.gui.screen.recipebook.RecipeAlternativesWidget value) { wrapperContained.alternatesWidget = value.wrapperContained; }
// public yarnwrap.client.gui.screen.recipebook.RecipeResultCollection resultCollection() { return new yarnwrap.client.gui.screen.recipebook.RecipeResultCollection(wrapperContained.resultCollection); }
// public void resultCollection(yarnwrap.client.gui.screen.recipebook.RecipeResultCollection value) { wrapperContained.resultCollection = value.wrapperContained; }
// public java.util.List recipeDisplayListeners() { return wrapperContained.recipeDisplayListeners; }
// public void recipeDisplayListeners(java.util.List value) { wrapperContained.recipeDisplayListeners = value; }
// public int currentPage() { return wrapperContained.currentPage; }
// public void currentPage(int value) { wrapperContained.currentPage = value; }
// public yarnwrap.recipe.book.RecipeBook recipeBook() { return new yarnwrap.recipe.book.RecipeBook(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.recipe.book.RecipeBook value) { wrapperContained.recipeBook = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ButtonTextures PAGE_FORWARD_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.PAGE_FORWARD_TEXTURES); }
// public void PAGE_FORWARD_TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.PAGE_FORWARD_TEXTURES = value.wrapperContained; }
// public yarnwrap.client.gui.screen.ButtonTextures PAGE_BACKWARD_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.PAGE_BACKWARD_TEXTURES); }
// public void PAGE_BACKWARD_TEXTURES(yarnwrap.client.gui.screen.ButtonTextures value) { wrapperContained.PAGE_BACKWARD_TEXTURES = value.wrapperContained; }
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