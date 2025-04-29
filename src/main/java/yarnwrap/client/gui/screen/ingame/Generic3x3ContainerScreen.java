package yarnwrap.client.gui.screen.ingame;
public class Generic3x3ContainerScreen { public net.minecraft.client.gui.screen.ingame.Generic3x3ContainerScreen wrapperContained; public Generic3x3ContainerScreen(net.minecraft.client.gui.screen.ingame.Generic3x3ContainerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.Generic3x3ContainerScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.Generic3x3ContainerScreen.TEXTURE = value.wrapperContained; }

public Generic3x3ContainerScreen(yarnwrap.screen.Generic3x3ContainerScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.Generic3x3ContainerScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}