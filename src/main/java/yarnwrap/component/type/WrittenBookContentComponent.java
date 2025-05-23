package yarnwrap.component.type;
public class WrittenBookContentComponent { public net.minecraft.component.type.WrittenBookContentComponent wrapperContained; public WrittenBookContentComponent(net.minecraft.component.type.WrittenBookContentComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List pages() { return wrapperContained.pages; }
// public void pages(java.util.List value) { wrapperContained.pages = value; }
// public static java.util.List pages() { return net.minecraft.component.type.WrittenBookContentComponent.pages; }
// public static void pages(java.util.List value, ) { net.minecraft.component.type.WrittenBookContentComponent.pages = value; }

// public int MAX_SERIALIZED_PAGE_LENGTH() { return wrapperContained.MAX_SERIALIZED_PAGE_LENGTH; }
// public void MAX_SERIALIZED_PAGE_LENGTH(int value) { wrapperContained.MAX_SERIALIZED_PAGE_LENGTH = value; }
public static int MAX_SERIALIZED_PAGE_LENGTH() { return net.minecraft.component.type.WrittenBookContentComponent.MAX_SERIALIZED_PAGE_LENGTH; }
// public static void MAX_SERIALIZED_PAGE_LENGTH(int value, ) { net.minecraft.component.type.WrittenBookContentComponent.MAX_SERIALIZED_PAGE_LENGTH = value; }

// public int MAX_TITLE_LENGTH() { return wrapperContained.MAX_TITLE_LENGTH; }
// public void MAX_TITLE_LENGTH(int value) { wrapperContained.MAX_TITLE_LENGTH = value; }
public static int MAX_TITLE_LENGTH() { return net.minecraft.component.type.WrittenBookContentComponent.MAX_TITLE_LENGTH; }
// public static void MAX_TITLE_LENGTH(int value, ) { net.minecraft.component.type.WrittenBookContentComponent.MAX_TITLE_LENGTH = value; }

// public int MAX_GENERATION() { return wrapperContained.MAX_GENERATION; }
// public void MAX_GENERATION(int value) { wrapperContained.MAX_GENERATION = value; }
public static int MAX_GENERATION() { return net.minecraft.component.type.WrittenBookContentComponent.MAX_GENERATION; }
// public static void MAX_GENERATION(int value, ) { net.minecraft.component.type.WrittenBookContentComponent.MAX_GENERATION = value; }

// public int UNCOPIABLE_GENERATION() { return wrapperContained.UNCOPIABLE_GENERATION; }
// public void UNCOPIABLE_GENERATION(int value) { wrapperContained.UNCOPIABLE_GENERATION = value; }
public static int UNCOPIABLE_GENERATION() { return net.minecraft.component.type.WrittenBookContentComponent.UNCOPIABLE_GENERATION; }
// public static void UNCOPIABLE_GENERATION(int value, ) { net.minecraft.component.type.WrittenBookContentComponent.UNCOPIABLE_GENERATION = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.WrittenBookContentComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.WrittenBookContentComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.WrittenBookContentComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.WrittenBookContentComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec PAGE_CODEC() { return wrapperContained.PAGE_CODEC; }
// public void PAGE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PAGE_CODEC = value; }
public static com.mojang.serialization.Codec PAGE_CODEC() { return net.minecraft.component.type.WrittenBookContentComponent.PAGE_CODEC; }
// public static void PAGE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.WrittenBookContentComponent.PAGE_CODEC = value; }

// public com.mojang.serialization.Codec PAGES_CODEC() { return wrapperContained.PAGES_CODEC; }
// public void PAGES_CODEC(com.mojang.serialization.Codec value) { wrapperContained.PAGES_CODEC = value; }
public static com.mojang.serialization.Codec PAGES_CODEC() { return net.minecraft.component.type.WrittenBookContentComponent.PAGES_CODEC; }
// public static void PAGES_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.WrittenBookContentComponent.PAGES_CODEC = value; }

// public yarnwrap.component.type.WrittenBookContentComponent DEFAULT() { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.WrittenBookContentComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.WrittenBookContentComponent DEFAULT() { return new yarnwrap.component.type.WrittenBookContentComponent(net.minecraft.component.type.WrittenBookContentComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.WrittenBookContentComponent value, ) { net.minecraft.component.type.WrittenBookContentComponent.DEFAULT = value.wrapperContained; }

public yarnwrap.component.type.WrittenBookContentComponent copy() { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.copy()); }
// public static yarnwrap.component.type.WrittenBookContentComponent copy() { return new yarnwrap.component.type.WrittenBookContentComponent(net.minecraft.component.type.WrittenBookContentComponent.copy()); }
// public com.mojang.datafixers.kinds.App method_57520(Object instance) { return wrapperContained.method_57520(instance); }
// public static com.mojang.datafixers.kinds.App method_57520(Object instance, ) { return net.minecraft.component.type.WrittenBookContentComponent.method_57520(instance); }
public yarnwrap.component.type.WrittenBookContentComponent resolve(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.resolve(source.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.component.type.WrittenBookContentComponent resolve(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.component.type.WrittenBookContentComponent(net.minecraft.component.type.WrittenBookContentComponent.resolve(source.wrapperContained,player.wrapperContained)); }
// public java.util.Optional resolve(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.RawFilteredPair page) { return wrapperContained.resolve(source.wrapperContained,player.wrapperContained,page.wrapperContained); }
// public static java.util.Optional resolve(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.player.PlayerEntity player,yarnwrap.text.RawFilteredPair page, ) { return net.minecraft.component.type.WrittenBookContentComponent.resolve(source.wrapperContained,player.wrapperContained,page.wrapperContained); }
// public java.util.Optional method_57523(yarnwrap.server.command.ServerCommandSource text) { return wrapperContained.method_57523(text.wrapperContained); }
// public static java.util.Optional method_57523(yarnwrap.server.command.ServerCommandSource text, ) { return net.minecraft.component.type.WrittenBookContentComponent.method_57523(text.wrapperContained); }
// public boolean exceedsSerializedLengthLimit(yarnwrap.text.Text text,Object registries) { return wrapperContained.exceedsSerializedLengthLimit(text.wrapperContained,registries); }
// public static boolean exceedsSerializedLengthLimit(yarnwrap.text.Text text,Object registries, ) { return net.minecraft.component.type.WrittenBookContentComponent.exceedsSerializedLengthLimit(text.wrapperContained,registries); }
public java.util.List getPages(boolean shouldFilter) { return wrapperContained.getPages(shouldFilter); }
// public static java.util.List getPages(boolean shouldFilter, ) { return net.minecraft.component.type.WrittenBookContentComponent.getPages(shouldFilter); }
// public yarnwrap.text.Text method_57526(boolean page) { return new yarnwrap.text.Text(wrapperContained.method_57526(page)); }
// public static yarnwrap.text.Text method_57526(boolean page, ) { return new yarnwrap.text.Text(net.minecraft.component.type.WrittenBookContentComponent.method_57526(page)); }
public yarnwrap.component.type.WrittenBookContentComponent asResolved() { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.asResolved()); }
// public static yarnwrap.component.type.WrittenBookContentComponent asResolved() { return new yarnwrap.component.type.WrittenBookContentComponent(net.minecraft.component.type.WrittenBookContentComponent.asResolved()); }
// public com.mojang.serialization.Codec createPagesCodec(com.mojang.serialization.Codec textCodec) { return wrapperContained.createPagesCodec(textCodec); }
// public static com.mojang.serialization.Codec createPagesCodec(com.mojang.serialization.Codec textCodec, ) { return net.minecraft.component.type.WrittenBookContentComponent.createPagesCodec(textCodec); }
// public com.mojang.serialization.Codec createPageCodec(com.mojang.serialization.Codec textCodec) { return wrapperContained.createPageCodec(textCodec); }
// public static com.mojang.serialization.Codec createPageCodec(com.mojang.serialization.Codec textCodec, ) { return net.minecraft.component.type.WrittenBookContentComponent.createPageCodec(textCodec); }
// public boolean resolveInStack(yarnwrap.item.ItemStack stack,yarnwrap.server.command.ServerCommandSource commandSource,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.resolveInStack(stack.wrapperContained,commandSource.wrapperContained,player.wrapperContained); }
// public static boolean resolveInStack(yarnwrap.item.ItemStack stack,yarnwrap.server.command.ServerCommandSource commandSource,yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.component.type.WrittenBookContentComponent.resolveInStack(stack.wrapperContained,commandSource.wrapperContained,player.wrapperContained); }

}