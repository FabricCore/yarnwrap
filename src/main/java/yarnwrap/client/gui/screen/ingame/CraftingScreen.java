package yarnwrap.client.gui.screen.ingame;
public class CraftingScreen { public net.minecraft.client.gui.screen.ingame.CraftingScreen wrapperContained; public CraftingScreen(net.minecraft.client.gui.screen.ingame.CraftingScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.CraftingScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.CraftingScreen.TEXTURE = value.wrapperContained; }

public CraftingScreen(yarnwrap.screen.CraftingScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CraftingScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}