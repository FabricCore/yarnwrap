package yarnwrap.client.gui.screen.ingame;
public class HopperScreen { public net.minecraft.client.gui.screen.ingame.HopperScreen wrapperContained; public HopperScreen(net.minecraft.client.gui.screen.ingame.HopperScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public HopperScreen(yarnwrap.screen.HopperScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.HopperScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}