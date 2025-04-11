package yarnwrap.entity.damage;
public class DeathMessageType { public net.minecraft.entity.damage.DeathMessageType wrapperContained; public DeathMessageType(net.minecraft.entity.damage.DeathMessageType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }

}