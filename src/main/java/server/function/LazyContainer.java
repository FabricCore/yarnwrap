package yarnwrap.server.function;
public class LazyContainer { public net.minecraft.server.function.LazyContainer wrapperContained; public LazyContainer(net.minecraft.server.function.LazyContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public java.util.Optional function() { return wrapperContained.function; }
// public boolean initialized() { return wrapperContained.initialized; }
public java.util.Optional get(yarnwrap.server.function.CommandFunctionManager commandFunctionManager) { return wrapperContained.get(commandFunctionManager.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }

}