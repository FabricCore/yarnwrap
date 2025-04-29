package yarnwrap.util;
public class UserCache { public net.minecraft.util.UserCache wrapperContained; public UserCache(net.minecraft.util.UserCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map byUuid() { return wrapperContained.byUuid; }
// public void byUuid(java.util.Map value) { wrapperContained.byUuid = value; }
// public static java.util.Map byUuid() { return net.minecraft.util.UserCache.byUuid; }
// public static void byUuid(java.util.Map value, ) { net.minecraft.util.UserCache.byUuid = value; }

// public java.util.Map byName() { return wrapperContained.byName; }
// public void byName(java.util.Map value) { wrapperContained.byName = value; }
// public static java.util.Map byName() { return net.minecraft.util.UserCache.byName; }
// public static void byName(java.util.Map value, ) { net.minecraft.util.UserCache.byName = value; }

// public boolean useRemote() { return wrapperContained.useRemote; }
// public void useRemote(boolean value) { wrapperContained.useRemote = value; }
// public static boolean useRemote() { return net.minecraft.util.UserCache.useRemote; }
// public static void useRemote(boolean value, ) { net.minecraft.util.UserCache.useRemote = value; }

// public java.io.File cacheFile() { return wrapperContained.cacheFile; }
// public void cacheFile(java.io.File value) { wrapperContained.cacheFile = value; }
// public static java.io.File cacheFile() { return net.minecraft.util.UserCache.cacheFile; }
// public static void cacheFile(java.io.File value, ) { net.minecraft.util.UserCache.cacheFile = value; }

// public com.mojang.authlib.GameProfileRepository profileRepository() { return wrapperContained.profileRepository; }
// public void profileRepository(com.mojang.authlib.GameProfileRepository value) { wrapperContained.profileRepository = value; }
// public static com.mojang.authlib.GameProfileRepository profileRepository() { return net.minecraft.util.UserCache.profileRepository; }
// public static void profileRepository(com.mojang.authlib.GameProfileRepository value, ) { net.minecraft.util.UserCache.profileRepository = value; }

// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public void gson(com.google.gson.Gson value) { wrapperContained.gson = value; }
// public static com.google.gson.Gson gson() { return net.minecraft.util.UserCache.gson; }
// public static void gson(com.google.gson.Gson value, ) { net.minecraft.util.UserCache.gson = value; }

// public java.util.concurrent.atomic.AtomicLong accessCount() { return wrapperContained.accessCount; }
// public void accessCount(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.accessCount = value; }
// public static java.util.concurrent.atomic.AtomicLong accessCount() { return net.minecraft.util.UserCache.accessCount; }
// public static void accessCount(java.util.concurrent.atomic.AtomicLong value, ) { net.minecraft.util.UserCache.accessCount = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.UserCache.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.UserCache.LOGGER = value; }

// public int MAX_SAVED_ENTRIES() { return wrapperContained.MAX_SAVED_ENTRIES; }
// public void MAX_SAVED_ENTRIES(int value) { wrapperContained.MAX_SAVED_ENTRIES = value; }
// public static int MAX_SAVED_ENTRIES() { return net.minecraft.util.UserCache.MAX_SAVED_ENTRIES; }
// public static void MAX_SAVED_ENTRIES(int value, ) { net.minecraft.util.UserCache.MAX_SAVED_ENTRIES = value; }

// public java.util.Map pendingRequests() { return wrapperContained.pendingRequests; }
// public void pendingRequests(java.util.Map value) { wrapperContained.pendingRequests = value; }
// public static java.util.Map pendingRequests() { return net.minecraft.util.UserCache.pendingRequests; }
// public static void pendingRequests(java.util.Map value, ) { net.minecraft.util.UserCache.pendingRequests = value; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.util.UserCache.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.util.UserCache.executor = value; }

public UserCache(com.mojang.authlib.GameProfileRepository profileRepository,java.io.File cacheFile) { this.wrapperContained = new net.minecraft.util.UserCache(profileRepository,cacheFile); }
public void add(com.mojang.authlib.GameProfile profile) { wrapperContained.add(profile); }
// public static void add(com.mojang.authlib.GameProfile profile, ) { net.minecraft.util.UserCache.add(profile); }
// public java.util.Optional findProfileByName(com.mojang.authlib.GameProfileRepository repository,java.lang.String name) { return wrapperContained.findProfileByName(repository,name); }
// public static java.util.Optional findProfileByName(com.mojang.authlib.GameProfileRepository repository,java.lang.String name, ) { return net.minecraft.util.UserCache.findProfileByName(repository,name); }
// public void setUseRemote(boolean value) { wrapperContained.setUseRemote(value); }
// public static void setUseRemote(boolean value, ) { net.minecraft.util.UserCache.setUseRemote(value); }
public java.util.Optional getByUuid(java.util.UUID uuid) { return wrapperContained.getByUuid(uuid); }
// public static java.util.Optional getByUuid(java.util.UUID uuid, ) { return net.minecraft.util.UserCache.getByUuid(uuid); }
// public boolean shouldUseRemote() { return wrapperContained.shouldUseRemote(); }
// public static boolean shouldUseRemote() { return net.minecraft.util.UserCache.shouldUseRemote(); }
public java.util.Optional findByName(java.lang.String name) { return wrapperContained.findByName(name); }
// public static java.util.Optional findByName(java.lang.String name, ) { return net.minecraft.util.UserCache.findByName(name); }
// public java.util.stream.Stream getLastAccessedEntries(int limit) { return wrapperContained.getLastAccessedEntries(limit); }
// public static java.util.stream.Stream getLastAccessedEntries(int limit, ) { return net.minecraft.util.UserCache.getLastAccessedEntries(limit); }
public java.util.List load() { return wrapperContained.load(); }
// public static java.util.List load() { return net.minecraft.util.UserCache.load(); }
public void save() { wrapperContained.save(); }
// public static void save() { net.minecraft.util.UserCache.save(); }
// public void add(Object entry) { wrapperContained.add(entry); }
// public static void add(Object entry, ) { net.minecraft.util.UserCache.add(entry); }
// public com.google.gson.JsonElement entryToJson(Object entry,java.text.DateFormat dateFormat) { return wrapperContained.entryToJson(entry,dateFormat); }
// public static com.google.gson.JsonElement entryToJson(Object entry,java.text.DateFormat dateFormat, ) { return net.minecraft.util.UserCache.entryToJson(entry,dateFormat); }
// public void method_30166(com.google.gson.JsonArray entry) { wrapperContained.method_30166(entry); }
// public static void method_30166(com.google.gson.JsonArray entry, ) { net.minecraft.util.UserCache.method_30166(entry); }
// public java.util.Optional entryFromJson(com.google.gson.JsonElement json,java.text.DateFormat dateFormat) { return wrapperContained.entryFromJson(json,dateFormat); }
// public static java.util.Optional entryFromJson(com.google.gson.JsonElement json,java.text.DateFormat dateFormat, ) { return net.minecraft.util.UserCache.entryFromJson(json,dateFormat); }
// public void method_30168(java.text.DateFormat json) { wrapperContained.method_30168(json); }
// public static void method_30168(java.text.DateFormat json, ) { net.minecraft.util.UserCache.method_30168(json); }
// public long incrementAndGetAccessCount() { return wrapperContained.incrementAndGetAccessCount(); }
// public static long incrementAndGetAccessCount() { return net.minecraft.util.UserCache.incrementAndGetAccessCount(); }
// public java.text.DateFormat getDateFormat() { return wrapperContained.getDateFormat(); }
// public static java.text.DateFormat getDateFormat() { return net.minecraft.util.UserCache.getDateFormat(); }
// public void method_37155(java.lang.String profile,java.util.Optional throwable) { wrapperContained.method_37155(profile,throwable); }
// public static void method_37155(java.lang.String profile,java.util.Optional throwable, ) { net.minecraft.util.UserCache.method_37155(profile,throwable); }
public java.util.concurrent.CompletableFuture findByNameAsync(java.lang.String username) { return wrapperContained.findByNameAsync(username); }
// public static java.util.concurrent.CompletableFuture findByNameAsync(java.lang.String username, ) { return net.minecraft.util.UserCache.findByNameAsync(username); }
public void setExecutor(java.util.concurrent.Executor executor) { wrapperContained.setExecutor(executor); }
// public static void setExecutor(java.util.concurrent.Executor executor, ) { net.minecraft.util.UserCache.setExecutor(executor); }
public void clearExecutor() { wrapperContained.clearExecutor(); }
// public static void clearExecutor() { net.minecraft.util.UserCache.clearExecutor(); }
// public java.util.Optional getOfflinePlayerProfile(java.lang.String name) { return wrapperContained.getOfflinePlayerProfile(name); }
// public static java.util.Optional getOfflinePlayerProfile(java.lang.String name, ) { return net.minecraft.util.UserCache.getOfflinePlayerProfile(name); }

}