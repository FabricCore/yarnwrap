package yarnwrap.text;
public class EntityNbtDataSource { public net.minecraft.text.EntityNbtDataSource wrapperContained; public EntityNbtDataSource(net.minecraft.text.EntityNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawSelector() { return wrapperContained.rawSelector; }
// public void rawSelector(java.lang.String value) { wrapperContained.rawSelector = value; }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
// public void selector(yarnwrap.command.EntitySelector value) { wrapperContained.selector = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public java.lang.String rawSelector() { return wrapperContained.rawSelector(); }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector()); }
// public yarnwrap.command.EntitySelector parseSelector(java.lang.String rawSelector) { return new yarnwrap.command.EntitySelector(wrapperContained.parseSelector(rawSelector)); }

}