package yarnwrap.client.render.model.json;
public class ModelElementFace { public net.minecraft.client.render.model.json.ModelElementFace wrapperContained; public ModelElementFace(net.minecraft.client.render.model.json.ModelElementFace wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction cullFace() { return new yarnwrap.util.math.Direction(wrapperContained.cullFace); }
// public void cullFace(yarnwrap.util.math.Direction value) { wrapperContained.cullFace = value.wrapperContained; }
// public static yarnwrap.util.math.Direction cullFace() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.json.ModelElementFace.cullFace); }
// public static void cullFace(yarnwrap.util.math.Direction value, ) { net.minecraft.client.render.model.json.ModelElementFace.cullFace = value.wrapperContained; }

// public int tintIndex() { return wrapperContained.tintIndex; }
// public void tintIndex(int value) { wrapperContained.tintIndex = value; }
// public static int tintIndex() { return net.minecraft.client.render.model.json.ModelElementFace.tintIndex; }
// public static void tintIndex(int value, ) { net.minecraft.client.render.model.json.ModelElementFace.tintIndex = value; }

// public java.lang.String textureId() { return wrapperContained.textureId; }
// public void textureId(java.lang.String value) { wrapperContained.textureId = value; }
// public static java.lang.String textureId() { return net.minecraft.client.render.model.json.ModelElementFace.textureId; }
// public static void textureId(java.lang.String value, ) { net.minecraft.client.render.model.json.ModelElementFace.textureId = value; }

// public yarnwrap.client.render.model.json.ModelElementTexture textureData() { return new yarnwrap.client.render.model.json.ModelElementTexture(wrapperContained.textureData); }
// public void textureData(yarnwrap.client.render.model.json.ModelElementTexture value) { wrapperContained.textureData = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ModelElementTexture textureData() { return new yarnwrap.client.render.model.json.ModelElementTexture(net.minecraft.client.render.model.json.ModelElementFace.textureData); }
// public static void textureData(yarnwrap.client.render.model.json.ModelElementTexture value, ) { net.minecraft.client.render.model.json.ModelElementFace.textureData = value.wrapperContained; }

public ModelElementFace(yarnwrap.util.math.Direction cullFace,int tintIndex,java.lang.String textureId,yarnwrap.client.render.model.json.ModelElementTexture textureData) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelElementFace(cullFace.wrapperContained,tintIndex,textureId,textureData.wrapperContained); }
// public yarnwrap.util.math.Direction cullFace() { return new yarnwrap.util.math.Direction(wrapperContained.cullFace()); }
// // public static yarnwrap.util.math.Direction cullFace() { return new yarnwrap.util.math.Direction(net.minecraft.client.render.model.json.ModelElementFace.cullFace()); }
// public int tintIndex() { return wrapperContained.tintIndex(); }
// // public static int tintIndex() { return net.minecraft.client.render.model.json.ModelElementFace.tintIndex(); }
// public java.lang.String textureId() { return wrapperContained.textureId(); }
// // public static java.lang.String textureId() { return net.minecraft.client.render.model.json.ModelElementFace.textureId(); }
// public yarnwrap.client.render.model.json.ModelElementTexture textureData() { return new yarnwrap.client.render.model.json.ModelElementTexture(wrapperContained.textureData()); }
// // public static yarnwrap.client.render.model.json.ModelElementTexture textureData() { return new yarnwrap.client.render.model.json.ModelElementTexture(net.minecraft.client.render.model.json.ModelElementFace.textureData()); }

}