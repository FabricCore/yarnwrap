package yarnwrap.item;
public class SignChangingItem { public net.minecraft.item.SignChangingItem wrapperContained; public SignChangingItem(net.minecraft.item.SignChangingItem wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean useOnSign(yarnwrap.world.World world,yarnwrap.block.entity.SignBlockEntity signBlockEntity,boolean front,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.useOnSign(world.wrapperContained,signBlockEntity.wrapperContained,front,player.wrapperContained); }
public boolean canUseOnSignText(yarnwrap.block.entity.SignText signText,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.canUseOnSignText(signText.wrapperContained,player.wrapperContained); }

}