package yarnwrap.loot.function;
public class SetFireworkExplosionLootFunction { public net.minecraft.loot.function.SetFireworkExplosionLootFunction wrapperContained; public SetFireworkExplosionLootFunction(net.minecraft.loot.function.SetFireworkExplosionLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.component.type.FireworkExplosionComponent DEFAULT_EXPLOSION() { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.DEFAULT_EXPLOSION); }
// public void DEFAULT_EXPLOSION(yarnwrap.component.type.FireworkExplosionComponent value) { wrapperContained.DEFAULT_EXPLOSION = value.wrapperContained; }
// public java.util.Optional shape() { return wrapperContained.shape; }
// public void shape(java.util.Optional value) { wrapperContained.shape = value; }
// public java.util.Optional colors() { return wrapperContained.colors; }
// public void colors(java.util.Optional value) { wrapperContained.colors = value; }
// public java.util.Optional fadeColors() { return wrapperContained.fadeColors; }
// public void fadeColors(java.util.Optional value) { wrapperContained.fadeColors = value; }
// public java.util.Optional trail() { return wrapperContained.trail; }
// public void trail(java.util.Optional value) { wrapperContained.trail = value; }
// public java.util.Optional twinkle() { return wrapperContained.twinkle; }
// public void twinkle(java.util.Optional value) { wrapperContained.twinkle = value; }
public SetFireworkExplosionLootFunction(java.util.List conditions,java.util.Optional shape,java.util.Optional colors,java.util.Optional fadeColors,java.util.Optional trail,java.util.Optional twinkle) { this.wrapperContained = new net.minecraft.loot.function.SetFireworkExplosionLootFunction(conditions,shape,colors,fadeColors,trail,twinkle); }
// public yarnwrap.component.type.FireworkExplosionComponent apply(yarnwrap.component.type.FireworkExplosionComponent current) { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.apply(current.wrapperContained)); }
// public java.util.Optional method_58206(yarnwrap.loot.function.SetFireworkExplosionLootFunction function) { return wrapperContained.method_58206(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_58207(Object instance) { return wrapperContained.method_58207(instance); }
// public java.util.Optional method_58208(yarnwrap.loot.function.SetFireworkExplosionLootFunction function) { return wrapperContained.method_58208(function.wrapperContained); }
// public java.util.Optional method_58209(yarnwrap.loot.function.SetFireworkExplosionLootFunction function) { return wrapperContained.method_58209(function.wrapperContained); }
// public java.util.Optional method_58210(yarnwrap.loot.function.SetFireworkExplosionLootFunction function) { return wrapperContained.method_58210(function.wrapperContained); }
// public java.util.Optional method_58211(yarnwrap.loot.function.SetFireworkExplosionLootFunction function) { return wrapperContained.method_58211(function.wrapperContained); }

}