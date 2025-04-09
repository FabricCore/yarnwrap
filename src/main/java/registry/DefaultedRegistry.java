package yarnwrap.registry;
public class DefaultedRegistry { public net.minecraft.registry.DefaultedRegistry wrapperContained; public DefaultedRegistry(net.minecraft.registry.DefaultedRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier getDefaultId() { return new yarnwrap.util.Identifier(wrapperContained.getDefaultId()); }

}