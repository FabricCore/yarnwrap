package yarnwrap.client.realms.util;
public class TextRenderingUtils { public net.minecraft.client.realms.util.TextRenderingUtils wrapperContained; public TextRenderingUtils(net.minecraft.client.realms.util.TextRenderingUtils wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List lineBreak(java.lang.String text) { return wrapperContained.lineBreak(text); }
public java.util.List split(java.lang.String line,java.lang.String delimiter) { return wrapperContained.split(line,delimiter); }
// public java.util.List decompose(java.lang.String text,java.util.List links) { return wrapperContained.decompose(text,links); }
// public java.util.List decompose(java.lang.String text,Object[] links) { return wrapperContained.decompose(text,links); }
// public java.util.List insertLinks(java.util.List lines,java.util.List links) { return wrapperContained.insertLinks(lines,links); }

}