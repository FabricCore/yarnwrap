package yarnwrap.client.gui.screen.ingame;
public class BlastFurnaceScreen { public net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen wrapperContained; public BlastFurnaceScreen(net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen.TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier LIT_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.LIT_PROGRESS_TEXTURE); }
// public void LIT_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.LIT_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier LIT_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen.LIT_PROGRESS_TEXTURE); }
// public static void LIT_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen.LIT_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier BURN_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BURN_PROGRESS_TEXTURE); }
// public void BURN_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BURN_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier BURN_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen.BURN_PROGRESS_TEXTURE); }
// public static void BURN_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen.BURN_PROGRESS_TEXTURE = value.wrapperContained; }

public BlastFurnaceScreen(yarnwrap.screen.BlastFurnaceScreenHandler container,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.BlastFurnaceScreen(container.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}