package yarnwrap.client.render.model;
public class BasicBakedModel { public net.minecraft.client.render.model.BasicBakedModel wrapperContained; public BasicBakedModel(net.minecraft.client.render.model.BasicBakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isSideLit() { return wrapperContained.isSideLit; }
// public void isSideLit(boolean value) { wrapperContained.isSideLit = value; }
// public static boolean isSideLit() { return net.minecraft.client.render.model.BasicBakedModel.isSideLit; }
// public static void isSideLit(boolean value, ) { net.minecraft.client.render.model.BasicBakedModel.isSideLit = value; }

// public java.util.List quads() { return wrapperContained.quads; }
// public void quads(java.util.List value) { wrapperContained.quads = value; }
// public static java.util.List quads() { return net.minecraft.client.render.model.BasicBakedModel.quads; }
// public static void quads(java.util.List value, ) { net.minecraft.client.render.model.BasicBakedModel.quads = value; }

// public yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.itemPropertyOverrides); }
// public void itemPropertyOverrides(yarnwrap.client.render.model.json.ModelOverrideList value) { wrapperContained.itemPropertyOverrides = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(net.minecraft.client.render.model.BasicBakedModel.itemPropertyOverrides); }
// public static void itemPropertyOverrides(yarnwrap.client.render.model.json.ModelOverrideList value, ) { net.minecraft.client.render.model.BasicBakedModel.itemPropertyOverrides = value.wrapperContained; }

// public boolean hasDepth() { return wrapperContained.hasDepth; }
// public void hasDepth(boolean value) { wrapperContained.hasDepth = value; }
// public static boolean hasDepth() { return net.minecraft.client.render.model.BasicBakedModel.hasDepth; }
// public static void hasDepth(boolean value, ) { net.minecraft.client.render.model.BasicBakedModel.hasDepth = value; }

// public java.util.Map faceQuads() { return wrapperContained.faceQuads; }
// public void faceQuads(java.util.Map value) { wrapperContained.faceQuads = value; }
// public static java.util.Map faceQuads() { return net.minecraft.client.render.model.BasicBakedModel.faceQuads; }
// public static void faceQuads(java.util.Map value, ) { net.minecraft.client.render.model.BasicBakedModel.faceQuads = value; }

// public boolean usesAo() { return wrapperContained.usesAo; }
// public void usesAo(boolean value) { wrapperContained.usesAo = value; }
// public static boolean usesAo() { return net.minecraft.client.render.model.BasicBakedModel.usesAo; }
// public static void usesAo(boolean value, ) { net.minecraft.client.render.model.BasicBakedModel.usesAo = value; }

// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BasicBakedModel.sprite); }
// public static void sprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.render.model.BasicBakedModel.sprite = value.wrapperContained; }

// public yarnwrap.client.render.model.json.ModelTransformation transformation() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformation); }
// public void transformation(yarnwrap.client.render.model.json.ModelTransformation value) { wrapperContained.transformation = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.ModelTransformation transformation() { return new yarnwrap.client.render.model.json.ModelTransformation(net.minecraft.client.render.model.BasicBakedModel.transformation); }
// public static void transformation(yarnwrap.client.render.model.json.ModelTransformation value, ) { net.minecraft.client.render.model.BasicBakedModel.transformation = value.wrapperContained; }

public BasicBakedModel(java.util.List quads,java.util.Map faceQuads,boolean usesAo,boolean isSideLit,boolean hasDepth,yarnwrap.client.texture.Sprite sprite,yarnwrap.client.render.model.json.ModelTransformation transformation,yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides) { this.wrapperContained = new net.minecraft.client.render.model.BasicBakedModel(quads,faceQuads,usesAo,isSideLit,hasDepth,sprite.wrapperContained,transformation.wrapperContained,itemPropertyOverrides.wrapperContained); }

}