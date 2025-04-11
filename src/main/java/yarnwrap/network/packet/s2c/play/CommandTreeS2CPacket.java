package yarnwrap.network.packet.s2c.play;
public class CommandTreeS2CPacket { public net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket wrapperContained; public CommandTreeS2CPacket(net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int rootSize() { return wrapperContained.rootSize; }
// public void rootSize(int value) { wrapperContained.rootSize = value; }
// public java.util.List nodes() { return wrapperContained.nodes; }
// public void nodes(java.util.List value) { wrapperContained.nodes = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public CommandTreeS2CPacket(com.mojang.brigadier.tree.RootCommandNode rootNode) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket(rootNode); }
// public CommandTreeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket(buf.wrapperContained); }
// public Object createNodeData(com.mojang.brigadier.tree.CommandNode node,it.unimi.dsi.fastutil.objects.Object2IntMap nodes) { return wrapperContained.createNodeData(node,nodes); }
// public Object readArgumentBuilder(yarnwrap.network.PacketByteBuf buf,byte flags) { return wrapperContained.readArgumentBuilder(buf.wrapperContained,flags); }
public com.mojang.brigadier.tree.RootCommandNode getCommandTree(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return wrapperContained.getCommandTree(commandRegistryAccess.wrapperContained); }
// public Object readCommandNode(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.readCommandNode(buf.wrapperContained); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap traverse(com.mojang.brigadier.tree.RootCommandNode commandTree) { return wrapperContained.traverse(commandTree); }
// public java.util.List collectNodes(it.unimi.dsi.fastutil.objects.Object2IntMap nodes) { return wrapperContained.collectNodes(nodes); }
// public void validate(java.util.List nodeDatas) { wrapperContained.validate(nodeDatas); }
// public void method_34119(yarnwrap.network.PacketByteBuf buf2,Object node) { wrapperContained.method_34119(buf2.wrapperContained,node); }
// public void validate(java.util.List nodeDatas,java.util.function.BiPredicate validator) { wrapperContained.validate(nodeDatas,validator); }
// public boolean method_42068(java.util.function.BiPredicate index) { return wrapperContained.method_42068(index); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}