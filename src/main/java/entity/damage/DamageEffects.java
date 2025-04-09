package yarnwrap.entity.damage;
public class DamageEffects { public net.minecraft.entity.damage.DamageEffects wrapperContained; public DamageEffects(net.minecraft.entity.damage.DamageEffects wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String id() { return wrapperContained.id; }
// public yarnwrap.sound.SoundEvent sound() { return new yarnwrap.sound.SoundEvent(wrapperContained.sound); }
public yarnwrap.sound.SoundEvent getSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSound()); }

}