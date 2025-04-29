package yarnwrap.text;
public class OrderedText { public net.minecraft.text.OrderedText wrapperContained; public OrderedText(net.minecraft.text.OrderedText wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.OrderedText EMPTY() { return new yarnwrap.text.OrderedText(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.OrderedText value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.text.OrderedText EMPTY() { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.EMPTY); }
// public static void EMPTY(yarnwrap.text.OrderedText value, ) { net.minecraft.text.OrderedText.EMPTY = value.wrapperContained; }

public boolean accept(yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.accept(visitor.wrapperContained); }
// public static boolean accept(yarnwrap.text.CharacterVisitor visitor, ) { return net.minecraft.text.OrderedText.accept(visitor.wrapperContained); }
// public yarnwrap.text.OrderedText styled(int codePoint,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styled(codePoint,style.wrapperContained)); }
// public static yarnwrap.text.OrderedText styled(int codePoint,yarnwrap.text.Style style, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.styled(codePoint,style.wrapperContained)); }
// public yarnwrap.text.OrderedText concat(yarnwrap.text.OrderedText first,yarnwrap.text.OrderedText second) { return new yarnwrap.text.OrderedText(wrapperContained.concat(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.text.OrderedText concat(yarnwrap.text.OrderedText first,yarnwrap.text.OrderedText second, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.concat(first.wrapperContained,second.wrapperContained)); }
// public boolean method_30743(yarnwrap.text.OrderedText visitor) { return wrapperContained.method_30743(visitor.wrapperContained); }
// public static boolean method_30743(yarnwrap.text.OrderedText visitor, ) { return net.minecraft.text.OrderedText.method_30743(visitor.wrapperContained); }
// public boolean method_30744(yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.method_30744(visitor.wrapperContained); }
// public static boolean method_30744(yarnwrap.text.CharacterVisitor visitor, ) { return net.minecraft.text.OrderedText.method_30744(visitor.wrapperContained); }
// public yarnwrap.text.CharacterVisitor map(yarnwrap.text.CharacterVisitor visitor,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.CharacterVisitor(wrapperContained.map(visitor.wrapperContained,codePointMapper)); }
// public static yarnwrap.text.CharacterVisitor map(yarnwrap.text.CharacterVisitor visitor,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper, ) { return new yarnwrap.text.CharacterVisitor(net.minecraft.text.OrderedText.map(visitor.wrapperContained,codePointMapper)); }
// public boolean method_30746(yarnwrap.text.CharacterVisitor charIndex,it.unimi.dsi.fastutil.ints.Int2IntFunction style,int charPoint) { return wrapperContained.method_30746(charIndex.wrapperContained,style,charPoint); }
// public static boolean method_30746(yarnwrap.text.CharacterVisitor charIndex,it.unimi.dsi.fastutil.ints.Int2IntFunction style,int charPoint, ) { return net.minecraft.text.OrderedText.method_30746(charIndex.wrapperContained,style,charPoint); }
// public yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styledForwardsVisitedString(string,style.wrapperContained)); }
// public static yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.styledForwardsVisitedString(string,style.wrapperContained)); }
// public boolean method_30748(java.lang.String visitor) { return wrapperContained.method_30748(visitor); }
// public static boolean method_30748(java.lang.String visitor, ) { return net.minecraft.text.OrderedText.method_30748(visitor); }
// public yarnwrap.text.OrderedText concat(java.util.List texts) { return new yarnwrap.text.OrderedText(wrapperContained.concat(texts)); }
// public static yarnwrap.text.OrderedText concat(java.util.List texts, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.concat(texts)); }
// public boolean method_30750(java.util.List visitor) { return wrapperContained.method_30750(visitor); }
// public static boolean method_30750(java.util.List visitor, ) { return net.minecraft.text.OrderedText.method_30750(visitor); }
// public boolean method_30751(yarnwrap.text.Style visitor) { return wrapperContained.method_30751(visitor.wrapperContained); }
// public static boolean method_30751(yarnwrap.text.Style visitor, ) { return net.minecraft.text.OrderedText.method_30751(visitor.wrapperContained); }
// public yarnwrap.text.OrderedText innerConcat(yarnwrap.text.OrderedText text1,yarnwrap.text.OrderedText text2) { return new yarnwrap.text.OrderedText(wrapperContained.innerConcat(text1.wrapperContained,text2.wrapperContained)); }
// public static yarnwrap.text.OrderedText innerConcat(yarnwrap.text.OrderedText text1,yarnwrap.text.OrderedText text2, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.innerConcat(text1.wrapperContained,text2.wrapperContained)); }
// public boolean method_30753(java.lang.String visitor) { return wrapperContained.method_30753(visitor); }
// public static boolean method_30753(java.lang.String visitor, ) { return net.minecraft.text.OrderedText.method_30753(visitor); }
// public yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.OrderedText(wrapperContained.styledBackwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public static yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.styledBackwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText innerConcat(java.util.List texts) { return new yarnwrap.text.OrderedText(wrapperContained.innerConcat(texts)); }
// public static yarnwrap.text.OrderedText innerConcat(java.util.List texts, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.innerConcat(texts)); }
// public yarnwrap.text.OrderedText empty() { return new yarnwrap.text.OrderedText(wrapperContained.empty()); }
public static yarnwrap.text.OrderedText empty() { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.empty()); }
// public yarnwrap.text.OrderedText of(yarnwrap.text.OrderedText text) { return new yarnwrap.text.OrderedText(wrapperContained.of(text.wrapperContained)); }
// public static yarnwrap.text.OrderedText of(yarnwrap.text.OrderedText text, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.of(text.wrapperContained)); }
// public boolean method_34907(java.lang.String visitor) { return wrapperContained.method_34907(visitor); }
// public static boolean method_34907(java.lang.String visitor, ) { return net.minecraft.text.OrderedText.method_34907(visitor); }
// public yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper) { return new yarnwrap.text.OrderedText(wrapperContained.styledForwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public static yarnwrap.text.OrderedText styledForwardsVisitedString(java.lang.String string,yarnwrap.text.Style style,it.unimi.dsi.fastutil.ints.Int2IntFunction codePointMapper, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.styledForwardsVisitedString(string,style.wrapperContained,codePointMapper)); }
// public yarnwrap.text.OrderedText concat(net.minecraft.text.OrderedText[] texts) { return new yarnwrap.text.OrderedText(wrapperContained.concat(texts)); }
// public static yarnwrap.text.OrderedText concat(net.minecraft.text.OrderedText[] texts, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.concat(texts)); }
// public yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.OrderedText(wrapperContained.styledBackwardsVisitedString(string,style.wrapperContained)); }
// public static yarnwrap.text.OrderedText styledBackwardsVisitedString(java.lang.String string,yarnwrap.text.Style style, ) { return new yarnwrap.text.OrderedText(net.minecraft.text.OrderedText.styledBackwardsVisitedString(string,style.wrapperContained)); }
// public boolean method_34911(java.lang.String visitor) { return wrapperContained.method_34911(visitor); }
// public static boolean method_34911(java.lang.String visitor, ) { return net.minecraft.text.OrderedText.method_34911(visitor); }

}