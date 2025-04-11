package yarnwrap.client.gui.screen;
public class ButtonTextures { public net.minecraft.client.gui.screen.ButtonTextures wrapperContained; public ButtonTextures(net.minecraft.client.gui.screen.ButtonTextures wrapperContained) { this.wrapperContained = wrapperContained; }

public ButtonTextures(yarnwrap.util.Identifier unfocused,yarnwrap.util.Identifier focused) { this.wrapperContained = new net.minecraft.client.gui.screen.ButtonTextures(unfocused.wrapperContained,focused.wrapperContained); }
public ButtonTextures(yarnwrap.util.Identifier enabled,yarnwrap.util.Identifier disabled,yarnwrap.util.Identifier focused) { this.wrapperContained = new net.minecraft.client.gui.screen.ButtonTextures(enabled.wrapperContained,disabled.wrapperContained,focused.wrapperContained); }
public yarnwrap.util.Identifier get(boolean enabled,boolean focused) { return new yarnwrap.util.Identifier(wrapperContained.get(enabled,focused)); }

}