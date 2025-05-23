package yarnwrap.client.item;
public class ItemAsset { public net.minecraft.client.item.ItemAsset wrapperContained; public ItemAsset(net.minecraft.client.item.ItemAsset wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.item.ItemAsset.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.item.ItemAsset.CODEC = value; }

// public ItemAsset(Object model,Object properties) { this.wrapperContained = new net.minecraft.client.item.ItemAsset(model,properties); }
// public com.mojang.datafixers.kinds.App method_65588(Object instance) { return wrapperContained.method_65588(instance); }
// public static com.mojang.datafixers.kinds.App method_65588(Object instance, ) { return net.minecraft.client.item.ItemAsset.method_65588(instance); }
public yarnwrap.client.item.ItemAsset withContextSwapper(yarnwrap.registry.ContextSwapper contextSwapper) { return new yarnwrap.client.item.ItemAsset(wrapperContained.withContextSwapper(contextSwapper.wrapperContained)); }
// public static yarnwrap.client.item.ItemAsset withContextSwapper(yarnwrap.registry.ContextSwapper contextSwapper, ) { return new yarnwrap.client.item.ItemAsset(net.minecraft.client.item.ItemAsset.withContextSwapper(contextSwapper.wrapperContained)); }

}