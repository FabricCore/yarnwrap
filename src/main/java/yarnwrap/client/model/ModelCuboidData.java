package yarnwrap.client.model;
public class ModelCuboidData { public net.minecraft.client.model.ModelCuboidData wrapperContained; public ModelCuboidData(net.minecraft.client.model.ModelCuboidData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public org.joml.Vector3f offset() { return wrapperContained.offset; }
// public void offset(org.joml.Vector3f value) { wrapperContained.offset = value; }
// public org.joml.Vector3f dimensions() { return wrapperContained.dimensions; }
// public void dimensions(org.joml.Vector3f value) { wrapperContained.dimensions = value; }
// public yarnwrap.client.model.Dilation extraSize() { return new yarnwrap.client.model.Dilation(wrapperContained.extraSize); }
// public void extraSize(yarnwrap.client.model.Dilation value) { wrapperContained.extraSize = value.wrapperContained; }
// public boolean mirror() { return wrapperContained.mirror; }
// public void mirror(boolean value) { wrapperContained.mirror = value; }
// public yarnwrap.client.util.math.Vector2f textureUV() { return new yarnwrap.client.util.math.Vector2f(wrapperContained.textureUV); }
// public void textureUV(yarnwrap.client.util.math.Vector2f value) { wrapperContained.textureUV = value.wrapperContained; }
// public yarnwrap.client.util.math.Vector2f textureScale() { return new yarnwrap.client.util.math.Vector2f(wrapperContained.textureScale); }
// public void textureScale(yarnwrap.client.util.math.Vector2f value) { wrapperContained.textureScale = value.wrapperContained; }
// public java.util.Set directions() { return wrapperContained.directions; }
// public void directions(java.util.Set value) { wrapperContained.directions = value; }
// public ModelCuboidData(java.lang.String name,float textureX,float textureY,float offsetX,float offsetY,float offsetZ,float sizeX,float sizeY,float sizeZ,yarnwrap.client.model.Dilation extra,boolean mirror,float textureScaleX,float textureScaleY,java.util.Set directions) { this.wrapperContained = new net.minecraft.client.model.ModelCuboidData(name,textureX,textureY,offsetX,offsetY,offsetZ,sizeX,sizeY,sizeZ,extra.wrapperContained,mirror,textureScaleX,textureScaleY,directions); }
public Object createCuboid(int textureWidth,int textureHeight) { return wrapperContained.createCuboid(textureWidth,textureHeight); }

}