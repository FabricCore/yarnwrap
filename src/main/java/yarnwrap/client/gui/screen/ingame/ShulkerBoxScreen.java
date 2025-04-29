package yarnwrap.client.gui.screen.ingame;
public class ShulkerBoxScreen { public net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen wrapperContained; public ShulkerBoxScreen(net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen.TEXTURE = value.wrapperContained; }

public ShulkerBoxScreen(yarnwrap.screen.ShulkerBoxScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}