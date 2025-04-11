package yarnwrap.network.encryption;
public class NetworkEncryptionException { public net.minecraft.network.encryption.NetworkEncryptionException wrapperContained; public NetworkEncryptionException(net.minecraft.network.encryption.NetworkEncryptionException wrapperContained) { this.wrapperContained = wrapperContained; }

public NetworkEncryptionException(java.lang.Throwable throwable) { this.wrapperContained = new net.minecraft.network.encryption.NetworkEncryptionException(throwable); }

}