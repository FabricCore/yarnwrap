package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookWidget { public net.minecraft.client.gui.screen.recipebook.RecipeBookWidget wrapperContained; public RecipeBookWidget(net.minecraft.client.gui.screen.recipebook.RecipeBookWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SEARCH_HINT_TEXT() { return new yarnwrap.text.Text(wrapperContained.SEARCH_HINT_TEXT); }
// public yarnwrap.text.Text TOGGLE_CRAFTABLE_RECIPES_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLE_CRAFTABLE_RECIPES_TEXT); }
// public yarnwrap.text.Text TOGGLE_ALL_RECIPES_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLE_ALL_RECIPES_TEXT); }
// public yarnwrap.client.gui.screen.recipebook.RecipeBookResults recipesArea() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookResults(wrapperContained.recipesArea); }
// public boolean searching() { return wrapperContained.searching; }
// public yarnwrap.client.gui.widget.ToggleButtonWidget toggleCraftableButton() { return new yarnwrap.client.gui.widget.ToggleButtonWidget(wrapperContained.toggleCraftableButton); }
// public yarnwrap.client.gui.widget.TextFieldWidget searchField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.searchField); }
// public yarnwrap.recipe.RecipeMatcher recipeFinder() { return new yarnwrap.recipe.RecipeMatcher(wrapperContained.recipeFinder); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public yarnwrap.client.gui.screen.recipebook.RecipeBookGhostSlots ghostSlots() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookGhostSlots(wrapperContained.ghostSlots); }
// public int cachedInvChangeCount() { return wrapperContained.cachedInvChangeCount; }
// public java.util.List tabButtons() { return wrapperContained.tabButtons; }
// public yarnwrap.screen.AbstractRecipeScreenHandler craftingScreenHandler() { return new yarnwrap.screen.AbstractRecipeScreenHandler(wrapperContained.craftingScreenHandler); }
// public yarnwrap.client.recipebook.ClientRecipeBook recipeBook() { return new yarnwrap.client.recipebook.ClientRecipeBook(wrapperContained.recipeBook); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.client.gui.screen.recipebook.RecipeGroupButtonWidget currentTab() { return new yarnwrap.client.gui.screen.recipebook.RecipeGroupButtonWidget(wrapperContained.currentTab); }
// public java.lang.String searchText() { return wrapperContained.searchText; }
// public int parentHeight() { return wrapperContained.parentHeight; }
// public int parentWidth() { return wrapperContained.parentWidth; }
// public int leftOffset() { return wrapperContained.leftOffset; }
// public boolean open() { return wrapperContained.open; }
// public boolean narrow() { return wrapperContained.narrow; }
public yarnwrap.client.gui.screen.ButtonTextures BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.BUTTON_TEXTURES); }
// public yarnwrap.client.gui.screen.ButtonTextures FILTER_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.FILTER_BUTTON_TEXTURES); }
// public yarnwrap.text.Text getToggleCraftableButtonText() { return new yarnwrap.text.Text(wrapperContained.getToggleCraftableButtonText()); }
// public void triggerPirateSpeakEasterEgg(java.lang.String search) { wrapperContained.triggerPirateSpeakEasterEgg(search); }
public void reset() { wrapperContained.reset(); }
public void drawGhostSlots(yarnwrap.client.gui.DrawContext context,int x,int y,boolean notInventory,float delta) { wrapperContained.drawGhostSlots(context.wrapperContained,x,y,notInventory,delta); }
// public void setBookButtonTexture() { wrapperContained.setBookButtonTexture(); }
// public void refreshSearchResults() { wrapperContained.refreshSearchResults(); }
// public void refreshInputs() { wrapperContained.refreshInputs(); }
// public void sendBookDataPacket() { wrapperContained.sendBookDataPacket(); }
// public boolean toggleFilteringCraftable() { return wrapperContained.toggleFilteringCraftable(); }
public void update() { wrapperContained.update(); }
public void toggleOpen() { wrapperContained.toggleOpen(); }
public void refresh() { wrapperContained.refresh(); }
// public void setOpen(boolean opened) { wrapperContained.setOpen(opened); }
public int findLeftEdge(int width,int backgroundWidth) { return wrapperContained.findLeftEdge(width,backgroundWidth); }
public void showGhostRecipe(yarnwrap.recipe.RecipeEntry recipe,java.util.List slots) { wrapperContained.showGhostRecipe(recipe.wrapperContained,slots); }
public void initialize(int parentWidth,int parentHeight,yarnwrap.client.MinecraftClient client,boolean narrow,yarnwrap.screen.AbstractRecipeScreenHandler craftingScreenHandler) { wrapperContained.initialize(parentWidth,parentHeight,client.wrapperContained,narrow,craftingScreenHandler.wrapperContained); }
public boolean isClickOutsideBounds(double mouseX,double mouseY,int x,int y,int backgroundWidth,int backgroundHeight,int button) { return wrapperContained.isClickOutsideBounds(mouseX,mouseY,x,y,backgroundWidth,backgroundHeight,button); }
public void slotClicked(yarnwrap.screen.slot.Slot slot) { wrapperContained.slotClicked(slot.wrapperContained); }
public void drawTooltip(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY) { wrapperContained.drawTooltip(context.wrapperContained,x,y,mouseX,mouseY); }
// public void drawGhostSlotTooltip(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY) { wrapperContained.drawGhostSlotTooltip(context.wrapperContained,x,y,mouseX,mouseY); }
// public void refreshResults(boolean resetCurrentPage) { wrapperContained.refreshResults(resetCurrentPage); }
// public boolean isWide() { return wrapperContained.isWide(); }
public boolean isOpen() { return wrapperContained.isOpen(); }
// public void refreshTabButtons() { wrapperContained.refreshTabButtons(); }
// public boolean isGuiOpen() { return wrapperContained.isGuiOpen(); }
// public void updateTooltip() { wrapperContained.updateTooltip(); }

}