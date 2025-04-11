package yarnwrap.item;
public class PlayerHeadItem { public net.minecraft.item.PlayerHeadItem wrapperContained; public PlayerHeadItem(net.minecraft.item.PlayerHeadItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public PlayerHeadItem(yarnwrap.block.Block block,yarnwrap.block.Block wallBlock,Object settings) { this.wrapperContained = new net.minecraft.item.PlayerHeadItem(block.wrapperContained,wallBlock.wrapperContained,settings); }
// public void method_57388(yarnwrap.item.ItemStack profile) { wrapperContained.method_57388(profile.wrapperContained); }

}