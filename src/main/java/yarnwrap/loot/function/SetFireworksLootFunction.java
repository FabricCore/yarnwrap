package yarnwrap.loot.function;
public class SetFireworksLootFunction { public net.minecraft.loot.function.SetFireworksLootFunction wrapperContained; public SetFireworksLootFunction(net.minecraft.loot.function.SetFireworksLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetFireworksLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetFireworksLootFunction.CODEC = value; }

// public yarnwrap.component.type.FireworksComponent DEFAULT_FIREWORKS() { return new yarnwrap.component.type.FireworksComponent(wrapperContained.DEFAULT_FIREWORKS); }
// public void DEFAULT_FIREWORKS(yarnwrap.component.type.FireworksComponent value) { wrapperContained.DEFAULT_FIREWORKS = value.wrapperContained; }
public static yarnwrap.component.type.FireworksComponent DEFAULT_FIREWORKS() { return new yarnwrap.component.type.FireworksComponent(net.minecraft.loot.function.SetFireworksLootFunction.DEFAULT_FIREWORKS); }
// public static void DEFAULT_FIREWORKS(yarnwrap.component.type.FireworksComponent value, ) { net.minecraft.loot.function.SetFireworksLootFunction.DEFAULT_FIREWORKS = value.wrapperContained; }

// public java.util.Optional explosions() { return wrapperContained.explosions; }
// public void explosions(java.util.Optional value) { wrapperContained.explosions = value; }
// public static java.util.Optional explosions() { return net.minecraft.loot.function.SetFireworksLootFunction.explosions; }
// public static void explosions(java.util.Optional value, ) { net.minecraft.loot.function.SetFireworksLootFunction.explosions = value; }

// public java.util.Optional flightDuration() { return wrapperContained.flightDuration; }
// public void flightDuration(java.util.Optional value) { wrapperContained.flightDuration = value; }
// public static java.util.Optional flightDuration() { return net.minecraft.loot.function.SetFireworksLootFunction.flightDuration; }
// public static void flightDuration(java.util.Optional value, ) { net.minecraft.loot.function.SetFireworksLootFunction.flightDuration = value; }

// public SetFireworksLootFunction(java.util.List conditions,java.util.Optional explosions,java.util.Optional flightDuration) { this.wrapperContained = new net.minecraft.loot.function.SetFireworksLootFunction(conditions,explosions,flightDuration); }
// public yarnwrap.component.type.FireworksComponent apply(yarnwrap.component.type.FireworksComponent fireworksComponent) { return new yarnwrap.component.type.FireworksComponent(wrapperContained.apply(fireworksComponent.wrapperContained)); }
// public static yarnwrap.component.type.FireworksComponent apply(yarnwrap.component.type.FireworksComponent fireworksComponent, ) { return new yarnwrap.component.type.FireworksComponent(net.minecraft.loot.function.SetFireworksLootFunction.apply(fireworksComponent.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58214(Object instance) { return wrapperContained.method_58214(instance); }
// public static com.mojang.datafixers.kinds.App method_58214(Object instance, ) { return net.minecraft.loot.function.SetFireworksLootFunction.method_58214(instance); }
// public java.util.Optional method_58215(yarnwrap.loot.function.SetFireworksLootFunction function) { return wrapperContained.method_58215(function.wrapperContained); }
// public static java.util.Optional method_58215(yarnwrap.loot.function.SetFireworksLootFunction function, ) { return net.minecraft.loot.function.SetFireworksLootFunction.method_58215(function.wrapperContained); }
// public java.util.Optional method_58216(yarnwrap.loot.function.SetFireworksLootFunction function) { return wrapperContained.method_58216(function.wrapperContained); }
// public static java.util.Optional method_58216(yarnwrap.loot.function.SetFireworksLootFunction function, ) { return net.minecraft.loot.function.SetFireworksLootFunction.method_58216(function.wrapperContained); }
// public java.util.List method_59833(yarnwrap.component.type.FireworksComponent values) { return wrapperContained.method_59833(values.wrapperContained); }
// public static java.util.List method_59833(yarnwrap.component.type.FireworksComponent values, ) { return net.minecraft.loot.function.SetFireworksLootFunction.method_59833(values.wrapperContained); }

}