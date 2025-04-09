package yarnwrap.client.option;
public class CloudRenderMode { public net.minecraft.client.option.CloudRenderMode wrapperContained; public CloudRenderMode(net.minecraft.client.option.CloudRenderMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public int id() { return wrapperContained.id; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.lang.String serializedId() { return wrapperContained.serializedId; }

}