package yarnwrap.client.render.model;
public class BlockModelPart { public net.minecraft.client.render.model.BlockModelPart wrapperContained; public BlockModelPart(net.minecraft.client.render.model.BlockModelPart wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean useAmbientOcclusion() { return wrapperContained.useAmbientOcclusion(); }
// public static boolean useAmbientOcclusion() { return net.minecraft.client.render.model.BlockModelPart.useAmbientOcclusion(); }
public yarnwrap.client.texture.Sprite particleSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.particleSprite()); }
// public static yarnwrap.client.texture.Sprite particleSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BlockModelPart.particleSprite()); }
public java.util.List getQuads(yarnwrap.util.math.Direction side) { return wrapperContained.getQuads(side.wrapperContained); }
// public static java.util.List getQuads(yarnwrap.util.math.Direction side, ) { return net.minecraft.client.render.model.BlockModelPart.getQuads(side.wrapperContained); }

}