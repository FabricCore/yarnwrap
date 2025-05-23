package yarnwrap.screen.sync;
public class ItemStackHash { public net.minecraft.screen.sync.ItemStackHash wrapperContained; public ItemStackHash(net.minecraft.screen.sync.ItemStackHash wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.screen.sync.ItemStackHash EMPTY() { return new yarnwrap.screen.sync.ItemStackHash(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.screen.sync.ItemStackHash value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.screen.sync.ItemStackHash EMPTY() { return new yarnwrap.screen.sync.ItemStackHash(net.minecraft.screen.sync.ItemStackHash.EMPTY); }
// public static void EMPTY(yarnwrap.screen.sync.ItemStackHash value, ) { net.minecraft.screen.sync.ItemStackHash.EMPTY = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.screen.sync.ItemStackHash.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.screen.sync.ItemStackHash.PACKET_CODEC = value.wrapperContained; }

// public boolean hashEquals(yarnwrap.item.ItemStack stack,Object hasher) { return wrapperContained.hashEquals(stack.wrapperContained,hasher); }
// public static boolean hashEquals(yarnwrap.item.ItemStack stack,Object hasher, ) { return net.minecraft.screen.sync.ItemStackHash.hashEquals(stack.wrapperContained,hasher); }
// public yarnwrap.screen.sync.ItemStackHash method_68851(java.util.Optional hash) { return new yarnwrap.screen.sync.ItemStackHash(wrapperContained.method_68851(hash)); }
// public static yarnwrap.screen.sync.ItemStackHash method_68851(java.util.Optional hash, ) { return new yarnwrap.screen.sync.ItemStackHash(net.minecraft.screen.sync.ItemStackHash.method_68851(hash)); }
// public java.util.Optional method_68852(yarnwrap.screen.sync.ItemStackHash hash) { return wrapperContained.method_68852(hash.wrapperContained); }
// public static java.util.Optional method_68852(yarnwrap.screen.sync.ItemStackHash hash, ) { return net.minecraft.screen.sync.ItemStackHash.method_68852(hash.wrapperContained); }
// public yarnwrap.screen.sync.ItemStackHash fromItemStack(yarnwrap.item.ItemStack stack,Object hasher) { return new yarnwrap.screen.sync.ItemStackHash(wrapperContained.fromItemStack(stack.wrapperContained,hasher)); }
// public static yarnwrap.screen.sync.ItemStackHash fromItemStack(yarnwrap.item.ItemStack stack,Object hasher, ) { return new yarnwrap.screen.sync.ItemStackHash(net.minecraft.screen.sync.ItemStackHash.fromItemStack(stack.wrapperContained,hasher)); }

}