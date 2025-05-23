package yarnwrap.network.packet.s2c.play;
public class CommandTreeS2CPacket { public net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket wrapperContained; public CommandTreeS2CPacket(net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte NODE_TYPE_MASK() { return wrapperContained.NODE_TYPE_MASK; }
// public void NODE_TYPE_MASK(byte value) { wrapperContained.NODE_TYPE_MASK = value; }
// public static byte NODE_TYPE_MASK() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_MASK; }
// public static void NODE_TYPE_MASK(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_MASK = value; }

// public byte EXECUTABLE() { return wrapperContained.EXECUTABLE; }
// public void EXECUTABLE(byte value) { wrapperContained.EXECUTABLE = value; }
// public static byte EXECUTABLE() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.EXECUTABLE; }
// public static void EXECUTABLE(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.EXECUTABLE = value; }

// public byte HAS_REDIRECT() { return wrapperContained.HAS_REDIRECT; }
// public void HAS_REDIRECT(byte value) { wrapperContained.HAS_REDIRECT = value; }
// public static byte HAS_REDIRECT() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.HAS_REDIRECT; }
// public static void HAS_REDIRECT(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.HAS_REDIRECT = value; }

// public byte HAS_SUGGESTION_PROVIDER() { return wrapperContained.HAS_SUGGESTION_PROVIDER; }
// public void HAS_SUGGESTION_PROVIDER(byte value) { wrapperContained.HAS_SUGGESTION_PROVIDER = value; }
// public static byte HAS_SUGGESTION_PROVIDER() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.HAS_SUGGESTION_PROVIDER; }
// public static void HAS_SUGGESTION_PROVIDER(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.HAS_SUGGESTION_PROVIDER = value; }

// public byte NODE_TYPE_ROOT() { return wrapperContained.NODE_TYPE_ROOT; }
// public void NODE_TYPE_ROOT(byte value) { wrapperContained.NODE_TYPE_ROOT = value; }
// public static byte NODE_TYPE_ROOT() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_ROOT; }
// public static void NODE_TYPE_ROOT(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_ROOT = value; }

// public byte NODE_TYPE_LITERAL() { return wrapperContained.NODE_TYPE_LITERAL; }
// public void NODE_TYPE_LITERAL(byte value) { wrapperContained.NODE_TYPE_LITERAL = value; }
// public static byte NODE_TYPE_LITERAL() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_LITERAL; }
// public static void NODE_TYPE_LITERAL(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_LITERAL = value; }

// public byte NODE_TYPE_ARGUMENT() { return wrapperContained.NODE_TYPE_ARGUMENT; }
// public void NODE_TYPE_ARGUMENT(byte value) { wrapperContained.NODE_TYPE_ARGUMENT = value; }
// public static byte NODE_TYPE_ARGUMENT() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_ARGUMENT; }
// public static void NODE_TYPE_ARGUMENT(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.NODE_TYPE_ARGUMENT = value; }

// public int rootSize() { return wrapperContained.rootSize; }
// public void rootSize(int value) { wrapperContained.rootSize = value; }
// public static int rootSize() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.rootSize; }
// public static void rootSize(int value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.rootSize = value; }

// public java.util.List nodes() { return wrapperContained.nodes; }
// public void nodes(java.util.List value) { wrapperContained.nodes = value; }
// public static java.util.List nodes() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.nodes; }
// public static void nodes(java.util.List value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.nodes = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.CODEC = value.wrapperContained; }

// public byte REQUIRES_LEVEL() { return wrapperContained.REQUIRES_LEVEL; }
// public void REQUIRES_LEVEL(byte value) { wrapperContained.REQUIRES_LEVEL = value; }
// public static byte REQUIRES_LEVEL() { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.REQUIRES_LEVEL; }
// public static void REQUIRES_LEVEL(byte value, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.REQUIRES_LEVEL = value; }

// public CommandTreeS2CPacket(com.mojang.brigadier.tree.RootCommandNode rootIndex,Object inspector) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket(rootIndex,inspector); }
// public CommandTreeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket(buf.wrapperContained); }
// public Object createNodeData(com.mojang.brigadier.tree.CommandNode node,Object inspector,it.unimi.dsi.fastutil.objects.Object2IntMap nodeOrdinals) { return wrapperContained.createNodeData(node,inspector,nodeOrdinals); }
// public static Object createNodeData(com.mojang.brigadier.tree.CommandNode node,Object inspector,it.unimi.dsi.fastutil.objects.Object2IntMap nodeOrdinals, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.createNodeData(node,inspector,nodeOrdinals); }
// public Object readArgumentBuilder(yarnwrap.network.PacketByteBuf buf,byte flags) { return wrapperContained.readArgumentBuilder(buf.wrapperContained,flags); }
// public static Object readArgumentBuilder(yarnwrap.network.PacketByteBuf buf,byte flags, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.readArgumentBuilder(buf.wrapperContained,flags); }
// public com.mojang.brigadier.tree.RootCommandNode getCommandTree(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,Object nodeFactory) { return wrapperContained.getCommandTree(commandRegistryAccess.wrapperContained,nodeFactory); }
// public static com.mojang.brigadier.tree.RootCommandNode getCommandTree(yarnwrap.command.CommandRegistryAccess commandRegistryAccess,Object nodeFactory, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.getCommandTree(commandRegistryAccess.wrapperContained,nodeFactory); }
// public Object readCommandNode(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.readCommandNode(buf.wrapperContained); }
// public static Object readCommandNode(yarnwrap.network.PacketByteBuf buf, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.readCommandNode(buf.wrapperContained); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap traverse(com.mojang.brigadier.tree.RootCommandNode commandTree) { return wrapperContained.traverse(commandTree); }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap traverse(com.mojang.brigadier.tree.RootCommandNode commandTree, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.traverse(commandTree); }
// public java.util.List collectNodes(it.unimi.dsi.fastutil.objects.Object2IntMap nodeOrdinals,Object inspector) { return wrapperContained.collectNodes(nodeOrdinals,inspector); }
// public static java.util.List collectNodes(it.unimi.dsi.fastutil.objects.Object2IntMap nodeOrdinals,Object inspector, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.collectNodes(nodeOrdinals,inspector); }
// public void validate(java.util.List nodeDatas) { wrapperContained.validate(nodeDatas); }
// public static void validate(java.util.List nodeDatas, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.validate(nodeDatas); }
// public void method_34119(yarnwrap.network.PacketByteBuf buf2,Object node) { wrapperContained.method_34119(buf2.wrapperContained,node); }
// public static void method_34119(yarnwrap.network.PacketByteBuf buf2,Object node, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.method_34119(buf2.wrapperContained,node); }
// public void validate(java.util.List nodeDatas,java.util.function.BiPredicate validator) { wrapperContained.validate(nodeDatas,validator); }
// public static void validate(java.util.List nodeDatas,java.util.function.BiPredicate validator, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.validate(nodeDatas,validator); }
// public boolean method_42068(java.util.function.BiPredicate index) { return wrapperContained.method_42068(index); }
// public static boolean method_42068(java.util.function.BiPredicate index, ) { return net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.method_42068(index); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.CommandTreeS2CPacket.write(buf.wrapperContained); }

}