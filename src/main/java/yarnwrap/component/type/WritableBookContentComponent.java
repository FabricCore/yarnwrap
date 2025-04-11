package yarnwrap.component.type;
public class WritableBookContentComponent { public net.minecraft.component.type.WritableBookContentComponent wrapperContained; public WritableBookContentComponent(net.minecraft.component.type.WritableBookContentComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pages() { return wrapperContained.pages; }
// public void pages(java.util.List value) { wrapperContained.pages = value; }
public yarnwrap.component.type.WritableBookContentComponent DEFAULT() { return new yarnwrap.component.type.WritableBookContentComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.WritableBookContentComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public int MAX_PAGE_LENGTH() { return wrapperContained.MAX_PAGE_LENGTH; }
// public void MAX_PAGE_LENGTH(int value) { wrapperContained.MAX_PAGE_LENGTH = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public com.mojang.serialization.Codec PAGE_CODEC() { return wrapperContained.PAGE_CODEC; }
// public void PAGE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PAGE_CODEC = value; }
public com.mojang.serialization.Codec PAGES_CODEC() { return wrapperContained.PAGES_CODEC; }
// public void PAGES_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PAGES_CODEC = value; }
public int MAX_PAGE_COUNT() { return wrapperContained.MAX_PAGE_COUNT; }
// public void MAX_PAGE_COUNT(int value) { wrapperContained.MAX_PAGE_COUNT = value; }
public WritableBookContentComponent(java.util.List pages) { this.wrapperContained = new net.minecraft.component.type.WritableBookContentComponent(pages); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public com.mojang.datafixers.kinds.App method_57516(Object instance) { return wrapperContained.method_57516(instance); }
public java.util.stream.Stream stream(boolean shouldFilter) { return wrapperContained.stream(shouldFilter); }
// public java.lang.String method_57518(boolean page) { return wrapperContained.method_57518(page); }

}