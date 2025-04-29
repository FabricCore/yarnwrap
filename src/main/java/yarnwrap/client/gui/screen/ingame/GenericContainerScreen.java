package yarnwrap.client.gui.screen.ingame;
public class GenericContainerScreen { public net.minecraft.client.gui.screen.ingame.GenericContainerScreen wrapperContained; public GenericContainerScreen(net.minecraft.client.gui.screen.ingame.GenericContainerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.GenericContainerScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.GenericContainerScreen.TEXTURE = value.wrapperContained; }

// public int rows() { return wrapperContained.rows; }
// public void rows(int value) { wrapperContained.rows = value; }
// public static int rows() { return net.minecraft.client.gui.screen.ingame.GenericContainerScreen.rows; }
// public static void rows(int value, ) { net.minecraft.client.gui.screen.ingame.GenericContainerScreen.rows = value; }

public GenericContainerScreen(yarnwrap.screen.GenericContainerScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.GenericContainerScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}