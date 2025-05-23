package yarnwrap.client.gui.screen.ingame;
public class SmokerScreen { public net.minecraft.client.gui.screen.ingame.SmokerScreen wrapperContained; public SmokerScreen(net.minecraft.client.gui.screen.ingame.SmokerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.SmokerScreen.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.SmokerScreen.TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier LIT_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.LIT_PROGRESS_TEXTURE); }
// public void LIT_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.LIT_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier LIT_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.SmokerScreen.LIT_PROGRESS_TEXTURE); }
// public static void LIT_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.SmokerScreen.LIT_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier BURN_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.BURN_PROGRESS_TEXTURE); }
// public void BURN_PROGRESS_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.BURN_PROGRESS_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier BURN_PROGRESS_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.screen.ingame.SmokerScreen.BURN_PROGRESS_TEXTURE); }
// public static void BURN_PROGRESS_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.screen.ingame.SmokerScreen.BURN_PROGRESS_TEXTURE = value.wrapperContained; }

// public yarnwrap.text.Text TOGGLE_SMOKABLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOGGLE_SMOKABLE_TEXT); }
// public void TOGGLE_SMOKABLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TOGGLE_SMOKABLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TOGGLE_SMOKABLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.SmokerScreen.TOGGLE_SMOKABLE_TEXT); }
// public static void TOGGLE_SMOKABLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.gui.screen.ingame.SmokerScreen.TOGGLE_SMOKABLE_TEXT = value.wrapperContained; }

// public java.util.List TABS() { return wrapperContained.TABS; }
// public void TABS(java.util.List value) { wrapperContained.TABS = value; }
// public static java.util.List TABS() { return net.minecraft.client.gui.screen.ingame.SmokerScreen.TABS; }
// public static void TABS(java.util.List value, ) { net.minecraft.client.gui.screen.ingame.SmokerScreen.TABS = value; }

public SmokerScreen(yarnwrap.screen.SmokerScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.SmokerScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }

}