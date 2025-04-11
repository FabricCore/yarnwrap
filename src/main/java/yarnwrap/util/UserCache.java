package yarnwrap.util;
public class UserCache { public net.minecraft.util.UserCache wrapperContained; public UserCache(net.minecraft.util.UserCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map byUuid() { return wrapperContained.byUuid; }
// public void byUuid(java.util.Map value) { wrapperContained.byUuid = value; }
// public java.util.Map byName() { return wrapperContained.byName; }
// public void byName(java.util.Map value) { wrapperContained.byName = value; }
// public boolean useRemote() { return wrapperContained.useRemote; }
// public void useRemote(boolean value) { wrapperContained.useRemote = value; }
// public java.io.File cacheFile() { return wrapperContained.cacheFile; }
// public void cacheFile(java.io.File value) { wrapperContained.cacheFile = value; }
// public com.mojang.authlib.GameProfileRepository profileRepository() { return wrapperContained.profileRepository; }
// public void profileRepository(com.mojang.authlib.GameProfileRepository value) { wrapperContained.profileRepository = value; }
// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public void gson(com.google.gson.Gson value) { wrapperContained.gson = value; }
// public java.util.concurrent.atomic.AtomicLong accessCount() { return wrapperContained.accessCount; }
// public void accessCount(java.util.concurrent.atomic.AtomicLong value) { wrapperContained.accessCount = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int MAX_SAVED_ENTRIES() { return wrapperContained.MAX_SAVED_ENTRIES; }
// public void MAX_SAVED_ENTRIES(int value) { wrapperContained.MAX_SAVED_ENTRIES = value; }
// public java.util.Map pendingRequests() { return wrapperContained.pendingRequests; }
// public void pendingRequests(java.util.Map value) { wrapperContained.pendingRequests = value; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
public UserCache(com.mojang.authlib.GameProfileRepository profileRepository,java.io.File cacheFile) { this.wrapperContained = new net.minecraft.util.UserCache(profileRepository,cacheFile); }
public void add(com.mojang.authlib.GameProfile profile) { wrapperContained.add(profile); }
// public java.util.Optional findProfileByName(com.mojang.authlib.GameProfileRepository repository,java.lang.String name) { return wrapperContained.findProfileByName(repository,name); }
public void setUseRemote(boolean value) { wrapperContained.setUseRemote(value); }
public java.util.Optional getByUuid(java.util.UUID uuid) { return wrapperContained.getByUuid(uuid); }
// public boolean shouldUseRemote() { return wrapperContained.shouldUseRemote(); }
public java.util.Optional findByName(java.lang.String name) { return wrapperContained.findByName(name); }
// public java.util.stream.Stream getLastAccessedEntries(int limit) { return wrapperContained.getLastAccessedEntries(limit); }
public java.util.List load() { return wrapperContained.load(); }
public void save() { wrapperContained.save(); }
// public void add(Object entry) { wrapperContained.add(entry); }
// public com.google.gson.JsonElement entryToJson(Object entry,java.text.DateFormat dateFormat) { return wrapperContained.entryToJson(entry,dateFormat); }
// public void method_30166(com.google.gson.JsonArray entry) { wrapperContained.method_30166(entry); }
// public java.util.Optional entryFromJson(com.google.gson.JsonElement json,java.text.DateFormat dateFormat) { return wrapperContained.entryFromJson(json,dateFormat); }
// public void method_30168(java.text.DateFormat json) { wrapperContained.method_30168(json); }
// public long incrementAndGetAccessCount() { return wrapperContained.incrementAndGetAccessCount(); }
// public java.text.DateFormat getDateFormat() { return wrapperContained.getDateFormat(); }
// public void method_37155(java.lang.String profile,java.util.Optional throwable) { wrapperContained.method_37155(profile,throwable); }
public java.util.concurrent.CompletableFuture findByNameAsync(java.lang.String username) { return wrapperContained.findByNameAsync(username); }
public void setExecutor(java.util.concurrent.Executor executor) { wrapperContained.setExecutor(executor); }
public void clearExecutor() { wrapperContained.clearExecutor(); }
// public java.util.Optional getOfflinePlayerProfile(java.lang.String name) { return wrapperContained.getOfflinePlayerProfile(name); }

}