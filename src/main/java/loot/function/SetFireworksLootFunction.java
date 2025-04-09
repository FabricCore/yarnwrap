package yarnwrap.loot.function;
public class SetFireworksLootFunction { public net.minecraft.loot.function.SetFireworksLootFunction wrapperContained; public SetFireworksLootFunction(net.minecraft.loot.function.SetFireworksLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.component.type.FireworksComponent DEFAULT_FIREWORKS() { return new yarnwrap.component.type.FireworksComponent(wrapperContained.DEFAULT_FIREWORKS); }
// public java.util.Optional explosions() { return wrapperContained.explosions; }
// public java.util.Optional flightDuration() { return wrapperContained.flightDuration; }
// public yarnwrap.component.type.FireworksComponent apply(yarnwrap.component.type.FireworksComponent fireworksComponent) { return new yarnwrap.component.type.FireworksComponent(wrapperContained.apply(fireworksComponent.wrapperContained)); }

}