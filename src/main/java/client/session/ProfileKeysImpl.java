package yarnwrap.client.session;
public class ProfileKeysImpl { public net.minecraft.client.session.ProfileKeysImpl wrapperContained; public ProfileKeysImpl(net.minecraft.client.session.ProfileKeysImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.nio.file.Path PROFILE_KEYS_PATH() { return wrapperContained.PROFILE_KEYS_PATH; }
// public java.nio.file.Path jsonPath() { return wrapperContained.jsonPath; }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public java.util.concurrent.CompletableFuture keyFuture() { return wrapperContained.keyFuture; }
// public java.time.Duration TIME_UNTIL_FIRST_EXPIRY_CHECK() { return wrapperContained.TIME_UNTIL_FIRST_EXPIRY_CHECK; }
// public java.time.Instant expiryCheckTime() { return wrapperContained.expiryCheckTime; }
// public void saveKeyPairToFile(yarnwrap.network.encryption.PlayerKeyPair keyPair) { wrapperContained.saveKeyPairToFile(keyPair.wrapperContained); }
// public java.util.concurrent.CompletableFuture getKeyPair(java.util.Optional currentKey) { return wrapperContained.getKeyPair(currentKey); }
// public yarnwrap.network.encryption.PlayerKeyPair fetchKeyPair(com.mojang.authlib.minecraft.UserApiService userApiService) { return new yarnwrap.network.encryption.PlayerKeyPair(wrapperContained.fetchKeyPair(userApiService)); }
// public java.util.Optional loadKeyPairFromFile() { return wrapperContained.loadKeyPairFromFile(); }
// public Object decodeKeyPairResponse(com.mojang.authlib.yggdrasil.response.KeyPairResponse keyPairResponse) { return wrapperContained.decodeKeyPairResponse(keyPairResponse); }

}