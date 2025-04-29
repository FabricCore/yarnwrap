package yarnwrap.client.session;
public class ProfileKeysImpl { public net.minecraft.client.session.ProfileKeysImpl wrapperContained; public ProfileKeysImpl(net.minecraft.client.session.ProfileKeysImpl wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.session.ProfileKeysImpl.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.session.ProfileKeysImpl.LOGGER = value; }

// public java.nio.file.Path PROFILE_KEYS_PATH() { return wrapperContained.PROFILE_KEYS_PATH; }
// public void PROFILE_KEYS_PATH(java.nio.file.Path value) { wrapperContained.PROFILE_KEYS_PATH = value; }
// public static java.nio.file.Path PROFILE_KEYS_PATH() { return net.minecraft.client.session.ProfileKeysImpl.PROFILE_KEYS_PATH; }
// public static void PROFILE_KEYS_PATH(java.nio.file.Path value, ) { net.minecraft.client.session.ProfileKeysImpl.PROFILE_KEYS_PATH = value; }

// public java.nio.file.Path jsonPath() { return wrapperContained.jsonPath; }
// public void jsonPath(java.nio.file.Path value) { wrapperContained.jsonPath = value; }
// public static java.nio.file.Path jsonPath() { return net.minecraft.client.session.ProfileKeysImpl.jsonPath; }
// public static void jsonPath(java.nio.file.Path value, ) { net.minecraft.client.session.ProfileKeysImpl.jsonPath = value; }

// public com.mojang.authlib.minecraft.UserApiService userApiService() { return wrapperContained.userApiService; }
// public void userApiService(com.mojang.authlib.minecraft.UserApiService value) { wrapperContained.userApiService = value; }
// public static com.mojang.authlib.minecraft.UserApiService userApiService() { return net.minecraft.client.session.ProfileKeysImpl.userApiService; }
// public static void userApiService(com.mojang.authlib.minecraft.UserApiService value, ) { net.minecraft.client.session.ProfileKeysImpl.userApiService = value; }

// public java.util.concurrent.CompletableFuture keyFuture() { return wrapperContained.keyFuture; }
// public void keyFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.keyFuture = value; }
// public static java.util.concurrent.CompletableFuture keyFuture() { return net.minecraft.client.session.ProfileKeysImpl.keyFuture; }
// public static void keyFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.session.ProfileKeysImpl.keyFuture = value; }

// public java.time.Duration TIME_UNTIL_FIRST_EXPIRY_CHECK() { return wrapperContained.TIME_UNTIL_FIRST_EXPIRY_CHECK; }
// public void TIME_UNTIL_FIRST_EXPIRY_CHECK(java.time.Duration value) { wrapperContained.TIME_UNTIL_FIRST_EXPIRY_CHECK = value; }
// public static java.time.Duration TIME_UNTIL_FIRST_EXPIRY_CHECK() { return net.minecraft.client.session.ProfileKeysImpl.TIME_UNTIL_FIRST_EXPIRY_CHECK; }
// public static void TIME_UNTIL_FIRST_EXPIRY_CHECK(java.time.Duration value, ) { net.minecraft.client.session.ProfileKeysImpl.TIME_UNTIL_FIRST_EXPIRY_CHECK = value; }

// public java.time.Instant expiryCheckTime() { return wrapperContained.expiryCheckTime; }
// public void expiryCheckTime(java.time.Instant value) { wrapperContained.expiryCheckTime = value; }
// public static java.time.Instant expiryCheckTime() { return net.minecraft.client.session.ProfileKeysImpl.expiryCheckTime; }
// public static void expiryCheckTime(java.time.Instant value, ) { net.minecraft.client.session.ProfileKeysImpl.expiryCheckTime = value; }

public ProfileKeysImpl(com.mojang.authlib.minecraft.UserApiService userApiService,java.util.UUID uuid,java.nio.file.Path root) { this.wrapperContained = new net.minecraft.client.session.ProfileKeysImpl(userApiService,uuid,root); }
// public void saveKeyPairToFile(yarnwrap.network.encryption.PlayerKeyPair keyPair) { wrapperContained.saveKeyPairToFile(keyPair.wrapperContained); }
// public static void saveKeyPairToFile(yarnwrap.network.encryption.PlayerKeyPair keyPair, ) { net.minecraft.client.session.ProfileKeysImpl.saveKeyPairToFile(keyPair.wrapperContained); }
// public void method_43601(com.google.gson.JsonElement json) { wrapperContained.method_43601(json); }
// public static void method_43601(com.google.gson.JsonElement json, ) { net.minecraft.client.session.ProfileKeysImpl.method_43601(json); }
// public java.util.concurrent.CompletableFuture getKeyPair(java.util.Optional currentKey) { return wrapperContained.getKeyPair(currentKey); }
// public static java.util.concurrent.CompletableFuture getKeyPair(java.util.Optional currentKey, ) { return net.minecraft.client.session.ProfileKeysImpl.getKeyPair(currentKey); }
// public yarnwrap.network.encryption.PlayerKeyPair fetchKeyPair(com.mojang.authlib.minecraft.UserApiService userApiService) { return new yarnwrap.network.encryption.PlayerKeyPair(wrapperContained.fetchKeyPair(userApiService)); }
// public static yarnwrap.network.encryption.PlayerKeyPair fetchKeyPair(com.mojang.authlib.minecraft.UserApiService userApiService, ) { return new yarnwrap.network.encryption.PlayerKeyPair(net.minecraft.client.session.ProfileKeysImpl.fetchKeyPair(userApiService)); }
// public java.util.Optional loadKeyPairFromFile() { return wrapperContained.loadKeyPairFromFile(); }
// public static java.util.Optional loadKeyPairFromFile() { return net.minecraft.client.session.ProfileKeysImpl.loadKeyPairFromFile(); }
// public Object decodeKeyPairResponse(com.mojang.authlib.yggdrasil.response.KeyPairResponse keyPairResponse) { return wrapperContained.decodeKeyPairResponse(keyPairResponse); }
// public static Object decodeKeyPairResponse(com.mojang.authlib.yggdrasil.response.KeyPairResponse keyPairResponse, ) { return net.minecraft.client.session.ProfileKeysImpl.decodeKeyPairResponse(keyPairResponse); }

}