package yarnwrap.network.message;
public class FilterMask { public net.minecraft.network.message.FilterMask wrapperContained; public FilterMask(net.minecraft.network.message.FilterMask wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.FilterMask FULLY_FILTERED() { return new yarnwrap.network.message.FilterMask(wrapperContained.FULLY_FILTERED); }
public yarnwrap.network.message.FilterMask PASS_THROUGH() { return new yarnwrap.network.message.FilterMask(wrapperContained.PASS_THROUGH); }
// public char FILTERED() { return wrapperContained.FILTERED; }
// public java.util.BitSet mask() { return wrapperContained.mask; }
// public Object status() { return wrapperContained.status; }
public yarnwrap.text.Style FILTERED_STYLE() { return new yarnwrap.text.Style(wrapperContained.FILTERED_STYLE); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.MapCodec PASS_THROUGH_CODEC() { return wrapperContained.PASS_THROUGH_CODEC; }
// public com.mojang.serialization.MapCodec FULLY_FILTERED_CODEC() { return wrapperContained.FULLY_FILTERED_CODEC; }
// public com.mojang.serialization.MapCodec PARTIALLY_FILTERED_CODEC() { return wrapperContained.PARTIALLY_FILTERED_CODEC; }
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