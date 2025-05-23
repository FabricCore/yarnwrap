package yarnwrap.item;
public class SignItem { public net.minecraft.item.SignItem wrapperContained; public SignItem(net.minecraft.item.SignItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public SignItem(Object settings,yarnwrap.block.Block standingBlock,yarnwrap.block.Block wallBlock,yarnwrap.util.math.Direction verticalAttachmentDirection) { this.wrapperContained = new net.minecraft.item.SignItem(settings,standingBlock.wrapperContained,wallBlock.wrapperContained,verticalAttachmentDirection.wrapperContained); }
// public SignItem(yarnwrap.block.Block standingBlock,yarnwrap.block.Block wallBlock,Object settings) { this.wrapperContained = new net.minecraft.item.SignItem(standingBlock.wrapperContained,wallBlock.wrapperContained,settings); }

}