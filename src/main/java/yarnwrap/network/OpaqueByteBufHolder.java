package yarnwrap.network;
public class OpaqueByteBufHolder { public net.minecraft.network.OpaqueByteBufHolder wrapperContained; public OpaqueByteBufHolder(net.minecraft.network.OpaqueByteBufHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public OpaqueByteBufHolder(io.netty.buffer.ByteBuf buf) { this.wrapperContained = new net.minecraft.network.OpaqueByteBufHolder(buf); }
// public java.lang.Object pack(java.lang.Object buf) { return wrapperContained.pack(buf); }
// public static java.lang.Object pack(java.lang.Object buf, ) { return net.minecraft.network.OpaqueByteBufHolder.pack(buf); }
// public java.lang.Object unpack(java.lang.Object holder) { return wrapperContained.unpack(holder); }
// public static java.lang.Object unpack(java.lang.Object holder, ) { return net.minecraft.network.OpaqueByteBufHolder.unpack(holder); }
public boolean release(int count) { return wrapperContained.release(count); }
// public static boolean release(int count, ) { return net.minecraft.network.OpaqueByteBufHolder.release(count); }
public io.netty.util.ReferenceCounted retain(int count) { return wrapperContained.retain(count); }
// public static io.netty.util.ReferenceCounted retain(int count, ) { return net.minecraft.network.OpaqueByteBufHolder.retain(count); }
public io.netty.util.ReferenceCounted touch(java.lang.Object object) { return wrapperContained.touch(object); }
// public static io.netty.util.ReferenceCounted touch(java.lang.Object object, ) { return net.minecraft.network.OpaqueByteBufHolder.touch(object); }

}