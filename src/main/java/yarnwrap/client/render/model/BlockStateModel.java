package yarnwrap.client.render.model;
public class BlockStateModel { public net.minecraft.client.render.model.BlockStateModel wrapperContained; public BlockStateModel(net.minecraft.client.render.model.BlockStateModel wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.texture.Sprite particleSprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.particleSprite()); }
// public static yarnwrap.client.texture.Sprite particleSprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.model.BlockStateModel.particleSprite()); }
public java.util.List getParts(yarnwrap.util.math.random.Random random) { return wrapperContained.getParts(random.wrapperContained); }
// public static java.util.List getParts(yarnwrap.util.math.random.Random random, ) { return net.minecraft.client.render.model.BlockStateModel.getParts(random.wrapperContained); }
public void addParts(yarnwrap.util.math.random.Random random,java.util.List parts) { wrapperContained.addParts(random.wrapperContained,parts); }
// public static void addParts(yarnwrap.util.math.random.Random random,java.util.List parts, ) { net.minecraft.client.render.model.BlockStateModel.addParts(random.wrapperContained,parts); }

}