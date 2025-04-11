package yarnwrap.text;
public class TextReorderingProcessor { public net.minecraft.text.TextReorderingProcessor wrapperContained; public TextReorderingProcessor(net.minecraft.text.TextReorderingProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String string() { return wrapperContained.string; }
// public void string(java.lang.String value) { wrapperContained.string = value; }
// public java.util.List styles() { return wrapperContained.styles; }
// public void styles(java.util.List value) { wrapperContained.styles = value; }
// public it.unimi.dsi.fastutil.ints.Int2IntFunction reverser() { return wrapperContained.reverser; }
// public void reverser(it.unimi.dsi.fastutil.ints.Int2IntFunction value) { wrapperContained.reverser = value; }
// public TextReorderingProcessor(java.lang.String string,java.util.List styles,it.unimi.dsi.fastutil.ints.Int2IntFunction reverser) { this.wrapperContained = new net.minecraft.text.TextReorderingProcessor(string,styles,reverser); }
public java.lang.String getString() { return wrapperContained.getString(); }
public java.util.List process(int start,int length,boolean reverse) { return wrapperContained.process(start,length,reverse); }
// public boolean method_30941(java.lang.StringBuilder charIndex,java.util.List stylex,int codePoint) { return wrapperContained.method_30941(charIndex,stylex,codePoint); }
// public java.util.Optional method_30942(java.lang.StringBuilder style,java.util.List text) { return wrapperContained.method_30942(style,text); }
public yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable,it.unimi.dsi.fastutil.ints.Int2IntFunction reverser,java.util.function.UnaryOperator shaper) { return new yarnwrap.text.TextReorderingProcessor(wrapperContained.create(visitable.wrapperContained,reverser,shaper)); }
// public int method_36142(int codePoint) { return wrapperContained.method_36142(codePoint); }
// public java.lang.String method_36143(java.lang.String string) { return wrapperContained.method_36143(string); }
public yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable) { return new yarnwrap.text.TextReorderingProcessor(wrapperContained.create(visitable.wrapperContained)); }

}