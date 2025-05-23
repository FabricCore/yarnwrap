package yarnwrap.client.gui.screen.ingame;
public class RecipeBookScreen { public net.minecraft.client.gui.screen.ingame.RecipeBookScreen wrapperContained; public RecipeBookScreen(net.minecraft.client.gui.screen.ingame.RecipeBookScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.gui.screen.recipebook.RecipeBookWidget value) { wrapperContained.recipeBook = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(net.minecraft.client.gui.screen.ingame.RecipeBookScreen.recipeBook); }
// public static void recipeBook(yarnwrap.client.gui.screen.recipebook.RecipeBookWidget value, ) { net.minecraft.client.gui.screen.ingame.RecipeBookScreen.recipeBook = value.wrapperContained; }

// public boolean narrow() { return wrapperContained.narrow; }
// public void narrow(boolean value) { wrapperContained.narrow = value; }
// public static boolean narrow() { return net.minecraft.client.gui.screen.ingame.RecipeBookScreen.narrow; }
// public static void narrow(boolean value, ) { net.minecraft.client.gui.screen.ingame.RecipeBookScreen.narrow = value; }

// public RecipeBookScreen(yarnwrap.screen.AbstractRecipeScreenHandler handler,yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.RecipeBookScreen(handler.wrapperContained,recipeBook.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
// public yarnwrap.client.gui.ScreenPos getRecipeBookButtonPos() { return new yarnwrap.client.gui.ScreenPos(wrapperContained.getRecipeBookButtonPos()); }
// public static yarnwrap.client.gui.ScreenPos getRecipeBookButtonPos() { return new yarnwrap.client.gui.ScreenPos(net.minecraft.client.gui.screen.ingame.RecipeBookScreen.getRecipeBookButtonPos()); }
// public void onRecipeBookToggled() { wrapperContained.onRecipeBookToggled(); }
// public static void onRecipeBookToggled() { net.minecraft.client.gui.screen.ingame.RecipeBookScreen.onRecipeBookToggled(); }
// public boolean shouldAddPaddingToGhostResult() { return wrapperContained.shouldAddPaddingToGhostResult(); }
// public static boolean shouldAddPaddingToGhostResult() { return net.minecraft.client.gui.screen.ingame.RecipeBookScreen.shouldAddPaddingToGhostResult(); }
// public void addRecipeBook() { wrapperContained.addRecipeBook(); }
// public static void addRecipeBook() { net.minecraft.client.gui.screen.ingame.RecipeBookScreen.addRecipeBook(); }
// public void method_64513(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_64513(button.wrapperContained); }
// public static void method_64513(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.RecipeBookScreen.method_64513(button.wrapperContained); }

}