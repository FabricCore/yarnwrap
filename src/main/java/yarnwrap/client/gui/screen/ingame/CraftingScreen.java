package yarnwrap.client.gui.screen.ingame;
public class CraftingScreen { public net.minecraft.client.gui.screen.ingame.CraftingScreen wrapperContained; public CraftingScreen(net.minecraft.client.gui.screen.ingame.CraftingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean narrow() { return wrapperContained.narrow; }
// public void narrow(boolean value) { wrapperContained.narrow = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.client.gui.screen.recipebook.RecipeBookWidget recipeBook() { return new yarnwrap.client.gui.screen.recipebook.RecipeBookWidget(wrapperContained.recipeBook); }
// public void recipeBook(yarnwrap.client.gui.screen.recipebook.RecipeBookWidget value) { wrapperContained.recipeBook = value.wrapperContained; }
public CraftingScreen(yarnwrap.screen.CraftingScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CraftingScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
// public void method_19890(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_19890(button.wrapperContained); }

}