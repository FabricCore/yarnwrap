package yarnwrap.text;
public class MutableText { public net.minecraft.text.MutableText wrapperContained; public MutableText(net.minecraft.text.MutableText wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.TextContent content() { return new yarnwrap.text.TextContent(wrapperContained.content); }
// public java.util.List siblings() { return wrapperContained.siblings; }
// public yarnwrap.text.Style style() { return new yarnwrap.text.Style(wrapperContained.style); }
// public yarnwrap.text.OrderedText ordered() { return new yarnwrap.text.OrderedText(wrapperContained.ordered); }
// public yarnwrap.util.Language language() { return new yarnwrap.util.Language(wrapperContained.language); }
public yarnwrap.text.MutableText append(yarnwrap.text.Text text) { return new yarnwrap.text.MutableText(wrapperContained.append(text.wrapperContained)); }
public yarnwrap.text.MutableText setStyle(yarnwrap.text.Style style) { return new yarnwrap.text.MutableText(wrapperContained.setStyle(style.wrapperContained)); }
public yarnwrap.text.MutableText formatted(yarnwrap.util.Formatting formatting) { return new yarnwrap.text.MutableText(wrapperContained.formatted(formatting.wrapperContained)); }
public yarnwrap.text.MutableText append(java.lang.String text) { return new yarnwrap.text.MutableText(wrapperContained.append(text)); }
public yarnwrap.text.MutableText styled(java.util.function.UnaryOperator styleUpdater) { return new yarnwrap.text.MutableText(wrapperContained.styled(styleUpdater)); }
public yarnwrap.text.MutableText formatted(net.minecraft.util.Formatting[] formattings) { return new yarnwrap.text.MutableText(wrapperContained.formatted(formattings)); }
public yarnwrap.text.MutableText fillStyle(yarnwrap.text.Style styleOverride) { return new yarnwrap.text.MutableText(wrapperContained.fillStyle(styleOverride.wrapperContained)); }
public yarnwrap.text.MutableText of(yarnwrap.text.TextContent content) { return new yarnwrap.text.MutableText(wrapperContained.of(content.wrapperContained)); }
public yarnwrap.text.MutableText withColor(int color) { return new yarnwrap.text.MutableText(wrapperContained.withColor(color)); }

}