package yarnwrap.client.gui.widget;
public class LoadingWidget { public net.minecraft.client.gui.widget.LoadingWidget wrapperContained; public LoadingWidget(net.minecraft.client.gui.widget.LoadingWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public static yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(net.minecraft.client.gui.widget.LoadingWidget.textRenderer); }
// public static void textRenderer(yarnwrap.client.font.TextRenderer value, ) { net.minecraft.client.gui.widget.LoadingWidget.textRenderer = value.wrapperContained; }

public LoadingWidget(yarnwrap.client.font.TextRenderer textRenderer,yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.client.gui.widget.LoadingWidget(textRenderer.wrapperContained,message.wrapperContained); }

}