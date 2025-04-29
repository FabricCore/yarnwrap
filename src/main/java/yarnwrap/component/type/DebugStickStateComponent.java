package yarnwrap.component.type;
public class DebugStickStateComponent { public net.minecraft.component.type.DebugStickStateComponent wrapperContained; public DebugStickStateComponent(net.minecraft.component.type.DebugStickStateComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.DebugStickStateComponent DEFAULT() { return new yarnwrap.component.type.DebugStickStateComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.DebugStickStateComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.DebugStickStateComponent DEFAULT() { return new yarnwrap.component.type.DebugStickStateComponent(net.minecraft.component.type.DebugStickStateComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.DebugStickStateComponent value, ) { net.minecraft.component.type.DebugStickStateComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.DebugStickStateComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.DebugStickStateComponent.CODEC = value; }

// public com.mojang.serialization.Codec method_57465(yarnwrap.registry.entry.RegistryEntry block) { return wrapperContained.method_57465(block.wrapperContained); }
// public static com.mojang.serialization.Codec method_57465(yarnwrap.registry.entry.RegistryEntry block, ) { return net.minecraft.component.type.DebugStickStateComponent.method_57465(block.wrapperContained); }
public yarnwrap.component.type.DebugStickStateComponent with(yarnwrap.registry.entry.RegistryEntry block,yarnwrap.state.property.Property property) { return new yarnwrap.component.type.DebugStickStateComponent(wrapperContained.with(block.wrapperContained,property.wrapperContained)); }
// public static yarnwrap.component.type.DebugStickStateComponent with(yarnwrap.registry.entry.RegistryEntry block,yarnwrap.state.property.Property property, ) { return new yarnwrap.component.type.DebugStickStateComponent(net.minecraft.component.type.DebugStickStateComponent.with(block.wrapperContained,property.wrapperContained)); }
// public com.mojang.serialization.DataResult method_57467(yarnwrap.registry.entry.RegistryEntry property) { return wrapperContained.method_57467(property.wrapperContained); }
// public static com.mojang.serialization.DataResult method_57467(yarnwrap.registry.entry.RegistryEntry property, ) { return net.minecraft.component.type.DebugStickStateComponent.method_57467(property.wrapperContained); }

}