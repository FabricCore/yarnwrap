package yarnwrap.network.encoding;
public class StringEncoding { public net.minecraft.network.encoding.StringEncoding wrapperContained; public StringEncoding(net.minecraft.network.encoding.StringEncoding wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String decode(io.netty.buffer.ByteBuf buf,int maxLength) { return wrapperContained.decode(buf,maxLength); }
public void encode(io.netty.buffer.ByteBuf buf,java.lang.CharSequence string,int maxLength) { wrapperContained.encode(buf,string,maxLength); }

}