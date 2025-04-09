package yarnwrap.network.encryption;
public class PlayerKeyPair { public net.minecraft.network.encryption.PlayerKeyPair wrapperContained; public PlayerKeyPair(net.minecraft.network.encryption.PlayerKeyPair wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean isExpired() { return wrapperContained.isExpired(); }

}