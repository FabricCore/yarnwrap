package yarnwrap.entity.damage;
public class DamageScaling { public net.minecraft.entity.damage.DamageScaling wrapperContained; public DamageScaling(net.minecraft.entity.damage.DamageScaling wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }

}