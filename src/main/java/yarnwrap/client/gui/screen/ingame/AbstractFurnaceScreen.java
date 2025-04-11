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

}