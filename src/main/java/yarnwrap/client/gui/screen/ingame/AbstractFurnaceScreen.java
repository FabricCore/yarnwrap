package yarnwrap.client.gui.screen.ingame;
public class AbstractFurnaceScreen { public net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained; public AbstractFurnaceScreen(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier background() { return new yarnwrap.util.Identifier(wrapperContained.background); }
// public void background(yarnwrap.util.Identifier value) { wrapperContained.background = value.wrapperContained; }
// public static yarnwrap.util.Identifier background() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.background); }
// public static void background(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.background = value.wrapperContained; }

// public yarnwrap.util.Identifier litProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.litProgressTexture); }
// public void litProgressTexture(yarnwrap.util.Identifier value) { wrapperContained.litProgressTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier litProgressTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.litProgressTexture); }
// public static void litProgressTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.litProgressTexture = value.wrapperContained; }

// public yarnwrap.util.Identifier burnProgressTexture() { return new yarnwrap.util.Identifier(wrapperContained.burnProgressTexture); }
// public void burnProgressTexture(yarnwrap.util.Identifier value) { wrapperContained.burnProgressTexture = value.wrapperContained; }
// public static yarnwrap.util.Identifier burnProgressTexture() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.burnProgressTexture); }
// public static void burnProgressTexture(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen.burnProgressTexture = value.wrapperContained; }

// public AbstractFurnaceScreen(yarnwrap.screen.AbstractFurnaceScreenHandler handler,yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.text.Text title,yarnwrap.text.Text toggleCraftableButtonText,yarnwrap.util.Identifier background,yarnwrap.util.Identifier litProgressTexture,yarnwrap.util.Identifier burnProgressTexture,java.util.List recipeBookTabs) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen(handler.wrapperContained,playerInventory.wrapperContained,title.wrapperContained,toggleCraftableButtonText.wrapperContained,background.wrapperContained,litProgressTexture.wrapperContained,burnProgressTexture.wrapperContained,recipeBookTabs); }

}