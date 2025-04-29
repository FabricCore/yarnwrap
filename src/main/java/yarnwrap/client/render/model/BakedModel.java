package yarnwrap.client.render.model;
public class BakedModel { public net.minecraft.client.render.model.BakedModel wrapperContained; public BakedModel(net.minecraft.client.render.model.BakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isSideLit() { return wrapperContained.isSideLit(); }
// public static boolean isSideLit() { return net.minecraft.client.render.model.BakedModel.isSideLit(); }
public java.util.List getQuads(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction face,yarnwrap.util.math.random.Random random) { return wrapperContained.getQuads(state.wrapperContained,face.wrapperContained,random.wrapperContained); }
// public static java.util.List getQuads(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction face,yarnwrap.util.math.random.Random random, ) { return net.minecraft.client.render.model.BakedModel.getQuads(state.wrapperContained,face.wrapperContained,random.wrapperContained); }
public boolean useAmbientOcclusion() { return wrapperContained.useAmbientOcclusion(); }
// public static boolean useAmbientOcclusion() { return net.minecraft.client.render.model.BakedModel.useAmbientOcclusion(); }
public yarnwrap.client.render.model.json.ModelTransformation getTransformation() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.getTransformation()); }
// public static yarnwrap.client.render.model.json.ModelTransformation getTransformation() { return new yarnwrap.client.render.model.json.ModelTransformation(net.minecraft.client.render.model.BakedModel.getTransformation()); }
public yarnwrap.client.render.model.json.ModelOverrideList getOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.getOverrides()); }
// public static yarnwrap.client.render.model.json.ModelOverrideList getOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(net.minecraft.client.render.model.BakedModel.getOverrides()); }
public yarnwrap.client.texture.Sprite getParticleSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getParticleSprite()); }
// public static yarnwrap.client.texture.Sprite getParticleSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BakedModel.getParticleSprite()); }
public boolean hasDepth() { return wrapperContained.hasDepth(); }
// public static boolean hasDepth() { return net.minecraft.client.render.model.BakedModel.hasDepth(); }
public boolean isBuiltin() { return wrapperContained.isBuiltin(); }
// public static boolean isBuiltin() { return net.minecraft.client.render.model.BakedModel.isBuiltin(); }

}