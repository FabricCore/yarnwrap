package yarnwrap.client.model;
public class ModelPartData { public net.minecraft.client.model.ModelPartData wrapperContained; public ModelPartData(net.minecraft.client.model.ModelPartData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List cuboidData() { return wrapperContained.cuboidData; }
// public void cuboidData(java.util.List value) { wrapperContained.cuboidData = value; }
// public yarnwrap.client.model.ModelTransform rotationData() { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotationData); }
// public void rotationData(yarnwrap.client.model.ModelTransform value) { wrapperContained.rotationData = value.wrapperContained; }
// public java.util.Map children() { return wrapperContained.children; }
// public void children(java.util.Map value) { wrapperContained.children = value; }
public yarnwrap.client.model.ModelPart createPart(int textureWidth,int textureHeight) { return new yarnwrap.client.model.ModelPart(wrapperContained.createPart(textureWidth,textureHeight)); }
public yarnwrap.client.model.ModelPartData getChild(java.lang.String name) { return new yarnwrap.client.model.ModelPartData(wrapperContained.getChild(name)); }
public yarnwrap.client.model.ModelPartData addChild(java.lang.String name,yarnwrap.client.model.ModelPartBuilder builder,yarnwrap.client.model.ModelTransform rotationData) { return new yarnwrap.client.model.ModelPartData(wrapperContained.addChild(name,builder.wrapperContained,rotationData.wrapperContained)); }

}