package yarnwrap.network.codec;
public class ValueFirstEncoder { public net.minecraft.network.codec.ValueFirstEncoder wrapperContained; public ValueFirstEncoder(net.minecraft.network.codec.ValueFirstEncoder wrapperContained) { this.wrapperContained = wrapperContained; }

public void encode(java.lang.Object value,java.lang.Object buf) { wrapperContained.encode(value,buf); }
// public static void encode(java.lang.Object value,java.lang.Object buf, ) { net.minecraft.network.codec.ValueFirstEncoder.encode(value,buf); }

}