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
// public yarnwrap.component.type.FireworksComponent apply(yarnwrap.component.type.FireworksComponent fireworksComponent) { return new yarnwrap.component.type.FireworksComponent(wrapperContained.apply(fireworksComponent.wrapperContained)); }

}