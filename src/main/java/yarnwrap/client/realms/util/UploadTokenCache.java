package yarnwrap.client.realms.util;
public class UploadTokenCache { public net.minecraft.client.realms.util.UploadTokenCache wrapperContained; public UploadTokenCache(net.minecraft.client.realms.util.UploadTokenCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.Long2ObjectMap TOKEN_CACHE() { return wrapperContained.TOKEN_CACHE; }
// public void TOKEN_CACHE(it.unimi.dsi.fastutil.longs.Long2ObjectMap value) { wrapperContained.TOKEN_CACHE = value; }
public java.lang.String get(long worldId) { return wrapperContained.get(worldId); }
public void put(long wid,java.lang.String token) { wrapperContained.put(wid,token); }
public void invalidate(long world) { wrapperContained.invalidate(world); }

}