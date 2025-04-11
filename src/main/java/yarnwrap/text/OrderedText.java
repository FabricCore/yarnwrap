package yarnwrap.text;
public class OrderedText { public net.minecraft.text.OrderedText wrapperContained; public OrderedText(net.minecraft.text.OrderedText wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.OrderedText EMPTY() { return new yarnwrap.text.OrderedText(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.OrderedText value) { wrapperContained.EMPTY = value.wrapperContained; }
public boolean accept(yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.accept(visitor.wrapperContained); }
// public yarnwrap.text.OrderedText styled(int codePoint,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styled(codePoint,style.wrapperContained)); }
// public yarnwrap.text.OrderedText concat(yarnwrap.text.OrderedText first,yarnwrap.text.OrderedText second) { return new yarnwrap.text.OrderedText(wrapperContained.concat(first.wrapperContained,second.wrapperContained)); }
// public boolean method_30743(yarnwrap.text.OrderedText visitor) { return wrapperContained.method_30743(visitor.wrapperContained); }
// public boolean method_30744(yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.method_30744(visitor.wrapperContained); }
// public yarnwrap.text.CharacterVisitor map(yarnwrap.text.CharacterVisitor visitor,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.CharacterVisitor(wrapperContained.map(visitor.wrapperContained,codePointMapper)); }
// public boolean method_30746(yarnwrap.text.CharacterVisitor charIndex,it.unimi.dsi.fastutil.ints.Int2IntFunction style,int charPoint) { return wrapperContained.method_30746(charIndex.wrapperContained,style,charPoint); }
// public yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styledForwardsVisitedString(string,style.wrapperContained)); }
// public boolean method_30748(java.lang.String visitor) { return wrapperContained.method_30748(visitor); }
// public yarnwrap.text.OrderedText concat(java.util.List texts) { return new yarnwrap.text.OrderedText(wrapperContained.concat(texts)); }
// public boolean method_30750(java.util.List visitor) { return wrapperContained.method_30750(visitor); }
// public boolean method_30751(yarnwrap.text.Style visitor) { return wrapperContained.method_30751(visitor.wrapperContained); }
// public yarnwrap.text.OrderedText innerConcat(yarnwrap.text.OrderedText text1,yarnwrap.text.OrderedText text2) { return new yarnwrap.text.OrderedText(wrapperContained.innerConcat(text1.wrapperContained,text2.wrapperContained)); }
// public boolean method_30753(java.lang.String visitor) { return wrapperContained.method_30753(visitor); }
// public yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.OrderedText(wrapperContained.styledBackwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText innerConcat(java.util.List texts) { return new yarnwrap.text.OrderedText(wrapperContained.innerConcat(texts)); }
// public yarnwrap.text.OrderedText empty() { return new yarnwrap.text.OrderedText(wrapperContained.empty()); }
// public yarnwrap.text.OrderedText of(yarnwrap.text.OrderedText text) { return new yarnwrap.text.OrderedText(wrapperContained.of(text.wrapperContained)); }
// public boolean method_34907(java.lang.String visitor) { return wrapperContained.method_34907(visitor); }
// public yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.OrderedText(wrapperContained.styledForwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText concat(net.minecraft.text.OrderedText[] texts) { return new yarnwrap.text.OrderedText(wrapperContained.concat(texts)); }
// public yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styledBackwardsVisitedString(string,style.wrapperContained)); }
// public boolean method_34911(java.lang.String visitor) { return wrapperContained.method_34911(visitor); }

}