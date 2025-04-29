package yarnwrap.network.message;
public class FilterMask { public net.minecraft.network.message.FilterMask wrapperContained; public FilterMask(net.minecraft.network.message.FilterMask wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.FilterMask FULLY_FILTERED() { return new yarnwrap.network.message.FilterMask(wrapperContained.FULLY_FILTERED); }
// public void FULLY_FILTERED(yarnwrap.network.message.FilterMask value) { wrapperContained.FULLY_FILTERED = value.wrapperContained; }
public static yarnwrap.network.message.FilterMask FULLY_FILTERED() { return new yarnwrap.network.message.FilterMask(net.minecraft.network.message.FilterMask.FULLY_FILTERED); }
// public static void FULLY_FILTERED(yarnwrap.network.message.FilterMask value, ) { net.minecraft.network.message.FilterMask.FULLY_FILTERED = value.wrapperContained; }

// public yarnwrap.network.message.FilterMask PASS_THROUGH() { return new yarnwrap.network.message.FilterMask(wrapperContained.PASS_THROUGH); }
// public void PASS_THROUGH(yarnwrap.network.message.FilterMask value) { wrapperContained.PASS_THROUGH = value.wrapperContained; }
public static yarnwrap.network.message.FilterMask PASS_THROUGH() { return new yarnwrap.network.message.FilterMask(net.minecraft.network.message.FilterMask.PASS_THROUGH); }
// public static void PASS_THROUGH(yarnwrap.network.message.FilterMask value, ) { net.minecraft.network.message.FilterMask.PASS_THROUGH = value.wrapperContained; }

// public char FILTERED() { return wrapperContained.FILTERED; }
// public void FILTERED(char value) { wrapperContained.FILTERED = value; }
// public static char FILTERED() { return net.minecraft.network.message.FilterMask.FILTERED; }
// public static void FILTERED(char value, ) { net.minecraft.network.message.FilterMask.FILTERED = value; }

// public java.util.BitSet mask() { return wrapperContained.mask; }
// public void mask(java.util.BitSet value) { wrapperContained.mask = value; }
// public static java.util.BitSet mask() { return net.minecraft.network.message.FilterMask.mask; }
// public static void mask(java.util.BitSet value, ) { net.minecraft.network.message.FilterMask.mask = value; }

// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
// // public static Object status() { return net.minecraft.network.message.FilterMask.status; }
// // public static void status(Object value, ) { net.minecraft.network.message.FilterMask.status = value; }

// public yarnwrap.text.Style FILTERED_STYLE() { return new yarnwrap.text.Style(wrapperContained.FILTERED_STYLE); }
// public void FILTERED_STYLE(yarnwrap.text.Style value) { wrapperContained.FILTERED_STYLE = value.wrapperContained; }
public static yarnwrap.text.Style FILTERED_STYLE() { return new yarnwrap.text.Style(net.minecraft.network.message.FilterMask.FILTERED_STYLE); }
// public static void FILTERED_STYLE(yarnwrap.text.Style value, ) { net.minecraft.network.message.FilterMask.FILTERED_STYLE = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.network.message.FilterMask.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.network.message.FilterMask.CODEC = value; }

// public com.mojang.serialization.MapCodec PASS_THROUGH_CODEC() { return wrapperContained.PASS_THROUGH_CODEC; }
// public void PASS_THROUGH_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.PASS_THROUGH_CODEC = value; }
// public static com.mojang.serialization.MapCodec PASS_THROUGH_CODEC() { return net.minecraft.network.message.FilterMask.PASS_THROUGH_CODEC; }
// public static void PASS_THROUGH_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.network.message.FilterMask.PASS_THROUGH_CODEC = value; }

// public com.mojang.serialization.MapCodec FULLY_FILTERED_CODEC() { return wrapperContained.FULLY_FILTERED_CODEC; }
// public void FULLY_FILTERED_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.FULLY_FILTERED_CODEC = value; }
// public static com.mojang.serialization.MapCodec FULLY_FILTERED_CODEC() { return net.minecraft.network.message.FilterMask.FULLY_FILTERED_CODEC; }
// public static void FULLY_FILTERED_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.network.message.FilterMask.FULLY_FILTERED_CODEC = value; }

// public com.mojang.serialization.MapCodec PARTIALLY_FILTERED_CODEC() { return wrapperContained.PARTIALLY_FILTERED_CODEC; }
// public void PARTIALLY_FILTERED_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.PARTIALLY_FILTERED_CODEC = value; }
// public static com.mojang.serialization.MapCodec PARTIALLY_FILTERED_CODEC() { return net.minecraft.network.message.FilterMask.PARTIALLY_FILTERED_CODEC; }
// public static void PARTIALLY_FILTERED_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.network.message.FilterMask.PARTIALLY_FILTERED_CODEC = value; }

public FilterMask(int length) { this.wrapperContained = new net.minecraft.network.message.FilterMask(length); }
// public FilterMask(java.util.BitSet mask) { this.wrapperContained = new net.minecraft.network.message.FilterMask(mask); }
// public FilterMask(java.util.BitSet mask,Object status) { this.wrapperContained = new net.minecraft.network.message.FilterMask(mask,status); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.network.message.FilterMask.equals(o); }
public boolean isPassThrough() { return wrapperContained.isPassThrough(); }
// public static boolean isPassThrough() { return net.minecraft.network.message.FilterMask.isPassThrough(); }
public void markFiltered(int index) { wrapperContained.markFiltered(index); }
// public static void markFiltered(int index, ) { net.minecraft.network.message.FilterMask.markFiltered(index); }
public java.lang.String filter(java.lang.String raw) { return wrapperContained.filter(raw); }
// public static java.lang.String filter(java.lang.String raw, ) { return net.minecraft.network.message.FilterMask.filter(raw); }
// public yarnwrap.network.message.FilterMask readMask(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.message.FilterMask(wrapperContained.readMask(buf.wrapperContained)); }
// public static yarnwrap.network.message.FilterMask readMask(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.message.FilterMask(net.minecraft.network.message.FilterMask.readMask(buf.wrapperContained)); }
// public void writeMask(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.message.FilterMask mask) { wrapperContained.writeMask(buf.wrapperContained,mask.wrapperContained); }
// public static void writeMask(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.message.FilterMask mask, ) { net.minecraft.network.message.FilterMask.writeMask(buf.wrapperContained,mask.wrapperContained); }
public boolean isFullyFiltered() { return wrapperContained.isFullyFiltered(); }
// public static boolean isFullyFiltered() { return net.minecraft.network.message.FilterMask.isFullyFiltered(); }
public yarnwrap.text.Text getFilteredText(java.lang.String message) { return new yarnwrap.text.Text(wrapperContained.getFilteredText(message)); }
// public static yarnwrap.text.Text getFilteredText(java.lang.String message, ) { return new yarnwrap.text.Text(net.minecraft.network.message.FilterMask.getFilteredText(message)); }
// public Object getStatus() { return wrapperContained.getStatus(); }
// public static Object getStatus() { return net.minecraft.network.message.FilterMask.getStatus(); }
// public java.util.BitSet getMask() { return wrapperContained.getMask(); }
// public static java.util.BitSet getMask() { return net.minecraft.network.message.FilterMask.getMask(); }

}