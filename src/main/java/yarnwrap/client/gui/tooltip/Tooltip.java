package yarnwrap.client.gui.tooltip;
public class Tooltip { public net.minecraft.client.gui.tooltip.Tooltip wrapperContained; public Tooltip(net.minecraft.client.gui.tooltip.Tooltip wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ROW_LENGTH() { return wrapperContained.ROW_LENGTH; }
// public void ROW_LENGTH(int value) { wrapperContained.ROW_LENGTH = value; }
// public yarnwrap.text.Text content() { return new yarnwrap.text.Text(wrapperContained.content); }
// public void content(yarnwrap.text.Text value) { wrapperContained.content = value.wrapperContained; }
// public java.util.List lines() { return wrapperContained.lines; }
// public void lines(java.util.List value) { wrapperContained.lines = value; }
// public yarnwrap.text.Text narration() { return new yarnwrap.text.Text(wrapperContained.narration); }
// public void narration(yarnwrap.text.Text value) { wrapperContained.narration = value.wrapperContained; }
// public yarnwrap.util.Language language() { return new yarnwrap.util.Language(wrapperContained.language); }
// public void language(yarnwrap.util.Language value) { wrapperContained.language = value.wrapperContained; }
public java.util.List getLines(yarnwrap.client.MinecraftClient client) { return wrapperContained.getLines(client.wrapperContained); }
public java.util.List wrapLines(yarnwrap.client.MinecraftClient client,yarnwrap.text.Text text) { return wrapperContained.wrapLines(client.wrapperContained,text.wrapperContained); }
public yarnwrap.client.gui.tooltip.Tooltip of(yarnwrap.text.Text content) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.of(content.wrapperContained)); }
public yarnwrap.client.gui.tooltip.Tooltip of(yarnwrap.text.Text content,yarnwrap.text.Text narration) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.of(content.wrapperContained,narration.wrapperContained)); }

}