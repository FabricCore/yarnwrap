package yarnwrap.client.gui.screen.ingame;
public class AbstractFurnaceScreen { public net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained; public AbstractFurnaceScreen(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier background() { return new yarnwrap.util.Identifier(wrapperContained.background); }
public yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen recipeBook() { return new yarnwrap.client.gui.screen.recipebook.AbstractFurnaceRecipeBookScreen(wrapperContained.recipeBook); }
// public boolean narrow() { return wrapperContained.narrow; }
// public yarnwrap.util.Identifier litProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.litProgressTexture); }
// public yarnwrap.util.Identifier burnProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.burnProgressTexture); }

}