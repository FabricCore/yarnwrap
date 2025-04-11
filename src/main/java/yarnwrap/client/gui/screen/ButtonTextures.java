package yarnwrap.client.gui.screen;
public class ButtonTextures { public net.minecraft.client.gui.screen.ButtonTextures wrapperContained; public ButtonTextures(net.minecraft.client.gui.screen.ButtonTextures wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier get(boolean enabled,boolean focused) { return new yarnwrap.util.Identifier(wrapperContained.get(enabled,focused)); }

}