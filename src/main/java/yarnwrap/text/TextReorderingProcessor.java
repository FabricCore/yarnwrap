package yarnwrap.text;
public class TextReorderingProcessor { public net.minecraft.text.TextReorderingProcessor wrapperContained; public TextReorderingProcessor(net.minecraft.text.TextReorderingProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String string() { return wrapperContained.string; }
// public void string(java.lang.String value) { wrapperContained.string = value; }
// public static java.lang.String string() { return net.minecraft.text.TextReorderingProcessor.string; }
// public static void string(java.lang.String value, ) { net.minecraft.text.TextReorderingProcessor.string = value; }

// public java.util.List styles() { return wrapperContained.styles; }
// public void styles(java.util.List value) { wrapperContained.styles = value; }
// public static java.util.List styles() { return net.minecraft.text.TextReorderingProcessor.styles; }
// public static void styles(java.util.List value, ) { net.minecraft.text.TextReorderingProcessor.styles = value; }

// public it.unimi.dsi.fastutil.ints.Int2IntFunction reverser() { return wrapperContained.reverser; }
// public void reverser(it.unimi.dsi.fastutil.ints.Int2IntFunction value) { wrapperContained.reverser = value; }
// public static it.unimi.dsi.fastutil.ints.Int2IntFunction reverser() { return net.minecraft.text.TextReorderingProcessor.reverser; }
// public static void reverser(it.unimi.dsi.fastutil.ints.Int2IntFunction value, ) { net.minecraft.text.TextReorderingProcessor.reverser = value; }

// public TextReorderingProcessor(java.lang.String string,java.util.List styles,it.unimi.dsi.fastutil.ints.Int2IntFunction reverser) { this.wrapperContained = new net.minecraft.text.TextReorderingProcessor(string,styles,reverser); }
public java.lang.String getString() { return wrapperContained.getString(); }
// public static java.lang.String getString() { return net.minecraft.text.TextReorderingProcessor.getString(); }
public java.util.List process(int start,int length,boolean reverse) { return wrapperContained.process(start,length,reverse); }
// public static java.util.List process(int start,int length,boolean reverse, ) { return net.minecraft.text.TextReorderingProcessor.process(start,length,reverse); }
// public boolean method_30941(java.lang.StringBuilder charIndex,java.util.List stylex,int codePoint) { return wrapperContained.method_30941(charIndex,stylex,codePoint); }
// public static boolean method_30941(java.lang.StringBuilder charIndex,java.util.List stylex,int codePoint, ) { return net.minecraft.text.TextReorderingProcessor.method_30941(charIndex,stylex,codePoint); }
// public java.util.Optional method_30942(java.lang.StringBuilder style,java.util.List text) { return wrapperContained.method_30942(style,text); }
// public static java.util.Optional method_30942(java.lang.StringBuilder style,java.util.List text, ) { return net.minecraft.text.TextReorderingProcessor.method_30942(style,text); }
// public yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable,it.unimi.dsi.fastutil.ints.Int2IntFunction reverser,java.util.function.UnaryOperator shaper) { return new yarnwrap.text.TextReorderingProcessor(wrapperContained.create(visitable.wrapperContained,reverser,shaper)); }
// public static yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable,it.unimi.dsi.fastutil.ints.Int2IntFunction reverser,java.util.function.UnaryOperator shaper, ) { return new yarnwrap.text.TextReorderingProcessor(net.minecraft.text.TextReorderingProcessor.create(visitable.wrapperContained,reverser,shaper)); }
// public int method_36142(int codePoint) { return wrapperContained.method_36142(codePoint); }
// public static int method_36142(int codePoint, ) { return net.minecraft.text.TextReorderingProcessor.method_36142(codePoint); }
// public java.lang.String method_36143(java.lang.String string) { return wrapperContained.method_36143(string); }
// public static java.lang.String method_36143(java.lang.String string, ) { return net.minecraft.text.TextReorderingProcessor.method_36143(string); }
// public yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable) { return new yarnwrap.text.TextReorderingProcessor(wrapperContained.create(visitable.wrapperContained)); }
// public static yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable, ) { return new yarnwrap.text.TextReorderingProcessor(net.minecraft.text.TextReorderingProcessor.create(visitable.wrapperContained)); }

}