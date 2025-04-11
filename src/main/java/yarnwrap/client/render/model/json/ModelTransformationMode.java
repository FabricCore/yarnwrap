package yarnwrap.client.render.model.json;
public class ModelTransformationMode { public net.minecraft.client.render.model.json.ModelTransformationMode wrapperContained; public ModelTransformationMode(net.minecraft.client.render.model.json.ModelTransformationMode wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.function.IntFunction FROM_INDEX() { return wrapperContained.FROM_INDEX; }
// public void FROM_INDEX(java.util.function.IntFunction value) { wrapperContained.FROM_INDEX = value; }
// public byte index() { return wrapperContained.index; }
// public void index(byte value) { wrapperContained.index = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public boolean isFirstPerson() { return wrapperContained.isFirstPerson(); }
public byte getIndex() { return wrapperContained.getIndex(); }

}