package yarnwrap.client.render.model.json;
public class ModelTransformationMode { public net.minecraft.client.render.model.json.ModelTransformationMode wrapperContained; public ModelTransformationMode(net.minecraft.client.render.model.json.ModelTransformationMode wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public java.util.function.IntFunction FROM_INDEX() { return wrapperContained.FROM_INDEX; }
// public byte index() { return wrapperContained.index; }
// public java.lang.String name() { return wrapperContained.name; }
public boolean isFirstPerson() { return wrapperContained.isFirstPerson(); }
public byte getIndex() { return wrapperContained.getIndex(); }

}