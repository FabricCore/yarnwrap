package yarnwrap.server.function;
public class LazyContainer { public net.minecraft.server.function.LazyContainer wrapperContained; public LazyContainer(net.minecraft.server.function.LazyContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public java.util.Optional function() { return wrapperContained.function; }
// public void function(java.util.Optional value) { wrapperContained.function = value; }
// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
public LazyContainer(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.server.function.LazyContainer(id.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public java.util.Optional get(yarnwrap.server.function.CommandFunctionManager commandFunctionManager) { return wrapperContained.get(commandFunctionManager.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }

}