package yarnwrap.client.render.model.json;
public class ModelElementTexture { public net.minecraft.client.render.model.json.ModelElementTexture wrapperContained; public ModelElementTexture(net.minecraft.client.render.model.json.ModelElementTexture wrapperContained) { this.wrapperContained = wrapperContained; }

public int rotation() { return wrapperContained.rotation; }
// public void rotation(int value) { wrapperContained.rotation = value; }
public float[] uvs() { return wrapperContained.uvs; }
public void uvs(float[] value) { wrapperContained.uvs = value; }
// public ModelElementTexture(float uvs,int rotation) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelElementTexture(uvs,rotation); }
// public int getRotatedUVIndex(int rotation) { return wrapperContained.getRotatedUVIndex(rotation); }
public int getDirectionIndex(int offset) { return wrapperContained.getDirectionIndex(offset); }
public float getU(int rotation) { return wrapperContained.getU(rotation); }
public float getV(int rotation) { return wrapperContained.getV(rotation); }
// public void setUvs(float uvs) { wrapperContained.setUvs(uvs); }

}