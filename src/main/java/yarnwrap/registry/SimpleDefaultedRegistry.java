package yarnwrap.registry;
public class SimpleDefaultedRegistry { public net.minecraft.registry.SimpleDefaultedRegistry wrapperContained; public SimpleDefaultedRegistry(net.minecraft.registry.SimpleDefaultedRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier defaultId() { return new yarnwrap.util.Identifier(wrapperContained.defaultId); }
// public void defaultId(yarnwrap.util.Identifier value) { wrapperContained.defaultId = value.wrapperContained; }
// public Object defaultEntry() { return wrapperContained.defaultEntry; }
// // public void defaultEntry(Object value) { wrapperContained.defaultEntry = value; }
public SimpleDefaultedRegistry(java.lang.String defaultId,yarnwrap.registry.RegistryKey key,com.mojang.serialization.Lifecycle lifecycle,boolean intrusive) { this.wrapperContained = new net.minecraft.registry.SimpleDefaultedRegistry(defaultId,key.wrapperContained,lifecycle,intrusive); }

}