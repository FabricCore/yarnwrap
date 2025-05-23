package yarnwrap.particle;
public class DustColorTransitionParticleEffect { public net.minecraft.particle.DustColorTransitionParticleEffect wrapperContained; public DustColorTransitionParticleEffect(net.minecraft.particle.DustColorTransitionParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public int SCULK_BLUE() { return wrapperContained.SCULK_BLUE; }
// public void SCULK_BLUE(int value) { wrapperContained.SCULK_BLUE = value; }
public static int SCULK_BLUE() { return net.minecraft.particle.DustColorTransitionParticleEffect.SCULK_BLUE; }
// public static void SCULK_BLUE(int value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.SCULK_BLUE = value; }

// public yarnwrap.particle.DustColorTransitionParticleEffect DEFAULT() { return new yarnwrap.particle.DustColorTransitionParticleEffect(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.particle.DustColorTransitionParticleEffect value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.particle.DustColorTransitionParticleEffect DEFAULT() { return new yarnwrap.particle.DustColorTransitionParticleEffect(net.minecraft.particle.DustColorTransitionParticleEffect.DEFAULT); }
// public static void DEFAULT(yarnwrap.particle.DustColorTransitionParticleEffect value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.particle.DustColorTransitionParticleEffect.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.CODEC = value; }

// public int toColor() { return wrapperContained.toColor; }
// public void toColor(int value) { wrapperContained.toColor = value; }
// public static int toColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.toColor; }
// public static void toColor(int value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.toColor = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.DustColorTransitionParticleEffect.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.PACKET_CODEC = value.wrapperContained; }

// public int fromColor() { return wrapperContained.fromColor; }
// public void fromColor(int value) { wrapperContained.fromColor = value; }
// public static int fromColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.fromColor; }
// public static void fromColor(int value, ) { net.minecraft.particle.DustColorTransitionParticleEffect.fromColor = value; }

public DustColorTransitionParticleEffect(int fromColor,int toColor,float scale) { this.wrapperContained = new net.minecraft.particle.DustColorTransitionParticleEffect(fromColor,toColor,scale); }
// public com.mojang.datafixers.kinds.App method_33107(Object instance) { return wrapperContained.method_33107(instance); }
// public static com.mojang.datafixers.kinds.App method_33107(Object instance, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_33107(instance); }
public org.joml.Vector3f getFromColor() { return wrapperContained.getFromColor(); }
// public static org.joml.Vector3f getFromColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.getFromColor(); }
public org.joml.Vector3f getToColor() { return wrapperContained.getToColor(); }
// public static org.joml.Vector3f getToColor() { return net.minecraft.particle.DustColorTransitionParticleEffect.getToColor(); }
// public java.lang.Integer method_65030(yarnwrap.particle.DustColorTransitionParticleEffect particle) { return wrapperContained.method_65030(particle.wrapperContained); }
// public static java.lang.Integer method_65030(yarnwrap.particle.DustColorTransitionParticleEffect particle, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_65030(particle.wrapperContained); }
// public java.lang.Integer method_65031(yarnwrap.particle.DustColorTransitionParticleEffect particle) { return wrapperContained.method_65031(particle.wrapperContained); }
// public static java.lang.Integer method_65031(yarnwrap.particle.DustColorTransitionParticleEffect particle, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_65031(particle.wrapperContained); }
// public java.lang.Integer method_65032(yarnwrap.particle.DustColorTransitionParticleEffect particle) { return wrapperContained.method_65032(particle.wrapperContained); }
// public static java.lang.Integer method_65032(yarnwrap.particle.DustColorTransitionParticleEffect particle, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_65032(particle.wrapperContained); }
// public java.lang.Integer method_65033(yarnwrap.particle.DustColorTransitionParticleEffect particle) { return wrapperContained.method_65033(particle.wrapperContained); }
// public static java.lang.Integer method_65033(yarnwrap.particle.DustColorTransitionParticleEffect particle, ) { return net.minecraft.particle.DustColorTransitionParticleEffect.method_65033(particle.wrapperContained); }

}