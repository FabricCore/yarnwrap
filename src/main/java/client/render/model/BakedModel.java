package yarnwrap.client.render.model;
public class BakedModel { public net.minecraft.client.render.model.BakedModel wrapperContained; public BakedModel(net.minecraft.client.render.model.BakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isSideLit() { return wrapperContained.isSideLit(); }
public java.util.List getQuads(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction face,yarnwrap.util.math.random.Random random) { return wrapperContained.getQuads(state.wrapperContained,face.wrapperContained,random.wrapperContained); }
public boolean useAmbientOcclusion() { return wrapperContained.useAmbientOcclusion(); }
public yarnwrap.client.render.model.json.ModelTransformation getTransformation() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.getTransformation()); }
public yarnwrap.client.render.model.json.ModelOverrideList getOverrides() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.getOverrides()); }
public yarnwrap.client.texture.Sprite getParticleSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.getParticleSprite()); }
public boolean hasDepth() { return wrapperContained.hasDepth(); }
public boolean isBuiltin() { return wrapperContained.isBuiltin(); }

}