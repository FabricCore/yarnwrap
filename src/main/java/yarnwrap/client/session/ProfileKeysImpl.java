package yarnwrap.client.session;
public class ProfileKeysImpl { public net.minecraft.client.session.ProfileKeysImpl wrapperContained; public ProfileKeysImpl(net.minecraft.client.session.ProfileKeysImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.nio.file.Path PROFILE_KEYS_PATH() { return wrapperContained.PROFILE_KEYS_PATH; }
// public void PROFILE_KEYS_PATH(java.nio.file.Path value) { wrapperContained.PROFILE_KEYS_PATH = value; }
// public java.nio.file.Path jsonPath() { return wrapperContained.jsonPath; }
// public void jsonPath(java.nio.file.Path value) { wrapperContained.jsonPath = value; }
// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public java.util.concurrent.CompletableFuture keyFuture() { return wrapperContained.keyFuture; }
// public void keyFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.keyFuture = value; }
// public java.time.Duration TIME_UNTIL_FIRST_EXPIRY_CHECK() { return wrapperContained.TIME_UNTIL_FIRST_EXPIRY_CHECK; }
// public void TIME_UNTIL_FIRST_EXPIRY_CHECK(java.time.Duration value) { wrapperContained.TIME_UNTIL_FIRST_EXPIRY_CHECK = value; }
// public java.time.Instant expiryCheckTime() { return wrapperContained.expiryCheckTime; }
// public void expiryCheckTime(java.time.Instant value) { wrapperContained.expiryCheckTime = value; }
public ProfileKeysImpl(com.mojang.authlib.minecraft.UserApiService userApiService,java.util.UUID uuid,java.nio.file.Path root) { this.wrapperContained = new net.minecraft.client.session.ProfileKeysImpl(userApiService,uuid,root); }
// public void saveKeyPairToFile(yarnwrap.network.encryption.PlayerKeyPair keyPair) { wrapperContained.saveKeyPairToFile(keyPair.wrapperContained); }
// public void method_43601(com.google.gson.JsonElement json) { wrapperContained.method_43601(json); }
// public java.util.concurrent.CompletableFuture getKeyPair(java.util.Optional currentKey) { return wrapperContained.getKeyPair(currentKey); }
// public yarnwrap.network.encryption.PlayerKeyPair fetchKeyPair(com.mojang.authlib.minecraft.UserApiService userApiService) { return new yarnwrap.network.encryption.PlayerKeyPair(wrapperContained.fetchKeyPair(userApiService)); }
// public java.util.Optional loadKeyPairFromFile() { return wrapperContained.loadKeyPairFromFile(); }
// public Object decodeKeyPairResponse(com.mojang.authlib.yggdrasil.response.KeyPairResponse keyPairResponse) { return wrapperContained.decodeKeyPairResponse(keyPairResponse); }

}