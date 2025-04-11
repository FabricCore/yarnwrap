package yarnwrap.client.render.model;
public class BasicBakedModel { public net.minecraft.client.render.model.BasicBakedModel wrapperContained; public BasicBakedModel(net.minecraft.client.render.model.BasicBakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean isSideLit() { return wrapperContained.isSideLit; }
// public void isSideLit(boolean value) { wrapperContained.isSideLit = value; }
// public java.util.List quads() { return wrapperContained.quads; }
// public void quads(java.util.List value) { wrapperContained.quads = value; }
// public yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.itemPropertyOverrides); }
// public void itemPropertyOverrides(yarnwrap.client.render.model.json.ModelOverrideList value) { wrapperContained.itemPropertyOverrides = value.wrapperContained; }
// public boolean hasDepth() { return wrapperContained.hasDepth; }
// public void hasDepth(boolean value) { wrapperContained.hasDepth = value; }
// public java.util.Map faceQuads() { return wrapperContained.faceQuads; }
// public void faceQuads(java.util.Map value) { wrapperContained.faceQuads = value; }
// public boolean usesAo() { return wrapperContained.usesAo; }
// public void usesAo(boolean value) { wrapperContained.usesAo = value; }
// public yarnwrap.client.texture.Sprite sprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.sprite); }
// public void sprite(yarnwrap.client.texture.Sprite value) { wrapperContained.sprite = value.wrapperContained; }
// public yarnwrap.client.render.model.json.ModelTransformation transformation() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.transformation); }
// public void transformation(yarnwrap.client.render.model.json.ModelTransformation value) { wrapperContained.transformation = value.wrapperContained; }
public BasicBakedModel(java.util.List quads,java.util.Map faceQuads,boolean usesAo,boolean isSideLit,boolean hasDepth,yarnwrap.client.texture.Sprite sprite,yarnwrap.client.render.model.json.ModelTransformation transformation,yarnwrap.client.render.model.json.ModelOverrideList itemPropertyOverrides) { this.wrapperContained = new net.minecraft.client.render.model.BasicBakedModel(quads,faceQuads,usesAo,isSideLit,hasDepth,sprite.wrapperContained,transformation.wrapperContained,itemPropertyOverrides.wrapperContained); }

}