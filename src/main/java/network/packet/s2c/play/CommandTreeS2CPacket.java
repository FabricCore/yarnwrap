package yarnwrap.network.packet.s2c.play;
public class CommandTreeS2CPacket { public net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket wrapperContained; public CommandTreeS2CPacket(net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int rootSize() { return wrapperContained.rootSize; }
// public java.util.List nodes() { return wrapperContained.nodes; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public Object createNodeData(com.mojang.brigadier.tree.CommandNode node,it.unimi.dsi.fastutil.objects.Object2IntMap nodes) { return wrapperContained.createNodeData(node,nodes); }
// public Object readArgumentBuilder(yarnwrap.network.PacketByteBuf buf,byte flags) { return wrapperContained.readArgumentBuilder(buf.wrapperContained,flags); }
public com.mojang.brigadier.tree.RootCommandNode getCommandTree(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return wrapperContained.getCommandTree(commandRegistryAccess.wrapperContained); }
// public Object readCommandNode(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.readCommandNode(buf.wrapperContained); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap traverse(com.mojang.brigadier.tree.RootCommandNode commandTree) { return wrapperContained.traverse(commandTree); }
// public java.util.List collectNodes(it.unimi.dsi.fastutil.objects.Object2IntMap nodes) { return wrapperContained.collectNodes(nodes); }
// public void validate(java.util.List nodeDatas) { wrapperContained.validate(nodeDatas); }
// public void validate(java.util.List nodeDatas,java.util.function.BiPredicate validator) { wrapperContained.validate(nodeDatas,validator); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}