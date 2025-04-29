package yarnwrap.world.storage;
public class StorageKey { public net.minecraft.world.storage.StorageKey wrapperContained; public StorageKey(net.minecraft.world.storage.StorageKey wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.storage.StorageKey withSuffix(java.lang.String suffix) { return new yarnwrap.world.storage.StorageKey(wrapperContained.withSuffix(suffix)); }
// public static yarnwrap.world.storage.StorageKey withSuffix(java.lang.String suffix, ) { return new yarnwrap.world.storage.StorageKey(net.minecraft.world.storage.StorageKey.withSuffix(suffix)); }

}