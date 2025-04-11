package yarnwrap.text;
public class OrderedText { public net.minecraft.text.OrderedText wrapperContained; public OrderedText(net.minecraft.text.OrderedText wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.OrderedText EMPTY() { return new yarnwrap.text.OrderedText(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.OrderedText value) { wrapperContained.EMPTY = value.wrapperContained; }
// public yarnwrap.text.OrderedText styled(int codePoint,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styled(codePoint,style.wrapperContained)); }
// public yarnwrap.text.OrderedText concat(yarnwrap.text.OrderedText first,yarnwrap.text.OrderedText second) { return new yarnwrap.text.OrderedText(wrapperContained.concat(first.wrapperContained,second.wrapperContained)); }
// public yarnwrap.text.CharacterVisitor map(yarnwrap.text.CharacterVisitor visitor,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.CharacterVisitor(wrapperContained.map(visitor.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styledForwardsVisitedString(string,style.wrapperContained)); }
// public yarnwrap.text.OrderedText concat(java.util.List texts) { return new yarnwrap.text.OrderedText(wrapperContained.concat(texts)); }
// public yarnwrap.text.OrderedText innerConcat(yarnwrap.text.OrderedText text1,yarnwrap.text.OrderedText text2) { return new yarnwrap.text.OrderedText(wrapperContained.innerConcat(text1.wrapperContained,text2.wrapperContained)); }
// public yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.OrderedText(wrapperContained.styledBackwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText innerConcat(java.util.List texts) { return new yarnwrap.text.OrderedText(wrapperContained.innerConcat(texts)); }
// public yarnwrap.text.OrderedText empty() { return new yarnwrap.text.OrderedText(wrapperContained.empty()); }
// public yarnwrap.text.OrderedText of(yarnwrap.text.OrderedText text) { return new yarnwrap.text.OrderedText(wrapperContained.of(text.wrapperContained)); }
// public yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.OrderedText(wrapperContained.styledForwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText concat(net.minecraft.text.OrderedText[] texts) { return new yarnwrap.text.OrderedText(wrapperContained.concat(texts)); }
// public yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styledBackwardsVisitedString(string,style.wrapperContained)); }

}