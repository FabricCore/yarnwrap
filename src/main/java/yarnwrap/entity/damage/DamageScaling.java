package yarnwrap.entity.damage;
public class DamageScaling { public net.minecraft.entity.damage.DamageScaling wrapperContained; public DamageScaling(net.minecraft.entity.damage.DamageScaling wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.damage.DamageScaling.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.damage.DamageScaling.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.entity.damage.DamageScaling.id; }
// public static void id(java.lang.String value, ) { net.minecraft.entity.damage.DamageScaling.id = value; }

// public DamageScaling(java.lang.String id) { this.wrapperContained = new net.minecraft.entity.damage.DamageScaling(id); }

}