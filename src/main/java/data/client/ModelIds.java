package yarnwrap.data.client;
public class ModelIds { public net.minecraft.data.client.ModelIds wrapperContained; public ModelIds(net.minecraft.data.client.ModelIds wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier getItemModelId(yarnwrap.item.Item item) { return new yarnwrap.util.Identifier(wrapperContained.getItemModelId(item.wrapperContained)); }
public yarnwrap.util.Identifier getItemSubModelId(yarnwrap.item.Item item,java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.getItemSubModelId(item.wrapperContained,suffix)); }
public yarnwrap.util.Identifier getBlockModelId(yarnwrap.block.Block block) { return new yarnwrap.util.Identifier(wrapperContained.getBlockModelId(block.wrapperContained)); }
public yarnwrap.util.Identifier getBlockSubModelId(yarnwrap.block.Block block,java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.getBlockSubModelId(block.wrapperContained,suffix)); }
public yarnwrap.util.Identifier getMinecraftNamespacedBlock(java.lang.String name) { return new yarnwrap.util.Identifier(wrapperContained.getMinecraftNamespacedBlock(name)); }
public yarnwrap.util.Identifier getMinecraftNamespacedItem(java.lang.String name) { return new yarnwrap.util.Identifier(wrapperContained.getMinecraftNamespacedItem(name)); }

}