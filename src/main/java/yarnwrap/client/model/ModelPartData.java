package yarnwrap.client.model;
public class ModelPartData { public net.minecraft.client.model.ModelPartData wrapperContained; public ModelPartData(net.minecraft.client.model.ModelPartData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List cuboidData() { return wrapperContained.cuboidData; }
// public void cuboidData(java.util.List value) { wrapperContained.cuboidData = value; }
// public static java.util.List cuboidData() { return net.minecraft.client.model.ModelPartData.cuboidData; }
// public static void cuboidData(java.util.List value, ) { net.minecraft.client.model.ModelPartData.cuboidData = value; }

// public yarnwrap.client.model.ModelTransform rotationData() { return new yarnwrap.client.model.ModelTransform(wrapperContained.rotationData); }
// public void rotationData(yarnwrap.client.model.ModelTransform value) { wrapperContained.rotationData = value.wrapperContained; }
// public static yarnwrap.client.model.ModelTransform rotationData() { return new yarnwrap.client.model.ModelTransform(net.minecraft.client.model.ModelPartData.rotationData); }
// public static void rotationData(yarnwrap.client.model.ModelTransform value, ) { net.minecraft.client.model.ModelPartData.rotationData = value.wrapperContained; }

// public java.util.Map children() { return wrapperContained.children; }
// public void children(java.util.Map value) { wrapperContained.children = value; }
// public static java.util.Map children() { return net.minecraft.client.model.ModelPartData.children; }
// public static void children(java.util.Map value, ) { net.minecraft.client.model.ModelPartData.children = value; }

// public ModelPartData(java.util.List cuboidData,yarnwrap.client.model.ModelTransform rotationData) { this.wrapperContained = new net.minecraft.client.model.ModelPartData(cuboidData,rotationData.wrapperContained); }
public yarnwrap.client.model.ModelPart createPart(int textureWidth,int textureHeight) { return new yarnwrap.client.model.ModelPart(wrapperContained.createPart(textureWidth,textureHeight)); }
// public static yarnwrap.client.model.ModelPart createPart(int textureWidth,int textureHeight, ) { return new yarnwrap.client.model.ModelPart(net.minecraft.client.model.ModelPartData.createPart(textureWidth,textureHeight)); }
public yarnwrap.client.model.ModelPartData getChild(java.lang.String name) { return new yarnwrap.client.model.ModelPartData(wrapperContained.getChild(name)); }
// public static yarnwrap.client.model.ModelPartData getChild(java.lang.String name, ) { return new yarnwrap.client.model.ModelPartData(net.minecraft.client.model.ModelPartData.getChild(name)); }
public yarnwrap.client.model.ModelPartData addChild(java.lang.String name,yarnwrap.client.model.ModelPartBuilder builder,yarnwrap.client.model.ModelTransform rotationData) { return new yarnwrap.client.model.ModelPartData(wrapperContained.addChild(name,builder.wrapperContained,rotationData.wrapperContained)); }
// public static yarnwrap.client.model.ModelPartData addChild(java.lang.String name,yarnwrap.client.model.ModelPartBuilder builder,yarnwrap.client.model.ModelTransform rotationData, ) { return new yarnwrap.client.model.ModelPartData(net.minecraft.client.model.ModelPartData.addChild(name,builder.wrapperContained,rotationData.wrapperContained)); }

}