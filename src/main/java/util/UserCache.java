package yarnwrap.util;
public class UserCache { public net.minecraft.util.UserCache wrapperContained; public UserCache(net.minecraft.util.UserCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map byUuid() { return wrapperContained.byUuid; }
// public java.util.Map byName() { return wrapperContained.byName; }
// public boolean useRemote() { return wrapperContained.useRemote; }
// public java.io.File cacheFile() { return wrapperContained.cacheFile; }
// public com.mojang.authlib.GameProfileRepository profileRepository() { return wrapperContained.profileRepository; }
// public com.google.gson.Gson gson() { return wrapperContained.gson; }
// public java.util.concurrent.atomic.AtomicLong accessCount() { return wrapperContained.accessCount; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int MAX_SAVED_ENTRIES() { return wrapperContained.MAX_SAVED_ENTRIES; }
// public java.util.Map pendingRequests() { return wrapperContained.pendingRequests; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
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
// public java.util.Optional entryFromJson(com.google.gson.JsonElement json,java.text.DateFormat dateFormat) { return wrapperContained.entryFromJson(json,dateFormat); }
// public long incrementAndGetAccessCount() { return wrapperContained.incrementAndGetAccessCount(); }
// public java.text.DateFormat getDateFormat() { return wrapperContained.getDateFormat(); }
public java.util.concurrent.CompletableFuture findByNameAsync(java.lang.String username) { return wrapperContained.findByNameAsync(username); }
public void setExecutor(java.util.concurrent.Executor executor) { wrapperContained.setExecutor(executor); }
public void clearExecutor() { wrapperContained.clearExecutor(); }
// public java.util.Optional getOfflinePlayerProfile(java.lang.String name) { return wrapperContained.getOfflinePlayerProfile(name); }

}