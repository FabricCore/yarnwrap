package yarnwrap.client.gui.screen.ingame;
public class GrindstoneScreen { public net.minecraft.client.gui.screen.ingame.GrindstoneScreen wrapperContained; public GrindstoneScreen(net.minecraft.client.gui.screen.ingame.GrindstoneScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public void ERROR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ERROR_TEXTURE = value.wrapperContained; }
public GrindstoneScreen(yarnwrap.screen.GrindstoneScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.GrindstoneScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}