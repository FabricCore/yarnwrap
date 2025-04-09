package yarnwrap.component.type;
public class WrittenBookContentComponent { public net.minecraft.component.type.WrittenBookContentComponent wrapperContained; public WrittenBookContentComponent(net.minecraft.component.type.WrittenBookContentComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pages() { return wrapperContained.pages; }
public int MAX_SERIALIZED_PAGE_LENGTH() { return wrapperContained.MAX_SERIALIZED_PAGE_LENGTH; }
public int MAX_TITLE_LENGTH() { return wrapperContained.MAX_TITLE_LENGTH; }
public int MAX_GENERATION() { return wrapperContained.MAX_GENERATION; }
public int UNCOPIABLE_GENERATION() { return wrapperContained.UNCOPIABLE_GENERATION; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public com.mojang.serialization.Codec PAGE_CODEC() { return wrapperContained.PAGE_CODEC; }
public com.mojang.serialization.Codec PAGES_CODEC() { return wrapperContained.PAGES_CODEC; }
public yarnwrap.component.type.WrittenBookContentComponent DEFAULT() { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.DEFAULT); }
public yarnwrap.component.type.WrittenBookContentComponent copy() { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.copy()); }
public yarnwrap.component.type.WrittenBookContentComponent resolve(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.resolve(source.wrapperContained,player.wrapperContained)); }
// public java.util.Optional resolve(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.RawFilteredPair page) { return wrapperContained.resolve(source.wrapperContained,player.wrapperContained,page.wrapperContained); }
// public boolean exceedsSerializedLengthLimit(yarnwrap.text.Text text,Object lookup) { return wrapperContained.exceedsSerializedLengthLimit(text.wrapperContained,lookup); }
public java.util.List getPages(boolean shouldFilter) { return wrapperContained.getPages(shouldFilter); }
public yarnwrap.component.type.WrittenBookContentComponent asResolved() { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.asResolved()); }
public com.mojang.serialization.Codec createPagesCodec(com.mojang.serialization.Codec textCodec) { return wrapperContained.createPagesCodec(textCodec); }
// public com.mojang.serialization.Codec createPageCodec(com.mojang.serialization.Codec textCodec) { return wrapperContained.createPageCodec(textCodec); }

}