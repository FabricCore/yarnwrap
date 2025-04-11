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
// public yarnwrap.component.type.FireworkExplosionComponent apply(yarnwrap.component.type.FireworkExplosionComponent current) { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.apply(current.wrapperContained)); }

}