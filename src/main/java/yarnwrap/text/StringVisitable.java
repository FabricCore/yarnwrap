package yarnwrap.text;
public class StringVisitable { public net.minecraft.text.StringVisitable wrapperContained; public StringVisitable(net.minecraft.text.StringVisitable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional TERMINATE_VISIT() { return wrapperContained.TERMINATE_VISIT; }
// public void TERMINATE_VISIT(java.util.Optional value) { wrapperContained.TERMINATE_VISIT = value; }
public static java.util.Optional TERMINATE_VISIT() { return net.minecraft.text.StringVisitable.TERMINATE_VISIT; }
// public static void TERMINATE_VISIT(java.util.Optional value, ) { net.minecraft.text.StringVisitable.TERMINATE_VISIT = value; }

// public yarnwrap.text.StringVisitable EMPTY() { return new yarnwrap.text.StringVisitable(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.StringVisitable value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.text.StringVisitable EMPTY() { return new yarnwrap.text.StringVisitable(net.minecraft.text.StringVisitable.EMPTY); }
// public static void EMPTY(yarnwrap.text.StringVisitable value, ) { net.minecraft.text.StringVisitable.EMPTY = value.wrapperContained; }

// public java.util.Optional visit(Object visitor) { return wrapperContained.visit(visitor); }
// public static java.util.Optional visit(Object visitor, ) { return net.minecraft.text.StringVisitable.visit(visitor); }
// public java.util.Optional visit(Object styledVisitor,yarnwrap.text.Style style) { return wrapperContained.visit(styledVisitor,style.wrapperContained); }
// public static java.util.Optional visit(Object styledVisitor,yarnwrap.text.Style style, ) { return net.minecraft.text.StringVisitable.visit(styledVisitor,style.wrapperContained); }
// public yarnwrap.text.StringVisitable plain(java.lang.String string) { return new yarnwrap.text.StringVisitable(wrapperContained.plain(string)); }
// public static yarnwrap.text.StringVisitable plain(java.lang.String string, ) { return new yarnwrap.text.StringVisitable(net.minecraft.text.StringVisitable.plain(string)); }
// public yarnwrap.text.StringVisitable styled(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.StringVisitable(wrapperContained.styled(string,style.wrapperContained)); }
// public static yarnwrap.text.StringVisitable styled(java.lang.String string,yarnwrap.text.Style style, ) { return new yarnwrap.text.StringVisitable(net.minecraft.text.StringVisitable.styled(string,style.wrapperContained)); }
// public yarnwrap.text.StringVisitable concat(java.util.List visitables) { return new yarnwrap.text.StringVisitable(wrapperContained.concat(visitables)); }
// public static yarnwrap.text.StringVisitable concat(java.util.List visitables, ) { return new yarnwrap.text.StringVisitable(net.minecraft.text.StringVisitable.concat(visitables)); }
// public yarnwrap.text.StringVisitable concat(net.minecraft.text.StringVisitable[] visitables) { return new yarnwrap.text.StringVisitable(wrapperContained.concat(visitables)); }
// public static yarnwrap.text.StringVisitable concat(net.minecraft.text.StringVisitable[] visitables, ) { return new yarnwrap.text.StringVisitable(net.minecraft.text.StringVisitable.concat(visitables)); }
// public java.util.Optional method_30067(java.lang.StringBuilder string) { return wrapperContained.method_30067(string); }
// public static java.util.Optional method_30067(java.lang.StringBuilder string, ) { return net.minecraft.text.StringVisitable.method_30067(string); }

}