package yarnwrap.client.gui.tooltip;
public class Tooltip { public net.minecraft.client.gui.tooltip.Tooltip wrapperContained; public Tooltip(net.minecraft.client.gui.tooltip.Tooltip wrapperContained) { this.wrapperContained = wrapperContained; }

// public int ROW_LENGTH() { return wrapperContained.ROW_LENGTH; }
// public void ROW_LENGTH(int value) { wrapperContained.ROW_LENGTH = value; }
// public static int ROW_LENGTH() { return net.minecraft.client.gui.tooltip.Tooltip.ROW_LENGTH; }
// public static void ROW_LENGTH(int value, ) { net.minecraft.client.gui.tooltip.Tooltip.ROW_LENGTH = value; }

// public yarnwrap.text.Text content() { return new yarnwrap.text.Text(wrapperContained.content); }
// public void content(yarnwrap.text.Text value) { wrapperContained.content = value.wrapperContained; }
// public static yarnwrap.text.Text content() { return new yarnwrap.text.Text(net.minecraft.client.gui.tooltip.Tooltip.content); }
// public static void content(yarnwrap.text.Text value, ) { net.minecraft.client.gui.tooltip.Tooltip.content = value.wrapperContained; }

// public java.util.List lines() { return wrapperContained.lines; }
// public void lines(java.util.List value) { wrapperContained.lines = value; }
// public static java.util.List lines() { return net.minecraft.client.gui.tooltip.Tooltip.lines; }
// public static void lines(java.util.List value, ) { net.minecraft.client.gui.tooltip.Tooltip.lines = value; }

// public yarnwrap.text.Text narration() { return new yarnwrap.text.Text(wrapperContained.narration); }
// public void narration(yarnwrap.text.Text value) { wrapperContained.narration = value.wrapperContained; }
// public static yarnwrap.text.Text narration() { return new yarnwrap.text.Text(net.minecraft.client.gui.tooltip.Tooltip.narration); }
// public static void narration(yarnwrap.text.Text value, ) { net.minecraft.client.gui.tooltip.Tooltip.narration = value.wrapperContained; }

// public yarnwrap.util.Language language() { return new yarnwrap.util.Language(wrapperContained.language); }
// public void language(yarnwrap.util.Language value) { wrapperContained.language = value.wrapperContained; }
// public static yarnwrap.util.Language language() { return new yarnwrap.util.Language(net.minecraft.client.gui.tooltip.Tooltip.language); }
// public static void language(yarnwrap.util.Language value, ) { net.minecraft.client.gui.tooltip.Tooltip.language = value.wrapperContained; }

// public Tooltip(yarnwrap.text.Text content,yarnwrap.text.Text narration) { this.wrapperContained = new net.minecraft.client.gui.tooltip.Tooltip(content.wrapperContained,narration.wrapperContained); }
public java.util.List getLines(yarnwrap.client.MinecraftClient client) { return wrapperContained.getLines(client.wrapperContained); }
// public static java.util.List getLines(yarnwrap.client.MinecraftClient client, ) { return net.minecraft.client.gui.tooltip.Tooltip.getLines(client.wrapperContained); }
// public java.util.List wrapLines(yarnwrap.client.MinecraftClient client,yarnwrap.text.Text text) { return wrapperContained.wrapLines(client.wrapperContained,text.wrapperContained); }
// public static java.util.List wrapLines(yarnwrap.client.MinecraftClient client,yarnwrap.text.Text text, ) { return net.minecraft.client.gui.tooltip.Tooltip.wrapLines(client.wrapperContained,text.wrapperContained); }
// public yarnwrap.client.gui.tooltip.Tooltip of(yarnwrap.text.Text content) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.of(content.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.Tooltip of(yarnwrap.text.Text content, ) { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.gui.tooltip.Tooltip.of(content.wrapperContained)); }
// public yarnwrap.client.gui.tooltip.Tooltip of(yarnwrap.text.Text content,yarnwrap.text.Text narration) { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.of(content.wrapperContained,narration.wrapperContained)); }
// public static yarnwrap.client.gui.tooltip.Tooltip of(yarnwrap.text.Text content,yarnwrap.text.Text narration, ) { return new yarnwrap.client.gui.tooltip.Tooltip(net.minecraft.client.gui.tooltip.Tooltip.of(content.wrapperContained,narration.wrapperContained)); }

}