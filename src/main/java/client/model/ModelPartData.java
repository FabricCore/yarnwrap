package yarnwrap.client.model;
public class ModelPartData { public net.minecraft.client.model.ModelPartData wrapperContained; public ModelPartData(net.minecraft.client.model.ModelPartData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List cuboidData() { return wrapperContained.cuboidData; }
// public yarnwrap.client.model.ModelTransform rotationData() { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotationData); }
// public java.util.Map children() { return wrapperContained.children; }
public yarnwrap.client.model.ModelPart createPart(int textureWidth,int textureHeight) { return new yarnwrap.client.model.ModelPart(wrapperContained.createPart(textureWidth,textureHeight)); }
public yarnwrap.client.model.ModelPartData getChild(java.lang.String name) { return new yarnwrap.client.model.ModelPartData(wrapperContained.getChild(name)); }
public yarnwrap.client.model.ModelPartData addChild(java.lang.String name,yarnwrap.client.model.ModelPartBuilder builder,yarnwrap.client.model.ModelTransform rotationData) { return new yarnwrap.client.model.ModelPartData(wrapperContained.addChild(name,builder.wrapperContained,rotationData.wrapperContained)); }

}