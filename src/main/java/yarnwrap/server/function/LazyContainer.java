package yarnwrap.server.function;
public class LazyContainer { public net.minecraft.server.function.LazyContainer wrapperContained; public LazyContainer(net.minecraft.server.function.LazyContainer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.server.function.LazyContainer.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.server.function.LazyContainer.id = value.wrapperContained; }

// public java.util.Optional function() { return wrapperContained.function; }
// public void function(java.util.Optional value) { wrapperContained.function = value; }
// public static java.util.Optional function() { return net.minecraft.server.function.LazyContainer.function; }
// public static void function(java.util.Optional value, ) { net.minecraft.server.function.LazyContainer.function = value; }

// public boolean initialized() { return wrapperContained.initialized; }
// public void initialized(boolean value) { wrapperContained.initialized = value; }
// public static boolean initialized() { return net.minecraft.server.function.LazyContainer.initialized; }
// public static void initialized(boolean value, ) { net.minecraft.server.function.LazyContainer.initialized = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.server.function.LazyContainer.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.server.function.LazyContainer.CODEC = value; }

public LazyContainer(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.server.function.LazyContainer(id.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.server.function.LazyContainer.equals(o); }
public java.util.Optional get(yarnwrap.server.function.CommandFunctionManager commandFunctionManager) { return wrapperContained.get(commandFunctionManager.wrapperContained); }
// public static java.util.Optional get(yarnwrap.server.function.CommandFunctionManager commandFunctionManager, ) { return net.minecraft.server.function.LazyContainer.get(commandFunctionManager.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.server.function.LazyContainer.getId()); }

}