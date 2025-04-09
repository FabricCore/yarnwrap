package yarnwrap.item;
public class BlockPredicatesChecker { public net.minecraft.item.BlockPredicatesChecker wrapperContained; public BlockPredicatesChecker(net.minecraft.item.BlockPredicatesChecker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.pattern.CachedBlockPosition cachedPos() { return new yarnwrap.block.pattern.CachedBlockPosition(wrapperContained.cachedPos); }
// public boolean lastResult() { return wrapperContained.lastResult; }
// public boolean nbtAware() { return wrapperContained.nbtAware; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.text.Text CAN_BREAK_TEXT() { return new yarnwrap.text.Text(wrapperContained.CAN_BREAK_TEXT); }
public yarnwrap.text.Text CAN_PLACE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CAN_PLACE_TEXT); }
// public com.mojang.serialization.Codec SINGLE_CODEC() { return wrapperContained.SINGLE_CODEC; }
// public com.mojang.serialization.Codec FULL_CODEC() { return wrapperContained.FULL_CODEC; }
// public yarnwrap.text.Text CAN_USE_UNKNOWN_TEXT() { return new yarnwrap.text.Text(wrapperContained.CAN_USE_UNKNOWN_TEXT); }
// public java.util.List predicates() { return wrapperContained.predicates; }
// public boolean showInTooltip() { return wrapperContained.showInTooltip; }
// public java.util.List tooltipText() { return wrapperContained.tooltipText; }
public boolean check(yarnwrap.block.pattern.CachedBlockPosition cachedPos) { return wrapperContained.check(cachedPos.wrapperContained); }
// public boolean canUseCache(yarnwrap.block.pattern.CachedBlockPosition pos,yarnwrap.block.pattern.CachedBlockPosition cachedPos,boolean nbtAware) { return wrapperContained.canUseCache(pos.wrapperContained,cachedPos.wrapperContained,nbtAware); }
// public boolean showInTooltip() { return wrapperContained.showInTooltip(); }
// public java.util.List getTooltipText(java.util.List blockPredicates) { return wrapperContained.getTooltipText(blockPredicates); }
public void addTooltips(java.util.function.Consumer adder) { wrapperContained.addTooltips(adder); }
public yarnwrap.item.BlockPredicatesChecker withShowInTooltip(boolean showInTooltip) { return new yarnwrap.item.BlockPredicatesChecker(wrapperContained.withShowInTooltip(showInTooltip)); }

}