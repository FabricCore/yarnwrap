package yarnwrap.registry;
public class SimpleDefaultedRegistry { public net.minecraft.registry.SimpleDefaultedRegistry wrapperContained; public SimpleDefaultedRegistry(net.minecraft.registry.SimpleDefaultedRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier defaultId() { return new yarnwrap.util.Identifier(wrapperContained.defaultId); }
// public Object defaultEntry() { return wrapperContained.defaultEntry; }

}