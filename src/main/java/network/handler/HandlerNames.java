package yarnwrap.network.handler;
public class HandlerNames { public net.minecraft.network.handler.HandlerNames wrapperContained; public HandlerNames(net.minecraft.network.handler.HandlerNames wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String DECOMPRESS() { return wrapperContained.DECOMPRESS; }
public java.lang.String COMPRESS() { return wrapperContained.COMPRESS; }
public java.lang.String DECODER() { return wrapperContained.DECODER; }
public java.lang.String ENCODER() { return wrapperContained.ENCODER; }
public java.lang.String INBOUND_CONFIG() { return wrapperContained.INBOUND_CONFIG; }
public java.lang.String OUTBOUND_CONFIG() { return wrapperContained.OUTBOUND_CONFIG; }
public java.lang.String SPLITTER() { return wrapperContained.SPLITTER; }
public java.lang.String PREPENDER() { return wrapperContained.PREPENDER; }
public java.lang.String DECRYPT() { return wrapperContained.DECRYPT; }
public java.lang.String ENCRYPT() { return wrapperContained.ENCRYPT; }
public java.lang.String UNBUNDLER() { return wrapperContained.UNBUNDLER; }
public java.lang.String BUNDLER() { return wrapperContained.BUNDLER; }
public java.lang.String PACKET_HANDLER() { return wrapperContained.PACKET_HANDLER; }
public java.lang.String TIMEOUT() { return wrapperContained.TIMEOUT; }
public java.lang.String LEGACY_QUERY() { return wrapperContained.LEGACY_QUERY; }
public java.lang.String LATENCY() { return wrapperContained.LATENCY; }

}