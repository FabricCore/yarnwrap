package yarnwrap.text;
public class StringVisitable { public net.minecraft.text.StringVisitable wrapperContained; public StringVisitable(net.minecraft.text.StringVisitable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional TERMINATE_VISIT() { return wrapperContained.TERMINATE_VISIT; }
public yarnwrap.text.StringVisitable EMPTY() { return new yarnwrap.text.StringVisitable(wrapperContained.EMPTY); }
// public java.util.Optional visit(Object visitor) { return wrapperContained.visit(visitor); }
// public java.util.Optional visit(Object styledVisitor,yarnwrap.text.Style style) { return wrapperContained.visit(styledVisitor,style.wrapperContained); }
// public yarnwrap.text.StringVisitable plain(java.lang.String string) { return new yarnwrap.text.StringVisitable(wrapperContained.plain(string)); }
// public yarnwrap.text.StringVisitable styled(java.lang.String string,yarnwrap.text.Style style) { return new yarnwrap.text.StringVisitable(wrapperContained.styled(string,style.wrapperContained)); }
// public yarnwrap.text.StringVisitable concat(java.util.List visitables) { return new yarnwrap.text.StringVisitable(wrapperContained.concat(visitables)); }
// public yarnwrap.text.StringVisitable concat(net.minecraft.text.StringVisitable[] visitables) { return new yarnwrap.text.StringVisitable(wrapperContained.concat(visitables)); }

}