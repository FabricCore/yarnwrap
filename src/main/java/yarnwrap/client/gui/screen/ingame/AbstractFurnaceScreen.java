package yarnwrap.client.gui.screen.ingame;
public class AbstractFurnaceScreen { public net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained; public AbstractFurnaceScreen(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier background() { return new yarnwrap.util.Identifier(wrapperContained.background); }
// public void background(yarnwrap.util.Identifier value) { wrapperContained.background = value.wrapperContained; }
// public static yarnwrap.util.Identifier background() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.background); }
// public static void background(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.background = value.wrapperContained; }

public yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen recipeBook() { return new yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen value) { wrapperContained.recipeBook = value.wrapperContained; }
// public static yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen recipeBook() { return new yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.recipeBook); }
// public static void recipeBook(yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.recipeBook = value.wrapperContained; }

// public boolean narrow() { return wrapperContained.narrow; }
// public void narrow(boolean value) { wrapperContained.narrow = value; }
// public static boolean narrow() { return net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.narrow; }
// public static void narrow(boolean value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.narrow = value; }

// public yarnwrap.util.Identifier litProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.litProgressTexture); }
// public void litProgressTexture(yarnwrap.util.Identifier value) { wrapperContained.litProgressTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier litProgressTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.litProgressTexture); }
// public static void litProgressTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.litProgressTexture = value.wrapperContained; }

// public yarnwrap.util.Identifier burnProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.burnProgressTexture); }
// public void burnProgressTexture(yarnwrap.util.Identifier value) { wrapperContained.burnProgressTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier burnProgressTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.burnProgressTexture); }
// public static void burnProgressTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.burnProgressTexture = value.wrapperContained; }

// public AbstractFurnaceScreen(yarnwrap.screen.AbstractFurnaceScreenHandler handler,yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen recipeBook,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title,yarnwrap.util.Identifier background,yarnwrap.util.Identifier litProgressTexture,yarnwrap.util.Identifier burnProgressTexture) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen(handler.wrapperContained,recipeBook.wrapperContained,inventory.wrapperContained,title.wrapperContained,background.wrapperContained,litProgressTexture.wrapperContained,burnProgressTexture.wrapperContained); }
// public void method_19877(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19877(button.wrapperContained); }
// public static void method_19877(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.method_19877(button.wrapperContained); }

}