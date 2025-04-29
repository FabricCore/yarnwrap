package yarnwrap.particle;
public class DustColorTransitionParticleEffect { public net.minecraft.particle.DustColorTransitionParticleEffect wrapperContained; public DustColorTransitionParticleEffect(net.minecraft.particle.DustColorTransitionParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Vector3f SCULK_BLUE() { return wrapperContained.SCULK_BLUE; }
// public void SCULK_BLUE(org.joml.Vector3f value) { wrapperContained.SCULK_BLUE = value; }
public static org.joml.Vector3f SCULK_BLUE() { return net.minecraft.particle.DustColorTransitionParticleEffect.SCULK_BLUE; }
// public static void SCULK_BLUE(org.joml.Vector3f value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.SCULK_BLUE = value; }

// public yarnwrap.particle.DustColorTransitionParticleEffect DEFAULT() { return new yarnwrap.particle.DustColorTransitionParticleEffect(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.particle.DustColorTransitionParticleEffect value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.particle.DustColorTransitionParticleEffect DEFAULT() { return new yarnwrap.particle.DustColorTransitionParticleEffect(net.minecraft.particle.DustColorTransitionParticleEffect.DEFAULT); }
// public static void DEFAULT(yarnwrap.particle.DustColorTransitionParticleEffect value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.particle.DustColorTransitionParticleEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.CODEC = value; }

// public org.joml.Vector3f toColor() { return wrapperContained.toColor; }
// public void toColor(org.joml.Vector3f value) { wrapperContained.toColor = value; }
// public static org.joml.Vector3f toColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.toColor; }
// public static void toColor(org.joml.Vector3f value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.toColor = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.DustColorTransitionParticleEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.PACKET_CODEC = value.wrapperContained; }

// public org.joml.Vector3f fromColor() { return wrapperContained.fromColor; }
// public void fromColor(org.joml.Vector3f value) { wrapperContained.fromColor = value; }
// public static org.joml.Vector3f fromColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.fromColor; }
// public static void fromColor(org.joml.Vector3f value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.fromColor = value; }

public DustColorTransitionParticleEffect(org.joml.Vector3f fromColor,org.joml.Vector3f toColor,float scale) { this.wrapperContained = new net.minecraft.particle.DustColorTransitionParticleEffect(fromColor,toColor,scale); }
// public com.mojang.datafixers.kinds.App method_33107(Object instance) { return wrapperContained.method_33107(instance); }
// public static com.mojang.datafixers.kinds.App method_33107(Object instance, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_33107(instance); }
// public org.joml.Vector3f method_33109(yarnwrap.particle.DustColorTransitionParticleEffect effect) { return wrapperContained.method_33109(effect.wrapperContained); }
// public static org.joml.Vector3f method_33109(yarnwrap.particle.DustColorTransitionParticleEffect effect, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_33109(effect.wrapperContained); }
public org.joml.Vector3f getFromColor() { return wrapperContained.getFromColor(); }
// public static org.joml.Vector3f getFromColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.getFromColor(); }
// public org.joml.Vector3f method_33111(yarnwrap.particle.DustColorTransitionParticleEffect effect) { return wrapperContained.method_33111(effect.wrapperContained); }
// public static org.joml.Vector3f method_33111(yarnwrap.particle.DustColorTransitionParticleEffect effect, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_33111(effect.wrapperContained); }
public org.joml.Vector3f getToColor() { return wrapperContained.getToColor(); }
// public static org.joml.Vector3f getToColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.getToColor(); }
// public org.joml.Vector3f method_56172(yarnwrap.particle.DustColorTransitionParticleEffect effect) { return wrapperContained.method_56172(effect.wrapperContained); }
// public static org.joml.Vector3f method_56172(yarnwrap.particle.DustColorTransitionParticleEffect effect, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_56172(effect.wrapperContained); }
// public org.joml.Vector3f method_56173(yarnwrap.particle.DustColorTransitionParticleEffect effect) { return wrapperContained.method_56173(effect.wrapperContained); }
// public static org.joml.Vector3f method_56173(yarnwrap.particle.DustColorTransitionParticleEffect effect, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_56173(effect.wrapperContained); }

}