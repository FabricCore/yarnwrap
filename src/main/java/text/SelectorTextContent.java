package yarnwrap.text;
public class SelectorTextContent { public net.minecraft.text.SelectorTextContent wrapperContained; public SelectorTextContent(net.minecraft.text.SelectorTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String pattern() { return wrapperContained.pattern; }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Optional separator() { return wrapperContained.separator; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
public java.lang.String getPattern() { return wrapperContained.getPattern(); }
public yarnwrap.command.EntitySelector getSelector() { return new yarnwrap.command.EntitySelector(wrapperContained.getSelector()); }
public java.util.Optional getSeparator() { return wrapperContained.getSeparator(); }
// public yarnwrap.command.EntitySelector readSelector(java.lang.String pattern) { return new yarnwrap.command.EntitySelector(wrapperContained.readSelector(pattern)); }

}