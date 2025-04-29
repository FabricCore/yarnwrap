package yarnwrap.client.render.model.json;
public class ModelElementTexture { public net.minecraft.client.render.model.json.ModelElementTexture wrapperContained; public ModelElementTexture(net.minecraft.client.render.model.json.ModelElementTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public int rotation() { return wrapperContained.rotation; }
// public void rotation(int value) { wrapperContained.rotation = value; }
// public static int rotation() { return net.minecraft.client.render.model.json.ModelElementTexture.rotation; }
// public static void rotation(int value, ) { net.minecraft.client.render.model.json.ModelElementTexture.rotation = value; }

public float[] uvs() { return wrapperContained.uvs; }
public void uvs(float[] value) { wrapperContained.uvs = value; }
// public static float[] uvs() { return net.minecraft.client.render.model.json.ModelElementTexture.uvs; }
// public static void uvs(float[] value, ) { net.minecraft.client.render.model.json.ModelElementTexture.uvs = value; }

// public ModelElementTexture(float uvs,int rotation) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelElementTexture(uvs,rotation); }
// public int getRotatedUVIndex(int rotation) { return wrapperContained.getRotatedUVIndex(rotation); }
// public static int getRotatedUVIndex(int rotation, ) { return net.minecraft.client.render.model.json.ModelElementTexture.getRotatedUVIndex(rotation); }
public int getDirectionIndex(int offset) { return wrapperContained.getDirectionIndex(offset); }
// public static int getDirectionIndex(int offset, ) { return net.minecraft.client.render.model.json.ModelElementTexture.getDirectionIndex(offset); }
public float getU(int rotation) { return wrapperContained.getU(rotation); }
// public static float getU(int rotation, ) { return net.minecraft.client.render.model.json.ModelElementTexture.getU(rotation); }
public float getV(int rotation) { return wrapperContained.getV(rotation); }
// public static float getV(int rotation, ) { return net.minecraft.client.render.model.json.ModelElementTexture.getV(rotation); }
// public void setUvs(float uvs) { wrapperContained.setUvs(uvs); }
// public static void setUvs(float uvs, ) { net.minecraft.client.render.model.json.ModelElementTexture.setUvs(uvs); }

}