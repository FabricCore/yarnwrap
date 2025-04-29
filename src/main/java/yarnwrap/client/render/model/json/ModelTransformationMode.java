package yarnwrap.client.render.model.json;
public class ModelTransformationMode { public net.minecraft.client.render.model.json.ModelTransformationMode wrapperContained; public ModelTransformationMode(net.minecraft.client.render.model.json.ModelTransformationMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.render.model.json.ModelTransformationMode.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.render.model.json.ModelTransformationMode.CODEC = value; }

// public java.util.function.IntFunction FROM_INDEX() { return wrapperContained.FROM_INDEX; }
// public void FROM_INDEX(java.util.function.IntFunction value) { wrapperContained.FROM_INDEX = value; }
public static java.util.function.IntFunction FROM_INDEX() { return net.minecraft.client.render.model.json.ModelTransformationMode.FROM_INDEX; }
// public static void FROM_INDEX(java.util.function.IntFunction value, ) { net.minecraft.client.render.model.json.ModelTransformationMode.FROM_INDEX = value; }

// public byte index() { return wrapperContained.index; }
// public void index(byte value) { wrapperContained.index = value; }
// public static byte index() { return net.minecraft.client.render.model.json.ModelTransformationMode.index; }
// public static void index(byte value, ) { net.minecraft.client.render.model.json.ModelTransformationMode.index = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.render.model.json.ModelTransformationMode.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.render.model.json.ModelTransformationMode.name = value; }

// // public ModelTransformationMode(java.lang.String index,int name) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelTransformationMode(index,name); }
public boolean isFirstPerson() { return wrapperContained.isFirstPerson(); }
// public static boolean isFirstPerson() { return net.minecraft.client.render.model.json.ModelTransformationMode.isFirstPerson(); }
public byte getIndex() { return wrapperContained.getIndex(); }
// public static byte getIndex() { return net.minecraft.client.render.model.json.ModelTransformationMode.getIndex(); }

}