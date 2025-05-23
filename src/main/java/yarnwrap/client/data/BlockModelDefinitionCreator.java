package yarnwrap.client.data;
public class BlockModelDefinitionCreator { public net.minecraft.client.data.BlockModelDefinitionCreator wrapperContained; public BlockModelDefinitionCreator(net.minecraft.client.data.BlockModelDefinitionCreator wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
// public static yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(net.minecraft.client.data.BlockModelDefinitionCreator.getBlock()); }
public yarnwrap.client.render.model.json.BlockModelDefinition createBlockModelDefinition() { return new yarnwrap.client.render.model.json.BlockModelDefinition(wrapperContained.createBlockModelDefinition()); }
// public static yarnwrap.client.render.model.json.BlockModelDefinition createBlockModelDefinition() { return new yarnwrap.client.render.model.json.BlockModelDefinition(net.minecraft.client.data.BlockModelDefinitionCreator.createBlockModelDefinition()); }

}