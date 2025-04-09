package yarnwrap.loot.function;
public class SetFireworkExplosionLootFunction { public net.minecraft.loot.function.SetFireworkExplosionLootFunction wrapperContained; public SetFireworkExplosionLootFunction(net.minecraft.loot.function.SetFireworkExplosionLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.component.type.FireworkExplosionComponent DEFAULT_EXPLOSION() { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.DEFAULT_EXPLOSION); }
// public java.util.Optional shape() { return wrapperContained.shape; }
// public java.util.Optional colors() { return wrapperContained.colors; }
// public java.util.Optional fadeColors() { return wrapperContained.fadeColors; }
// public java.util.Optional trail() { return wrapperContained.trail; }
// public java.util.Optional twinkle() { return wrapperContained.twinkle; }
// public yarnwrap.component.type.FireworkExplosionComponent apply(yarnwrap.component.type.FireworkExplosionComponent current) { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.apply(current.wrapperContained)); }

}