package yarnwrap.network.encryption;
public class PlayerKeyPair { public net.minecraft.network.encryption.PlayerKeyPair wrapperContained; public PlayerKeyPair(net.minecraft.network.encryption.PlayerKeyPair wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public boolean isExpired() { return wrapperContained.isExpired(); }
// public com.mojang.datafixers.kinds.App method_43547(Object instance) { return wrapperContained.method_43547(instance); }

}