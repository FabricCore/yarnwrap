package yarnwrap.entity.damage;
public class DamageEffects { public net.minecraft.entity.damage.DamageEffects wrapperContained; public DamageEffects(net.minecraft.entity.damage.DamageEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.damage.DamageEffects.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.damage.DamageEffects.CODEC = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.entity.damage.DamageEffects.id; }
// public static void id(java.lang.String value, ) { net.minecraft.entity.damage.DamageEffects.id = value; }

// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
// public void sound(yarnwrap.sound.SoundEvent value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.damage.DamageEffects.sound); }
// public static void sound(yarnwrap.sound.SoundEvent value, ) { net.minecraft.entity.damage.DamageEffects.sound = value.wrapperContained; }

// // public DamageEffects(java.lang.String id,int sound) { this.wrapperContained = new net.minecraft.entity.damage.DamageEffects(id,sound); }
public yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound()); }
// public static yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.damage.DamageEffects.getSound()); }

}