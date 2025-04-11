package yarnwrap.client.gui.screen.ingame;
public class AbstractFurnaceScreen { public net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained; public AbstractFurnaceScreen(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier background() { return new yarnwrap.util.Identifier(wrapperContained.background); }
// public void background(yarnwrap.util.Identifier value) { wrapperContained.background = value.wrapperContained; }
public yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen recipeBook() { return new yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen value) { wrapperContained.recipeBook = value.wrapperContained; }
// public boolean narrow() { return wrapperContained.narrow; }
// public void narrow(boolean value) { wrapperContained.narrow = value; }
// public yarnwrap.util.Identifier litProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.litProgressTexture); }
// public void litProgressTexture(yarnwrap.util.Identifier value) { wrapperContained.litProgressTexture = value.wrapperContained; }
// public yarnwrap.util.Identifier burnProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.burnProgressTexture); }
// public void burnProgressTexture(yarnwrap.util.Identifier value) { wrapperContained.burnProgressTexture = value.wrapperContained; }
// public AbstractFurnaceScreen(yarnwrap.screen.AbstractFurnaceScreenHandler handler,yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen recipeBook,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title,yarnwrap.util.Identifier background,yarnwrap.util.Identifier litProgressTexture,yarnwrap.util.Identifier burnProgressTexture) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen(handler.wrapperContained,recipeBook.wrapperContained,inventory.wrapperContained,title.wrapperContained,background.wrapperContained,litProgressTexture.wrapperContained,burnProgressTexture.wrapperContained); }
// public void method_19877(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19877(button.wrapperContained); }

}