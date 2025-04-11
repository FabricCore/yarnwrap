package yarnwrap.text;
public class TextReorderingProcessor { public net.minecraft.text.TextReorderingProcessor wrapperContained; public TextReorderingProcessor(net.minecraft.text.TextReorderingProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String string() { return wrapperContained.string; }
// public void string(java.lang.String value) { wrapperContained.string = value; }
// public java.util.List styles() { return wrapperContained.styles; }
// public void styles(java.util.List value) { wrapperContained.styles = value; }
// public it.unimi.dsi.fastutil.ints.Int2IntFunction reverser() { return wrapperContained.reverser; }
// public void reverser(it.unimi.dsi.fastutil.ints.Int2IntFunction value) { wrapperContained.reverser = value; }
public java.lang.String getString() { return wrapperContained.getString(); }
public java.util.List process(int start,int length,boolean reverse) { return wrapperContained.process(start,length,reverse); }
public yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable,it.unimi.dsi.fastutil.ints.Int2IntFunction reverser,java.util.function.UnaryOperator shaper) { return new yarnwrap.text.TextReorderingProcessor(wrapperContained.create(visitable.wrapperContained,reverser,shaper)); }
public yarnwrap.text.TextReorderingProcessor create(yarnwrap.text.StringVisitable visitable) { return new yarnwrap.text.TextReorderingProcessor(wrapperContained.create(visitable.wrapperContained)); }

}