package yarnwrap.text;
public class SelectorTextContent { public net.minecraft.text.SelectorTextContent wrapperContained; public SelectorTextContent(net.minecraft.text.SelectorTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String pattern() { return wrapperContained.pattern; }
// public void pattern(java.lang.String value) { wrapperContained.pattern = value; }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
// public void selector(yarnwrap.command.EntitySelector value) { wrapperContained.selector = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Optional separator() { return wrapperContained.separator; }
// public void separator(java.util.Optional value) { wrapperContained.separator = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
public SelectorTextContent(java.lang.String pattern,java.util.Optional separator) { this.wrapperContained = new net.minecraft.text.SelectorTextContent(pattern,separator); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.lang.String getPattern() { return wrapperContained.getPattern(); }
public yarnwrap.command.EntitySelector getSelector() { return new yarnwrap.command.EntitySelector(wrapperContained.getSelector()); }
public java.util.Optional getSeparator() { return wrapperContained.getSeparator(); }
// public yarnwrap.command.EntitySelector readSelector(java.lang.String pattern) { return new yarnwrap.command.EntitySelector(wrapperContained.readSelector(pattern)); }
// public com.mojang.datafixers.kinds.App method_54234(Object instance) { return wrapperContained.method_54234(instance); }

}