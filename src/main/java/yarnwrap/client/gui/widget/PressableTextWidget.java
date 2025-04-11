package yarnwrap.client.gui.widget;
public class PressableTextWidget { public net.minecraft.client.gui.widget.PressableTextWidget wrapperContained; public PressableTextWidget(net.minecraft.client.gui.widget.PressableTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.font.TextRenderer textRenderer() { return new yarnwrap.client.font.TextRenderer(wrapperContained.textRenderer); }
// public void textRenderer(yarnwrap.client.font.TextRenderer value) { wrapperContained.textRenderer = value.wrapperContained; }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public yarnwrap.text.Text hoverText() { return new yarnwrap.text.Text(wrapperContained.hoverText); }
// public void hoverText(yarnwrap.text.Text value) { wrapperContained.hoverText = value.wrapperContained; }
// public PressableTextWidget(int x,int y,int width,int height,yarnwrap.text.Text text,Object onPress,yarnwrap.client.font.TextRenderer textRenderer) { this.wrapperContained = new net.minecraft.client.gui.widget.PressableTextWidget(x,y,width,height,text.wrapperContained,onPress,textRenderer.wrapperContained); }

}