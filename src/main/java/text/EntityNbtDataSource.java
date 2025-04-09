package yarnwrap.text;
public class EntityNbtDataSource { public net.minecraft.text.EntityNbtDataSource wrapperContained; public EntityNbtDataSource(net.minecraft.text.EntityNbtDataSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String rawSelector() { return wrapperContained.rawSelector; }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
// public java.lang.String rawSelector() { return wrapperContained.rawSelector(); }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector()); }
// public yarnwrap.command.EntitySelector parseSelector(java.lang.String rawSelector) { return new yarnwrap.command.EntitySelector(wrapperContained.parseSelector(rawSelector)); }

}