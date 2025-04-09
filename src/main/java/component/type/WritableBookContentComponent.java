package yarnwrap.component.type;
public class WritableBookContentComponent { public net.minecraft.component.type.WritableBookContentComponent wrapperContained; public WritableBookContentComponent(net.minecraft.component.type.WritableBookContentComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pages() { return wrapperContained.pages; }
public yarnwrap.component.type.WritableBookContentComponent DEFAULT() { return new yarnwrap.component.type.WritableBookContentComponent(wrapperContained.DEFAULT); }
public int MAX_PAGE_LENGTH() { return wrapperContained.MAX_PAGE_LENGTH; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public com.mojang.serialization.Codec PAGE_CODEC() { return wrapperContained.PAGE_CODEC; }
public com.mojang.serialization.Codec PAGES_CODEC() { return wrapperContained.PAGES_CODEC; }
public int MAX_PAGE_COUNT() { return wrapperContained.MAX_PAGE_COUNT; }
public java.util.stream.Stream stream(boolean shouldFilter) { return wrapperContained.stream(shouldFilter); }

}