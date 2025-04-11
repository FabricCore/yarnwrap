package yarnwrap.client.realms.gui;
public class RealmsLoadingWidget { public net.minecraft.client.realms.gui.RealmsLoadingWidget wrapperContained; public RealmsLoadingWidget(net.minecraft.client.realms.gui.RealmsLoadingWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
public RealmsLoadingWidget(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.realms.gui.RealmsLoadingWidget(textRenderer.wrapperContained,message.wrapperContained); }

}