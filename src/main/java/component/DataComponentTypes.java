package yarnwrap.component;
public class DataComponentTypes { public net.minecraft.component.DataComponentTypes wrapperContained; public DataComponentTypes(net.minecraft.component.DataComponentTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.ComponentMap DEFAULT_ITEM_COMPONENTS() { return new yarnwrap.component.ComponentMap(wrapperContained.DEFAULT_ITEM_COMPONENTS); }
// public yarnwrap.util.dynamic.CodecCache CACHE() { return new yarnwrap.util.dynamic.CodecCache(wrapperContained.CACHE); }
public yarnwrap.component.ComponentType getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.component.ComponentType(wrapperContained.getDefault(registry.wrapperContained)); }
// public yarnwrap.component.ComponentType register(java.lang.String id,java.util.function.UnaryOperator builderOperator) { return new yarnwrap.component.ComponentType(wrapperContained.register(id,builderOperator)); }

}