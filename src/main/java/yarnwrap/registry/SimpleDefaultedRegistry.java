package yarnwrap.registry;
public class SimpleDefaultedRegistry { public net.minecraft.registry.SimpleDefaultedRegistry wrapperContained; public SimpleDefaultedRegistry(net.minecraft.registry.SimpleDefaultedRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier defaultId() { return new yarnwrap.util.Identifier(wrapperContained.defaultId); }
// public void defaultId(yarnwrap.util.Identifier value) { wrapperContained.defaultId = value.wrapperContained; }
// public static yarnwrap.util.Identifier defaultId() { return new yarnwrap.util.Identifier(net.minecraft.registry.SimpleDefaultedRegistry.defaultId); }
// public static void defaultId(yarnwrap.util.Identifier value, ) { net.minecraft.registry.SimpleDefaultedRegistry.defaultId = value.wrapperContained; }

// public Object defaultEntry() { return wrapperContained.defaultEntry; }
// // public void defaultEntry(Object value) { wrapperContained.defaultEntry = value; }
// // public static Object defaultEntry() { return net.minecraft.registry.SimpleDefaultedRegistry.defaultEntry; }
// // public static void defaultEntry(Object value, ) { net.minecraft.registry.SimpleDefaultedRegistry.defaultEntry = value; }

public SimpleDefaultedRegistry(java.lang.String defaultId,yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle,boolean intrusive) { this.wrapperContained = new net.minecraft.registry.SimpleDefaultedRegistry(defaultId,key.wrapperContained,lifecycle,intrusive); }

}