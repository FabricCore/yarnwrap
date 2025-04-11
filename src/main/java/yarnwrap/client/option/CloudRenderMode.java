package yarnwrap.client.option;
public class CloudRenderMode { public net.minecraft.client.option.CloudRenderMode wrapperContained; public CloudRenderMode(net.minecraft.client.option.CloudRenderMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String serializedId() { return wrapperContained.serializedId; }
// public void serializedId(java.lang.String value) { wrapperContained.serializedId = value; }

}