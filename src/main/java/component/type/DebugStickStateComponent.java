package yarnwrap.component.type;
public class DebugStickStateComponent { public net.minecraft.component.type.DebugStickStateComponent wrapperContained; public DebugStickStateComponent(net.minecraft.component.type.DebugStickStateComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.DebugStickStateComponent DEFAULT() { return new yarnwrap.component.type.DebugStickStateComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.component.type.DebugStickStateComponent with(yarnwrap.registry.entry.RegistryEntry block,yarnwrap.state.property.Property property) { return new yarnwrap.component.type.DebugStickStateComponent(wrapperContained.with(block.wrapperContained,property.wrapperContained)); }

}