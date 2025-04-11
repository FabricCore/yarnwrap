package yarnwrap.network.message;
public class FilterMask { public net.minecraft.network.message.FilterMask wrapperContained; public FilterMask(net.minecraft.network.message.FilterMask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.FilterMask FULLY_FILTERED() { return new yarnwrap.network.message.FilterMask(wrapperContained.FULLY_FILTERED); }
// public void FULLY_FILTERED(yarnwrap.network.message.FilterMask value) { wrapperContained.FULLY_FILTERED = value.wrapperContained; }
public yarnwrap.network.message.FilterMask PASS_THROUGH() { return new yarnwrap.network.message.FilterMask(wrapperContained.PASS_THROUGH); }
// public void PASS_THROUGH(yarnwrap.network.message.FilterMask value) { wrapperContained.PASS_THROUGH = value.wrapperContained; }
// public char FILTERED() { return wrapperContained.FILTERED; }
// public void FILTERED(char value) { wrapperContained.FILTERED = value; }
// public java.util.BitSet mask() { return wrapperContained.mask; }
// public void mask(java.util.BitSet value) { wrapperContained.mask = value; }
// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
public yarnwrap.text.Style FILTERED_STYLE() { return new yarnwrap.text.Style(wrapperContained.FILTERED_STYLE); }
// public void FILTERED_STYLE(yarnwrap.text.Style value) { wrapperContained.FILTERED_STYLE = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.MapCodec PASS_THROUGH_CODEC() { return wrapperContained.PASS_THROUGH_CODEC; }
// public void PASS_THROUGH_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.PASS_THROUGH_CODEC = value; }
// public com.mojang.serialization.MapCodec FULLY_FILTERED_CODEC() { return wrapperContained.FULLY_FILTERED_CODEC; }
// public void FULLY_FILTERED_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.FULLY_FILTERED_CODEC = value; }
// public com.mojang.serialization.MapCodec PARTIALLY_FILTERED_CODEC() { return wrapperContained.PARTIALLY_FILTERED_CODEC; }
// public void PARTIALLY_FILTERED_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.PARTIALLY_FILTERED_CODEC = value; }
public FilterMask(int length) { this.wrapperContained = new net.minecraft.network.message.FilterMask(length); }
// public FilterMask(java.util.BitSet mask) { this.wrapperContained = new net.minecraft.network.message.FilterMask(mask); }
// public FilterMask(java.util.BitSet mask,Object status) { this.wrapperContained = new net.minecraft.network.message.FilterMask(mask,status); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public boolean isPassThrough() { return wrapperContained.isPassThrough(); }
public void markFiltered(int index) { wrapperContained.markFiltered(index); }
public java.lang.String filter(java.lang.String raw) { return wrapperContained.filter(raw); }
public yarnwrap.network.message.FilterMask readMask(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.message.FilterMask(wrapperContained.readMask(buf.wrapperContained)); }
public void writeMask(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.message.FilterMask mask) { wrapperContained.writeMask(buf.wrapperContained,mask.wrapperContained); }
public boolean isFullyFiltered() { return wrapperContained.isFullyFiltered(); }
public yarnwrap.text.Text getFilteredText(java.lang.String message) { return new yarnwrap.text.Text(wrapperContained.getFilteredText(message)); }
// public Object getStatus() { return wrapperContained.getStatus(); }
// public java.util.BitSet getMask() { return wrapperContained.getMask(); }

}