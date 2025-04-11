package yarnwrap.loot.function;
public class SetFireworksLootFunction { public net.minecraft.loot.function.SetFireworksLootFunction wrapperContained; public SetFireworksLootFunction(net.minecraft.loot.function.SetFireworksLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.component.type.FireworksComponent DEFAULT_FIREWORKS() { return new yarnwrap.component.type.FireworksComponent(wrapperContained.DEFAULT_FIREWORKS); }
// public void DEFAULT_FIREWORKS(yarnwrap.component.type.FireworksComponent value) { wrapperContained.DEFAULT_FIREWORKS = value.wrapperContained; }
// public java.util.Optional explosions() { return wrapperContained.explosions; }
// public void explosions(java.util.Optional value) { wrapperContained.explosions = value; }
// public java.util.Optional flightDuration() { return wrapperContained.flightDuration; }
// public void flightDuration(java.util.Optional value) { wrapperContained.flightDuration = value; }
// public SetFireworksLootFunction(java.util.List conditions,java.util.Optional explosions,java.util.Optional flightDuration) { this.wrapperContained = new net.minecraft.loot.function.SetFireworksLootFunction(conditions,explosions,flightDuration); }
// public yarnwrap.component.type.FireworksComponent apply(yarnwrap.component.type.FireworksComponent fireworksComponent) { return new yarnwrap.component.type.FireworksComponent(wrapperContained.apply(fireworksComponent.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58214(Object instance) { return wrapperContained.method_58214(instance); }
// public java.util.Optional method_58215(yarnwrap.loot.function.SetFireworksLootFunction function) { return wrapperContained.method_58215(function.wrapperContained); }
// public java.util.Optional method_58216(yarnwrap.loot.function.SetFireworksLootFunction function) { return wrapperContained.method_58216(function.wrapperContained); }
// public java.util.List method_59833(yarnwrap.component.type.FireworksComponent values) { return wrapperContained.method_59833(values.wrapperContained); }

}