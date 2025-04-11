package yarnwrap.item;
public class BlockPredicatesChecker { public net.minecraft.item.BlockPredicatesChecker wrapperContained; public BlockPredicatesChecker(net.minecraft.item.BlockPredicatesChecker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.pattern.CachedBlockPosition cachedPos() { return new yarnwrap.block.pattern.CachedBlockPosition(wrapperContained.cachedPos); }
// public void cachedPos(yarnwrap.block.pattern.CachedBlockPosition value) { wrapperContained.cachedPos = value.wrapperContained; }
// public boolean lastResult() { return wrapperContained.lastResult; }
// public void lastResult(boolean value) { wrapperContained.lastResult = value; }
// public boolean nbtAware() { return wrapperContained.nbtAware; }
// public void nbtAware(boolean value) { wrapperContained.nbtAware = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.text.Text CAN_BREAK_TEXT() { return new yarnwrap.text.Text(wrapperContained.CAN_BREAK_TEXT); }
// public void CAN_BREAK_TEXT(yarnwrap.text.Text value) { wrapperContained.CAN_BREAK_TEXT = value.wrapperContained; }
public yarnwrap.text.Text CAN_PLACE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CAN_PLACE_TEXT); }
// public void CAN_PLACE_TEXT(yarnwrap.text.Text value) { wrapperContained.CAN_PLACE_TEXT = value.wrapperContained; }
// public com.mojang.serialization.Codec SINGLE_CODEC() { return wrapperContained.SINGLE_CODEC; }
// public void SINGLE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SINGLE_CODEC = value; }
// public com.mojang.serialization.Codec FULL_CODEC() { return wrapperContained.FULL_CODEC; }
// public void FULL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.FULL_CODEC = value; }
// public yarnwrap.text.Text CAN_USE_UNKNOWN_TEXT() { return new yarnwrap.text.Text(wrapperContained.CAN_USE_UNKNOWN_TEXT); }
// public void CAN_USE_UNKNOWN_TEXT(yarnwrap.text.Text value) { wrapperContained.CAN_USE_UNKNOWN_TEXT = value.wrapperContained; }
// public java.util.List predicates() { return wrapperContained.predicates; }
// public void predicates(java.util.List value) { wrapperContained.predicates = value; }
// public boolean showInTooltip() { return wrapperContained.showInTooltip; }
// public void showInTooltip(boolean value) { wrapperContained.showInTooltip = value; }
// public java.util.List tooltipText() { return wrapperContained.tooltipText; }
// public void tooltipText(java.util.List value) { wrapperContained.tooltipText = value; }
public boolean check(yarnwrap.block.pattern.CachedBlockPosition cachedPos) { return wrapperContained.check(cachedPos.wrapperContained); }
// public boolean canUseCache(yarnwrap.block.pattern.CachedBlockPosition pos,yarnwrap.block.pattern.CachedBlockPosition cachedPos,boolean nbtAware) { return wrapperContained.canUseCache(pos.wrapperContained,cachedPos.wrapperContained,nbtAware); }
// public boolean showInTooltip() { return wrapperContained.showInTooltip(); }
// public java.util.List getTooltipText(java.util.List blockPredicates) { return wrapperContained.getTooltipText(blockPredicates); }
public void addTooltips(java.util.function.Consumer adder) { wrapperContained.addTooltips(adder); }
public yarnwrap.item.BlockPredicatesChecker withShowInTooltip(boolean showInTooltip) { return new yarnwrap.item.BlockPredicatesChecker(wrapperContained.withShowInTooltip(showInTooltip)); }

}