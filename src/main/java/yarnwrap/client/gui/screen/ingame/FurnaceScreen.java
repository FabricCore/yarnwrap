package yarnwrap.client.gui.screen.ingame;
public class FurnaceScreen { public net.minecraft.client.gui.screen.ingame.FurnaceScreen wrapperContained; public FurnaceScreen(net.minecraft.client.gui.screen.ingame.FurnaceScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier LIT_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.LIT_PROGRESS_TEXTURE); }
// public void LIT_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.LIT_PROGRESS_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier BURN_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BURN_PROGRESS_TEXTURE); }
// public void BURN_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BURN_PROGRESS_TEXTURE = value.wrapperContained; }
public FurnaceScreen(yarnwrap.screen.FurnaceScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.FurnaceScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}